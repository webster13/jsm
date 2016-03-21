<base id="base" href="${base}">
<#import "/spring.ftl" as spring />
<#import "ftl/layout.ftl" as layout />
<#--引入宏-->
<#import "ftl/macro.ftl" as macro />


<h3>传入参数msg：${msg}</h3>




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
