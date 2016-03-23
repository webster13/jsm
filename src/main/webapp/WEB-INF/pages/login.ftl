<#import "metronic/blank.ftl" as imBlank/>
<@imBlank.a1title strTitle="登录"/>

<@imBlank.a2cssPlugins>
<link href="${basePath}/assets/global/plugins/select2/css/select2.min.css" rel="stylesheet"
      type="text/css"/>
<link href="${basePath}/assets/global/plugins/select2/css/select2-bootstrap.min.css"
      rel="stylesheet" type="text/css"/>
</@imBlank.a2cssPlugins>


<@imBlank.a3css>
<link href="${basePath}/assets/pages/css/login-4.min.css" rel="stylesheet" type="text/css"/>
</@imBlank.a3css>


<@imBlank.a4cssThemeLayout>

</@imBlank.a4cssThemeLayout>

<@imBlank.a5body strBodyClass="login">
<!-- BEGIN LOGO -->
<div class="logo">
    <a href="#">
        <#--<img src="${basePath}/assets/jsm/img/logo_login.png">-->
        <img src="${basePath}/assets/jsm/img/logo22.png">
    </a>
</div>
<!-- END LOGO -->
<!-- BEGIN LOGIN -->
<div class="content">
    <!-- BEGIN LOGIN FORM -->
    <form class="login-form" action="${basePath}/login" method="post">

        <h4 class="form-title">请登录</h4>

        <#if msg??>
            <div class="alert alert-danger display">
                <button class="close" data-close="alert"></button>
                <span> ${msg!"空"} </span>
            </div>
        </#if>

        <div class="alert alert-danger display-hide">
            <button class="close" data-close="alert"></button>
            <span> 请输入用户名密码 </span>
        </div>
        <div class="form-group">
            <!--ie8, ie9 does not support html5 placeholder, so we just show field title for that-->
            <label class="control-label visible-ie8 visible-ie9">用户名</label>

            <div class="input-icon">
                <i class="fa fa-user"></i>
                <input class="form-control placeholder-no-fix" type="text" autocomplete="off" placeholder="用户名"
                       name="username"/></div>
        </div>
        <div class="form-group">
            <label class="control-label visible-ie8 visible-ie9">密码</label>

            <div class="input-icon">
                <i class="fa fa-lock"></i>
                <input class="form-control placeholder-no-fix" type="password" autocomplete="off" placeholder="密码"
                       name="password"/></div>
        </div>
        <div class="form-actions">
            <label class="checkbox">
                <input type="checkbox" name="rememberMe" value="1"/> 记住我 </label>
            <button type="submit" class="btn green pull-right"> 登录</button>
        </div>
        <div class="forget-password">
            <p style="text-align: center;font-size: 12px">
                2015 © LHK - 教育 让生命更美好
            </p>
        </div>

    </form>

    <!-- END LOGIN FORM FORM -->




</div>
<!-- END LOGIN -->
</@imBlank.a5body>

<@imBlank.a6jsPlugins>
    <script src="${basePath}/assets/global/plugins/jquery-validation/js/jquery.validate.min.js"
            type="text/javascript"></script>
    <script src="${basePath}/assets/global/plugins/jquery-validation/js/additional-methods.min.js"
            type="text/javascript"></script>
    <script src="${basePath}/assets/global/plugins/select2/js/select2.full.min.js"
            type="text/javascript"></script>
    <script src="${basePath}/assets/global/plugins/backstretch/jquery.backstretch.min.js"
            type="text/javascript"></script>
</@imBlank.a6jsPlugins>


<@imBlank.a7js>
    <script src="${basePath}/assets/pages/scripts/login-4.js" type="text/javascript"></script>
</@imBlank.a7js>

<@imBlank.a8jsThemeLayout>

</@imBlank.a8jsThemeLayout>