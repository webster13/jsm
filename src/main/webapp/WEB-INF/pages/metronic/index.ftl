<#import "/metronic/blank.ftl" as imBlank/>


<#macro b1Title b1StrTitle>
    <@imBlank.a1title strTitle=b1StrTitle/>
</#macro>



<#macro b2cssPlugins>
    <@imBlank.a2cssPlugins>
        <#nested >
    </@imBlank.a2cssPlugins>
</#macro>



<#macro b3css>
    <@imBlank.a3css>
        <#nested >
    </@imBlank.a3css>
</#macro>



<#macro b4content>
    <@imBlank.a4cssThemeLayout>
    <link href="${basePath}/assets/layouts/layout3/css/layout.min.css" rel="stylesheet" type="text/css"/>
    <link href="${basePath}/assets/layouts/layout3/css/themes/default.min.css" rel="stylesheet" type="text/css"
          id="style_color"/>
    <link href="${basePath}/assets/layouts/layout3/css/custom.min.css" rel="stylesheet" type="text/css"/>
    </@imBlank.a4cssThemeLayout>

    <@imBlank.a5body strBodyClass="page-container-bg-solid page-boxed">
        <#include "/metronic/header/header.ftl" />
        <#nested >
        <#include "/metronic/footer/footer.ftl"/>
    </@imBlank.a5body>
</#macro>



<#macro b5jsPlugins>
    <@imBlank.a6jsPlugins>
        <#nested >
    </@imBlank.a6jsPlugins>
</#macro>


<#macro b6js>
    <@imBlank.a7js>
        <#nested >
    </@imBlank.a7js>
    <@imBlank.a8jsThemeLayout>
    <script src="${basePath}/assets/layouts/layout3/scripts/layout.min.js" type="text/javascript"></script>
    <script src="${basePath}/assets/layouts/layout3/scripts/demo.min.js" type="text/javascript"></script>
    <script src="${basePath}/assets/layouts/global/scripts/quick-sidebar.min.js" type="text/javascript"></script>
    </@imBlank.a8jsThemeLayout>

</#macro>