<#macro baseFtl>
<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en">
<!--<![endif]-->
    <#include "/base/component/head.ftl"/>


<body class="page-header-fixed page-sidebar-closed-hide-logo page-content-white">

    <#include "/base/component/header/header.ftl"/>

<!-- BEGIN HEADER & CONTENT DIVIDER 清屏，以下开始页面内容-->
<div class="clearfix"></div>
<!-- END HEADER & CONTENT DIVIDER 清屏，以下开始页面内容-->


    <#include "/base/component/container/container.ftl"/>
    <#include "/base/component/footer.ftl"/>
    <#include "/base/component/js.ftl"/>
</body>
</html>
</#macro>