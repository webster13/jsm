<#macro baseHead headTitle>
<#--html起始标签-->
    <#include "/base/component/unchangeable/beginning.ftl"/>
    <#import "/base/component/head_css.ftl" as head/>
    <@head.headFtl title=headTitle>
    <#--此处填写自定义的css-->
        <#nested>
    </@head.headFtl>
</#macro>




<#macro baseBody>
<body class="page-header-fixed page-sidebar-closed-hide-logo page-content-white">
    <#include "/base/component/header.ftl"/>

<#--清除浮动-->
    <#include "/base/component/unchangeable/clearfix.ftl"/>
    <#include "/base/component/container.ftl"/>
</#macro>



<#macro baseFoot>
    <#include "/base/component/footer.ftl"/>
    <#import "/base/component/foot_js.ftl" as foot/>
    <@foot.footFtl >
    <#--此处填写自定义的js-->
        <#nested>
    </@foot.footFtl>
</body>
<#--html结束标签-->
    <#include "/base/component/unchangeable/ending.ftl"/>
</#macro>