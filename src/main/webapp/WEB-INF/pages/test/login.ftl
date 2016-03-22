<#import "metronic/blank.ftl" as imBlank/>
<@imBlank.a1title strTitle="登录"/>

<@imBlank.a2cssPlugins>
<link href="${basePath}/static/metronic/assets/global/plugins/select2/css/select2.min.css" rel="stylesheet"
      type="text/css"/>
<link href="${basePath}/static/metronic/assets/global/plugins/select2/css/select2-bootstrap.min.css"
      rel="stylesheet" type="text/css"/>
</@imBlank.a2cssPlugins>


<@imBlank.a3css>
<link href="${basePath}/static/metronic/assets/pages/css/login-4.min.css" rel="stylesheet" type="text/css"/>
</@imBlank.a3css>


<@imBlank.a4cssThemeLayout>

</@imBlank.a4cssThemeLayout>

<@imBlank.a5body strBodyClass="login">
<!-- BEGIN LOGO -->
<div class="logo">
    <a href="#" style="text-decoration:none;height: 100%">
        <span class=" jsm-logo logo-big logo-en">LHK</span>
        <span class=" jsm-logo logo-big logo-cn">小哈佛教育集团</span>
    </a>
</div>
<!-- END LOGO -->
<!-- BEGIN LOGIN -->
<div class="content">
    <!-- BEGIN LOGIN FORM -->
    <form class="login-form" action="${basePath}/login" method="post">

        <div style="padding: 12px">&nbsp;</div>

        <#if msg??>
            <div class="alert alert-danger display-hide">
                <button class="close" data-close="alert"></button>
                <span> ${msg} </span>
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


    </form>
    <!-- END LOGIN FORM -or
</div>
<!-- END LOGIN -->
</@imBlank.a5body>

<@imBlank.a6jsPlugins>
    <script src="${basePath}/static/metronic/assets/global/plugins/jquery-validation/js/jquery.validate.min.js"
            type="text/javascript"></script>
    <script src="${basePath}/static/metronic/assets/global/plugins/jquery-validation/js/additional-methods.min.js"
            type="text/javascript"></script>
    <script src="${basePath}/static/metronic/assets/global/plugins/select2/js/select2.full.min.js"
            type="text/javascript"></script>
    <script src="${basePath}/static/metronic/assets/global/plugins/backstretch/jquery.backstretch.min.js"
            type="text/javascript"></script>
</@imBlank.a6jsPlugins>


<@imBlank.a7js>
    <script src="${basePath}/static/metronic/assets/pages/scripts/login-4.js" type="text/javascript"></script>
</@imBlank.a7js>

<@imBlank.a8jsThemeLayout>

</@imBlank.a8jsThemeLayout>