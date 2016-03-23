<#import "metronic/index.ftl" as imIndex/>

<#--1标题-->
<@imIndex.b1Title b1StrTitle="首页"/>


<#--2css插件-->
<@imIndex.b2cssPlugins>

</@imIndex.b2cssPlugins>


<#--3css-->
<@imIndex.b3css>

</@imIndex.b3css>


<#--4内容-->
<@imIndex.b4content>
<!-- BEGIN CONTAINER -->
<div class="page-container">
    <!-- BEGIN CONTENT -->
    <div class="page-content-wrapper">
        <!-- BEGIN CONTENT BODY -->
        <!-- BEGIN PAGE CONTENT BODY -->
        <div class="page-content">
            <div class="container">
                <#include "/metronic/compont/breadcrumb.ftl"/>
                <!-- BEGIN PAGE CONTENT INNER -->
                <div class="page-content-inner">
                    <div class="note note-info">
                        <p>内容</p>
                    </div>
                </div>
                <!-- END PAGE CONTENT INNER -->
            </div>
        </div>
        <!-- END PAGE CONTENT BODY -->
        <!-- END CONTENT BODY -->
    </div>
    <!-- END CONTENT -->
</div>
<!-- END CONTAINER -->
</@imIndex.b4content>


<#--5js插件-->
<@imIndex.b5jsPlugins>

</@imIndex.b5jsPlugins>

<#--6js-->
<@imIndex.b6js>

</@imIndex.b6js>


