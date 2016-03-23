<#import "/metronic/index.ftl" as imIndex/>

<#--1标题-->
<@imIndex.b1Title b1StrTitle="首页"/>


<#--2css插件-->
<@imIndex.b2cssPlugins>
<link href="${basepath}/assets/global/plugins/jstree/dist/themes/default/style.min.css" rel="stylesheet" type="text/css" />
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

                    <div class="col-md-6">
                        <div class="portlet light ">
                            <div class="portlet-title">
                                <div class="caption">
                                    <i class="icon-social-dribbble font-blue-sharp"></i>
                                    <span class="caption-subject font-blue-sharp bold uppercase">Default Tree</span>
                                </div>
                                <div class="actions">
                                    <a class="btn btn-circle btn-icon-only btn-default" href="javascript:;">
                                        <i class="icon-cloud-upload"></i>
                                    </a>
                                    <a class="btn btn-circle btn-icon-only btn-default" href="javascript:;">
                                        <i class="icon-wrench"></i>
                                    </a>
                                    <a class="btn btn-circle btn-icon-only btn-default" href="javascript:;">
                                        <i class="icon-trash"></i>
                                    </a>
                                </div>
                            </div>
                            <div class="portlet-body">
                                <div id="tree_1" class="tree-demo jstree jstree-1 jstree-default" role="tree" aria-multiselectable="true" tabindex="0" aria-activedescendant="j1_5" aria-busy="false"><ul class="jstree-container-ul jstree-children" role="group"><li role="treeitem" aria-selected="false" aria-level="1" aria-labelledby="j1_1_anchor" aria-expanded="true" id="j1_1" class="jstree-node  jstree-open"><i class="jstree-icon jstree-ocl" role="presentation"></i><a class="jstree-anchor" href="#" tabindex="-1" id="j1_1_anchor"><i class="jstree-icon jstree-themeicon fa fa-folder icon-state-warning icon-lg jstree-themeicon-custom" role="presentation"></i> Root node 1
                                </a><ul role="group" class="jstree-children"><li role="treeitem" data-jstree="{ &quot;selected&quot; : true }" aria-selected="true" aria-level="2" aria-labelledby="j1_2_anchor" id="j1_2" class="jstree-node  jstree-leaf"><i class="jstree-icon jstree-ocl" role="presentation"></i><a class="jstree-anchor  jstree-clicked" href="javascript:;" tabindex="-1" id="j1_2_anchor"><i class="jstree-icon jstree-themeicon fa fa-folder icon-state-warning icon-lg jstree-themeicon-custom" role="presentation"></i> Initially selected </a></li><li role="treeitem" data-jstree="{ &quot;icon&quot; : &quot;fa fa-briefcase icon-state-success &quot; }" aria-selected="false" aria-level="2" aria-labelledby="j1_3_anchor" id="j1_3" class="jstree-node  jstree-leaf"><i class="jstree-icon jstree-ocl" role="presentation"></i><a class="jstree-anchor" href="#" tabindex="-1" id="j1_3_anchor"><i class="jstree-icon jstree-themeicon fa fa-briefcase icon-state-success  jstree-themeicon-custom" role="presentation"></i> custom icon URL </a></li><li role="treeitem" data-jstree="{ &quot;opened&quot; : true }" aria-selected="false" aria-level="2" aria-labelledby="j1_4_anchor" aria-expanded="true" id="j1_4" class="jstree-node  jstree-open"><i class="jstree-icon jstree-ocl" role="presentation"></i><a class="jstree-anchor" href="#" tabindex="-1" id="j1_4_anchor"><i class="jstree-icon jstree-themeicon fa fa-folder icon-state-warning icon-lg jstree-themeicon-custom" role="presentation"></i> initially open
                                </a><ul role="group" class="jstree-children"><li role="treeitem" data-jstree="{ &quot;disabled&quot; : true }" aria-selected="false" aria-level="3" aria-labelledby="j1_5_anchor" aria-disabled="true" id="j1_5" class="jstree-node  jstree-leaf"><i class="jstree-icon jstree-ocl" role="presentation"></i><a class="jstree-anchor  jstree-disabled" href="#" tabindex="-1" id="j1_5_anchor"><i class="jstree-icon jstree-themeicon fa fa-folder icon-state-warning icon-lg jstree-themeicon-custom" role="presentation"></i> Disabled Node </a></li><li role="treeitem" data-jstree="{ &quot;type&quot; : &quot;file&quot; }" aria-selected="false" aria-level="3" aria-labelledby="j1_6_anchor" id="j1_6" class="jstree-node  jstree-leaf jstree-last"><i class="jstree-icon jstree-ocl" role="presentation"></i><a class="jstree-anchor" href="#" tabindex="-1" id="j1_6_anchor"><i class="jstree-icon jstree-themeicon fa fa-file icon-state-warning icon-lg jstree-themeicon-custom" role="presentation"></i> Another node </a></li></ul></li><li role="treeitem" data-jstree="{ &quot;icon&quot; : &quot;fa fa-warning icon-state-danger&quot; }" aria-selected="false" aria-level="2" aria-labelledby="j1_7_anchor" id="j1_7" class="jstree-node  jstree-leaf jstree-last"><i class="jstree-icon jstree-ocl" role="presentation"></i><a class="jstree-anchor" href="#" tabindex="-1" id="j1_7_anchor"><i class="jstree-icon jstree-themeicon fa fa-warning icon-state-danger jstree-themeicon-custom" role="presentation"></i> Custom icon class (bootstrap) </a></li></ul></li><li role="treeitem" data-jstree="{ &quot;type&quot; : &quot;file&quot; }" aria-selected="false" aria-level="1" aria-labelledby="j1_8_anchor" id="j1_8" class="jstree-node  jstree-leaf jstree-last"><i class="jstree-icon jstree-ocl" role="presentation"></i><a class="jstree-anchor" href="http://www.jstree.com" tabindex="-1" id="j1_8_anchor"><i class="jstree-icon jstree-themeicon fa fa-file icon-state-warning icon-lg jstree-themeicon-custom" role="presentation"></i> Clickanle link node </a></li></ul></div>
                            </div>
                        </div>
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
<script src="${basePath}/assets/global/plugins/jstree/dist/jstree.min.js" type="text/javascript"></script>
</@imIndex.b5jsPlugins>

<#--6js-->
<@imIndex.b6js>
<script src="${basePath}/assets/pages/scripts/ui-tree.min.js" type="text/javascript"></script>

</@imIndex.b6js>


