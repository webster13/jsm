<#macro a1title strTitle>
<!DOCTYPE html>
<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en">
<!--<![endif]-->


<!-- BEGIN HEAD -->
<head>
    <meta charset="utf-8"/>
    <title>${strTitle!"expectTitle"}</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta content="width=device-width, initial-scale=1" name="viewport"/>
    <meta content="" name="description"/>
    <meta content="" name="author"/>
</#macro>


<#macro a2cssPlugins>

    <!-- BEGIN GLOBAL MANDATORY STYLES -->
    <link href="${basePath}/assets/jsm/css/font-google.css" rel="stylesheet" type="text/css"/>
    <link href="${basePath}/assets/global/plugins/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
    <link href="${basePath}/assets/global/plugins/simple-line-icons/simple-line-icons.min.css" rel="stylesheet" type="text/css"/>
    <link href="${basePath}/assets/global/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    <link href="${basePath}/assets/global/plugins/uniform/css/uniform.default.css" rel="stylesheet" type="text/css"/>
    <link href="${basePath}/assets/global/plugins/bootstrap-switch/css/bootstrap-switch.min.css" rel="stylesheet" type="text/css"/>
    <!-- END GLOBAL MANDATORY STYLES -->

    <!-- BEGIN PAGE LEVEL PLUGINS -->
    <#nested>
    <!-- END PAGE LEVEL PLUGINS -->
</#macro>


<#macro a3css>
    <!-- BEGIN THEME GLOBAL STYLES -->
    <link href="${basePath}/assets/global/css/components.min.css" rel="stylesheet" id="style_components" type="text/css"/>
    <link href="${basePath}/assets/global/css/plugins.min.css" rel="stylesheet" type="text/css"/>
    <!-- END THEME GLOBAL STYLES -->

    <!-- BEGIN PAGE LEVEL STYLES -->
    <link href="${basePath}/assets/jsm/css/base.css" rel="stylesheet" type="text/css"/>
    <#nested>
    <!-- END PAGE LEVEL STYLES -->
</#macro>


<#macro a4cssThemeLayout>
    <!-- BEGIN THEME LAYOUT STYLES -->
    <#nested>
    <!-- END THEME LAYOUT STYLES -->
</#macro>

<#macro a5body strBodyClass>
    <link rel="shortcut icon" href="${basePath}/assets/jsm/img/favicon.ico"/>
</head>
<!-- END HEAD -->
<body class="${strBodyClass!"expectBodyClass"}">
    <#nested>
</#macro>


<#macro a6jsPlugins>
<!--[if lt IE 9]>
<script src="${basePath}/assets/global/plugins/respond.min.js"></script>
<script src="${basePath}/assets/global/plugins/excanvas.min.js"></script>
<![endif]-->
<!-- BEGIN CORE PLUGINS -->
<script src="${basePath}/assets/global/plugins/jquery.min.js" type="text/javascript"></script>
<script src="${basePath}/assets/global/plugins/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
<script src="${basePath}/assets/global/plugins/js.cookie.min.js" type="text/javascript"></script>
<script src="${basePath}/assets/global/plugins/bootstrap-hover-dropdown/bootstrap-hover-dropdown.min.js" type="text/javascript"></script>
<script src="${basePath}/assets/global/plugins/jquery-slimscroll/jquery.slimscroll.min.js" type="text/javascript"></script>
<script src="${basePath}/assets/global/plugins/jquery.blockui.min.js" type="text/javascript"></script>
<script src="${basePath}/assets/global/plugins/uniform/jquery.uniform.min.js" type="text/javascript"></script>
<script src="${basePath}/assets/global/plugins/bootstrap-switch/js/bootstrap-switch.min.js" type="text/javascript"></script>
<!-- END CORE PLUGINS -->

<!-- BEGIN PAGE LEVEL PLUGINS -->
    <#nested>
<!-- END PAGE LEVEL PLUGINS -->
</#macro>

<#macro a7js>

<!-- BEGIN THEME GLOBAL SCRIPTS -->
<script src="${basePath}/assets/global/scripts/app.min.js" type="text/javascript"></script>
<!-- END THEME GLOBAL SCRIPTS -->

<!-- BEGIN PAGE LEVEL SCRIPTS -->
    <#nested>
<!-- END PAGE LEVEL SCRIPTS -->
</#macro>

<#macro a8jsThemeLayout>
<!-- BEGIN THEME LAYOUT SCRIPTS -->
    <#nested>
<!-- END THEME LAYOUT SCRIPTS -->
</body>
</html>
</#macro>
