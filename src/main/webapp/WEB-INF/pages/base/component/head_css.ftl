<#macro headFtl title>
<!-- BEGIN HEAD -->
<head>
    <meta charset="utf-8"/>
    <title>${title}</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta content="width=device-width, initial-scale=1" name="viewport"/>
    <meta content="" name="description"/>
    <meta content="" name="author"/>
    <!-- BEGIN GLOBAL MANDATORY STYLES -->
    <link href="${basePath}/assets/jsm/css/font-google.css" rel="stylesheet" type="text/css"/>
    <link href="${basePath}/assets/global/plugins/font-awesome/css/font-awesome.min.css"
          rel="stylesheet" type="text/css"/>
    <link href="${basePath}/assets/global/plugins/simple-line-icons/simple-line-icons.min.css"
          rel="stylesheet" type="text/css"/>
    <link href="${basePath}/assets/global/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet"
          type="text/css"/>
    <link href="${basePath}/assets/global/plugins/uniform/css/uniform.default.css" rel="stylesheet"
          type="text/css"/>
    <link href="${basePath}/assets/global/plugins/bootstrap-switch/css/bootstrap-switch.min.css"
          rel="stylesheet" type="text/css"/>
    <!-- END GLOBAL MANDATORY STYLES -->
    <!-- BEGIN THEME GLOBAL STYLES -->
    <link href="${basePath}/assets/global/css/components.min.css" rel="stylesheet" id="style_components"
          type="text/css"/>
    <link href="${basePath}/assets/global/css/plugins.min.css" rel="stylesheet" type="text/css"/>
    <!-- END THEME GLOBAL STYLES -->
    <!-- BEGIN THEME LAYOUT STYLES -->
    <link href="${basePath}/assets/layouts/layout/css/layout.min.css" rel="stylesheet" type="text/css"/>
    <link href="${basePath}/assets/layouts/layout/css/themes/darkblue.min.css" rel="stylesheet"
          type="text/css" id="style_color"/>
    <link href="${basePath}/assets/layouts/layout/css/custom.min.css" rel="stylesheet" type="text/css"/>
    <!-- END THEME LAYOUT STYLES -->
    <link rel="shortcut icon" href="${basePath}/assets/jsm/img/favicon.ico"/>
    <link href="${basePath}/assets/jsm/css/base.css" rel="stylesheet" type="text/css"/>

    <!-- BEGIN 自定义css -->

    <#nested>

    <!-- END 自定义css -->

</head>
<!-- END HEAD -->
</#macro>