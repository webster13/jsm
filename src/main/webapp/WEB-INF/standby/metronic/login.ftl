<!DOCTYPE html>
<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en">
<!--<![endif]-->
<!-- BEGIN HEAD -->

<head>
    <meta charset="utf-8"/>
    <title>${strTitle!空标题}</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta content="width=device-width, initial-scale=1" name="viewport"/>
    <meta content="" name="description"/>
    <meta content="" name="author"/>
    <!-- BEGIN GLOBAL MANDATORY STYLES -->
    <link href="${basePath}/static/jsm/css/font-google.css" rel="stylesheet" type="text/css"/>
    <link href="${basePath}/static/metronic/assets/global/plugins/font-awesome/css/font-awesome.min.css"
          rel="stylesheet" type="text/css"/>
    <link href="${basePath}/static/metronic/assets/global/plugins/simple-line-icons/simple-line-icons.min.css"
          rel="stylesheet" type="text/css"/>
    <link href="${basePath}/static/metronic/assets/global/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet"
          type="text/css"/>
    <link href="${basePath}/static/metronic/assets/global/plugins/uniform/css/uniform.default.css" rel="stylesheet"
          type="text/css"/>
    <link href="${basePath}/static/metronic/assets/global/plugins/bootstrap-switch/css/bootstrap-switch.min.css"
          rel="stylesheet" type="text/css"/>
    <!-- END GLOBAL MANDATORY STYLES -->
    <!-- BEGIN PAGE LEVEL PLUGINS -->
<#macro cssPlugins>
    <#nested>
</#macro>
    <!-- END PAGE LEVEL PLUGINS -->
    <!-- BEGIN THEME GLOBAL STYLES -->
    <link href="${basePath}/static/metronic/assets/global/css/components.min.css" rel="stylesheet" id="style_components"
          type="text/css"/>
    <link href="${basePath}/static/metronic/assets/global/css/plugins.min.css" rel="stylesheet" type="text/css"/>
    <!-- END THEME GLOBAL STYLES -->
    <!-- BEGIN PAGE LEVEL STYLES -->
<#macro css>
    <#nested>
</#macro>
    <!-- END PAGE LEVEL STYLES -->
    <!-- BEGIN THEME LAYOUT STYLES -->
<#macro cssThemeLayout>
    <#nested>
</#macro>
    <!-- END THEME LAYOUT STYLES -->
    <link rel="shortcut icon" href="${basePath}/static/jsm/img/favicon.ico"/>
</head>
<!-- END HEAD -->

<body class="${strBodyClass!空body类}">

<!--[if lt IE 9]>
<script src="${basePath}/static/metronic/assets/global/plugins/respond.min.js"></script>
<script src="${basePath}/static/metronic/assets/global/plugins/excanvas.min.js"></script>
<![endif]-->
<!-- BEGIN CORE PLUGINS -->
<script src="${basePath}/static/metronic/assets/global/plugins/jquery.min.js" type="text/javascript"></script>
<script src="${basePath}/static/metronic/assets/global/plugins/bootstrap/js/bootstrap.min.js"
        type="text/javascript"></script>
<script src="${basePath}/static/metronic/assets/global/plugins/js.cookie.min.js" type="text/javascript"></script>
<script src="${basePath}/static/metronic/assets/global/plugins/bootstrap-hover-dropdown/bootstrap-hover-dropdown.min.js"
        type="text/javascript"></script>
<script src="${basePath}/static/metronic/assets/global/plugins/jquery-slimscroll/jquery.slimscroll.min.js"
        type="text/javascript"></script>
<script src="${basePath}/static/metronic/assets/global/plugins/jquery.blockui.min.js" type="text/javascript"></script>
<script src="${basePath}/static/metronic/assets/global/plugins/uniform/jquery.uniform.min.js"
        type="text/javascript"></script>
<script src="${basePath}/static/metronic/assets/global/plugins/bootstrap-switch/js/bootstrap-switch.min.js"
        type="text/javascript"></script>
<!-- END CORE PLUGINS -->
<!-- BEGIN PAGE LEVEL PLUGINS -->
<#macro jsPlugins>
    <#nested>
</#macro>
<!-- END PAGE LEVEL PLUGINS -->

<!-- BEGIN THEME GLOBAL SCRIPTS -->
<script src="${basePath}/static/metronic/assets/global/scripts/app.min.js" type="text/javascript"></script>
<!-- END THEME GLOBAL SCRIPTS -->

<!-- BEGIN PAGE LEVEL SCRIPTS -->
<#macro js>
    <#nested>
</#macro>
<!-- END PAGE LEVEL SCRIPTS -->

<!-- BEGIN THEME LAYOUT SCRIPTS -->
<#macro jsThemeLayout>
    <#nested>
</#macro>
<!-- END THEME LAYOUT SCRIPTS -->
</body>

</html>