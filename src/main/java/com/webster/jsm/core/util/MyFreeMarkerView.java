package com.webster.jsm.core.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.view.freemarker.FreeMarkerView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * 自定义FreeMarker视图解析器
 * 为了添加项目绝对路径
 * 详见http://my.oschina.net/pagecorrect/blog/610037?fromerr=x5FM3lDy
 * Created by Webster on 16/3/13.
 */
public class MyFreeMarkerView extends FreeMarkerView {

    private static final Logger logger = LoggerFactory.getLogger(MyFreeMarkerView.class);
    private static final String CONTEXT_PATH = "basePath";
    @Override
    protected void exposeHelpers(Map<String, Object> model,
                                 HttpServletRequest request) throws Exception {
        String scheme = request.getScheme();
        String serverName = request.getServerName();
        int port = request.getServerPort();
        String path = request.getContextPath();
        String basePath = scheme + "://" + serverName + ":" + port + path;
        model.put(CONTEXT_PATH, basePath);
        logger.info("=====添加绝对路径======" + basePath);
        super.exposeHelpers(model, request);
    }
}