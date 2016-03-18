package com.webster.jsm.core.security.filter;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * 自定义表单过滤器，只是的添加了几个异常扑捉，之后输出到views
 * Created by Webster on 2016/3/8.
 */
public class MyFormAuthenticationFilter extends FormAuthenticationFilter {


    private final static Logger logger = LoggerFactory.getLogger(MyFormAuthenticationFilter.class);

    /**
     *回调函数，在登录失败时
     */
    @Override
    protected boolean onLoginFailure(AuthenticationToken token, AuthenticationException e, ServletRequest request, ServletResponse response) {

        String className = e.getClass().getName(), message;

        if (IncorrectCredentialsException.class.getName().equals(className)){
            message = "用户或密码错误";
        }
        else if(UnknownAccountException.class.getName().equals(className)){
            message = "帐号不存在";
        }
        else if(ExcessiveAttemptsException .class.getName().equals(className)){
            message = "错误次数过多,帐户锁定10分钟";
        }
        else if (e.getMessage() != null && StringUtils.startsWith(e.getMessage(), "msg:")){
            message = StringUtils.replace(e.getMessage(), "msg:", "");
        }
        else{
            message = "系统出现点问题，请稍后再试，或联系系统管理员！";
            logger.debug(message + "错误信息：" + e);
        }
        logger.debug("登录失败:{}", message);

        /*将msg绑定到request请求数据,从而输出到view*/
        request.setAttribute(getFailureKeyAttribute(), className);
        request.setAttribute("msg", message);

        return super.onLoginFailure(token, e, request, response);
    }

    /**
     *回调函数，在登录成功时
     */
    @Override
    protected boolean onLoginSuccess(AuthenticationToken token, Subject subject, ServletRequest request, ServletResponse response) throws Exception {
        logger.debug("登录成功：登录信息={},用户信息={}", token, subject);
        return super.onLoginSuccess(token, subject, request, response);
    }

}
