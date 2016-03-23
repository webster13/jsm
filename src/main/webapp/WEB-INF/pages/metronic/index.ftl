<#macro indexFtl inTitle>
    <#import "/metronic/blank.ftl" as imBlank/>

    <@imBlank.a1title strTitle=inTitle/>

    <@imBlank.a2cssPlugins>

    </@imBlank.a2cssPlugins>

    <@imBlank.a3css>

    </@imBlank.a3css>

    <@imBlank.a4cssThemeLayout>
    <link href="${basePath}/assets/layouts/layout3/css/layout.min.css" rel="stylesheet" type="text/css"/>
    <link href="${basePath}/assets/layouts/layout3/css/themes/default.min.css" rel="stylesheet" type="text/css" id="style_color"/>
    <link href="${basePath}/assets/layouts/layout3/css/custom.min.css" rel="stylesheet" type="text/css"/>
    </@imBlank.a4cssThemeLayout>



    <@imBlank.a5body strBodyClass="page-container-bg-solid page-boxed">

        <#include "/metronic/header/header.ftl" />
        <#include "/metronic/container/container.ftl" />
        <#--<#nested>-->
        <#include "/metronic/footer/footer.ftl"/>



    </@imBlank.a5body>



    <@imBlank.a6jsPlugins>


    </@imBlank.a6jsPlugins>


    <@imBlank.a7js>

    </@imBlank.a7js>

    <@imBlank.a8jsThemeLayout>
    <script src="${basePath}/assets/layouts/layout3/scripts/layout.min.js" type="text/javascript"></script>
    <script src="${basePath}/assets/layouts/layout3/scripts/demo.min.js" type="text/javascript"></script>
    <script src="${basePath}/assets/layouts/global/scripts/quick-sidebar.min.js" type="text/javascript"></script>
    </@imBlank.a8jsThemeLayout>

</#macro>