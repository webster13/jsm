<#include "/base/component/unchangeable/beginning.ftl"/>

<#import "/base/component/unchangeable/headTitle.ftl" as imTitle/>
<@ imTitle.tpTitle strTitle="登录"/>


<#import "/base/component/unchangeable/cssPlugins.ftl" as imCssPlugins>
<@imCssPlugins>
<#--页面级css库-->
<link href="${basePath}/static/metronic/assets/global/plugins/select2/css/select2.min.css" rel="stylesheet"
      type="text/css"/>
<link href="${basePath}/static/metronic/assets/global/plugins/select2/css/select2-bootstrap.min.css" rel="stylesheet"
      type="text/css"/>
</@imCssPlugins>


<#import "/base/component/unchangeable/css.ftl" as imCss>
<@imCss>
<#--页面级css-->
<link href="${basePath}/static/metronic/assets/pages/css/login-4.min.css" rel="stylesheet" type="text/css"/>
</@imCss>


<link rel="shortcut icon" href="${basePath}/static/jsm/img/favicon.ico"/>

<!-- END HEAD -->

<body class=" login">
<!-- BEGIN LOGO -->
<div class="logo">

    <a href="#" style="text-decoration:none;height: 100%">
        <span class="logo-default logo logo_en">LHK</span>
        <span class="logo-default logo logo_cn">教育集团</span>
    </a>
</div>
<!-- END LOGO -->


<!-- BEGIN LOGIN -->
<div class="content">
    <!-- BEGIN LOGIN FORM -->
    <form class="login-form" action="index.html" method="post">
        <h3 class="form-title">Login to your account</h3>

        <div class="alert alert-danger display-hide">
            <button class="close" data-close="alert"></button>
            <span> Enter any username and password. </span>
        </div>
        <div class="form-group">
            <!--ie8, ie9 does not support html5 placeholder, so we just show field title for that-->
            <label class="control-label visible-ie8 visible-ie9">Username</label>

            <div class="input-icon">
                <i class="fa fa-user"></i>
                <input class="form-control placeholder-no-fix" type="text" autocomplete="off" placeholder="Username"
                       name="username"/></div>
        </div>
        <div class="form-group">
            <label class="control-label visible-ie8 visible-ie9">Password</label>

            <div class="input-icon">
                <i class="fa fa-lock"></i>
                <input class="form-control placeholder-no-fix" type="password" autocomplete="off" placeholder="Password"
                       name="password"/></div>
        </div>
        <div class="form-actions">
            <label class="checkbox">
                <input type="checkbox" name="remember" value="1"/> Remember me </label>
            <button type="submit" class="btn green pull-right"> Login</button>
        </div>

    </form>
    <!-- END LOGIN FORM -->

</div>
<!-- END LOGIN -->
<!-- BEGIN COPYRIGHT -->
<div class="copyright"> 2014 &copy; Metronic - Admin Dashboard Template.</div>
<!-- END COPYRIGHT -->



<#import "/base/component/unchangeable/jsPlugins.ftl" as imJsPlugins>
<@imJsPlugins>
<#--页面级js插件-->
<script src="${basePath}/static/metronic/assets/global/plugins/jquery-validation/js/jquery.validate.min.js"
        type="text/javascript"></script>
<script src="${basePath}/static/metronic/assets/global/plugins/jquery-validation/js/additional-methods.min.js"
        type="text/javascript"></script>
<script src="${basePath}/static/metronic/assets/global/plugins/select2/js/select2.full.min.js"
        type="text/javascript"></script>
<script src="${basePath}/static/metronic/assets/global/plugins/backstretch/jquery.backstretch.min.js"
        type="text/javascript"></script>
</@imJsPlugins>



<#import "/base/component/unchangeable/js.ftl" as imJs>
<@imJs>
<#--页面级js-->
<script src="${basePath}/static/metronic/assets/pages/scripts/login-4.min.js" type="text/javascript"></script>
</@imJs>



<#include "/base/component/unchangeable/ending.ftl"/>
