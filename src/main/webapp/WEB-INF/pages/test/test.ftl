<base id="base" href="${base}">
<#import "/spring.ftl" as spring />
<#import "ftl/layout.ftl" as layout />
<#--引入宏-->
<#import "ftl/macro.ftl" as macro />

<h3>传参，数组names：${names[0]}
    <#--使用if-->
    Welcome <#if names[0] == "Webster">, our beloved leader</#if></h3>
<h3>传参，字符串car：${car}</h3>


<#--使用宏-->
<@layout.realtimeLayout>
<h3>我是嵌套的内容</h3>
    <#--宏内的嵌套-->
    <@macro.greet person="vince" color="black"/>
    <h4>
        meeting
    </h4>
    <#--重复使用宏-->
    <@macro.greet person="linda" color="red"/>
</@layout.realtimeLayout>
