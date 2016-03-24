<#import "/metronic/index.ftl" as imIndex/>

<#--1标题-->
<@imIndex.b1Title b1StrTitle="首页"/>


<#--2css插件-->
<@imIndex.b2cssPlugins>
<link href="${basepath}/assets/global/plugins/jstree/dist/themes/default/style.min.css" rel="stylesheet" type="text/css"/>
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
                        <div class="portlet red-pink box">
                            <div class="portlet-title">
                                <div class="caption">
                                    <i class="fa fa-cogs"></i>Ajax Tree with Drag &amp; Drop
                                </div>
                                <div class="tools">
                                    <a href="javascript:;" class="collapse" data-original-title="" title=""> </a>
                                    <a href="#portlet-config" data-toggle="modal" class="config" data-original-title="" title=""> </a>
                                    <a href="javascript:;" class="reload" data-original-title="" title=""> </a>
                                    <a href="javascript:;" class="remove" data-original-title="" title=""> </a>
                                </div>
                            </div>
                            <div class="portlet-body">
                                <div id="tree_4" class="tree-demo jstree jstree-4 jstree-default" role="tree" aria-multiselectable="true" tabindex="0"
                                     aria-activedescendant="node_145878030229450" aria-busy="false">
                                    <ul class="jstree-container-ul jstree-children" role="group">
                                        <li role="treeitem" aria-selected="false" aria-level="1" aria-labelledby="node_145878029054389_anchor"
                                            aria-expanded="true" id="node_145878029054389" class="jstree-node jstree-open" aria-busy="false"><i
                                                class="jstree-icon jstree-ocl" role="presentation"></i><a class="jstree-anchor" href="#" tabindex="-1"
                                                                                                          id="node_145878029054389_anchor"><i
                                                class="jstree-icon jstree-themeicon fa fa-folder icon-lg icon-state-warning jstree-themeicon-custom"
                                                role="presentation"></i>Node #1</a>
                                            <ul role="group" class="jstree-children" style="">
                                                <li role="treeitem" aria-selected="false" aria-level="2" aria-labelledby="node_145878030466764_anchor"
                                                    aria-expanded="false" id="node_145878030466764" class="jstree-node  jstree-closed"><i
                                                        class="jstree-icon jstree-ocl" role="presentation"></i><a class="jstree-anchor" href="#" tabindex="-1"
                                                                                                                  id="node_145878030466764_anchor"><i
                                                        class="jstree-icon jstree-themeicon fa fa-folder icon-lg icon-state-success jstree-themeicon-custom"
                                                        role="presentation"></i>Node 1458780304</a></li>
                                                <li role="treeitem" aria-selected="false" aria-level="2" aria-labelledby="node_145878030471747_anchor"
                                                    aria-expanded="false" id="node_145878030471747" class="jstree-node  jstree-closed"><i
                                                        class="jstree-icon jstree-ocl" role="presentation"></i><a class="jstree-anchor" href="#" tabindex="-1"
                                                                                                                  id="node_145878030471747_anchor"><i
                                                        class="jstree-icon jstree-themeicon fa fa-folder icon-lg icon-state-warning jstree-themeicon-custom"
                                                        role="presentation"></i>Node 1458780304</a></li>
                                                <li role="treeitem" aria-selected="false" aria-level="2" aria-labelledby="node_145878030431992_anchor"
                                                    aria-expanded="false" id="node_145878030431992" class="jstree-node  jstree-closed jstree-last"><i
                                                        class="jstree-icon jstree-ocl" role="presentation"></i><a class="jstree-anchor" href="#" tabindex="-1"
                                                                                                                  id="node_145878030431992_anchor"><i
                                                        class="jstree-icon jstree-themeicon fa fa-folder icon-lg icon-state-success jstree-themeicon-custom"
                                                        role="presentation"></i>Node 1458780304</a></li>
                                            </ul>
                                        </li>
                                        <li role="treeitem" aria-selected="false" aria-level="1" aria-labelledby="node_145878029081705_anchor"
                                            aria-expanded="true" id="node_145878029081705" class="jstree-node jstree-open" aria-busy="false"><i
                                                class="jstree-icon jstree-ocl" role="presentation"></i><a class="jstree-anchor" href="#" tabindex="-1"
                                                                                                          id="node_145878029081705_anchor"><i
                                                class="jstree-icon jstree-themeicon fa fa-folder icon-lg icon-state-success jstree-themeicon-custom"
                                                role="presentation"></i>Node #2</a>
                                            <ul role="group" class="jstree-children" style="">
                                                <li role="treeitem" aria-selected="false" aria-level="2" aria-labelledby="node_145878030253504_anchor"
                                                    aria-expanded="false" id="node_145878030253504" class="jstree-node  jstree-closed"><i
                                                        class="jstree-icon jstree-ocl" role="presentation"></i><a class="jstree-anchor" href="#" tabindex="-1"
                                                                                                                  id="node_145878030253504_anchor"><i
                                                        class="jstree-icon jstree-themeicon fa fa-folder icon-lg icon-state-danger jstree-themeicon-custom"
                                                        role="presentation"></i>Node 1458780302</a></li>
                                                <li role="treeitem" aria-selected="false" aria-level="2" aria-labelledby="node_145878030256644_anchor"
                                                    aria-expanded="false" id="node_145878030256644" class="jstree-node  jstree-closed"><i
                                                        class="jstree-icon jstree-ocl" role="presentation"></i><a class="jstree-anchor" href="#" tabindex="-1"
                                                                                                                  id="node_145878030256644_anchor"><i
                                                        class="jstree-icon jstree-themeicon fa fa-file icon-lg icon-state-warning jstree-themeicon-custom"
                                                        role="presentation"></i>Node 1458780302</a></li>
                                                <li role="treeitem" aria-selected="false" aria-level="2" aria-labelledby="node_145878030229450_anchor"
                                                    aria-expanded="false" id="node_145878030229450" class="jstree-node  jstree-closed jstree-last"><i
                                                        class="jstree-icon jstree-ocl" role="presentation"></i><a class="jstree-anchor" href="#" tabindex="-1"
                                                                                                                  id="node_145878030229450_anchor"><i
                                                        class="jstree-icon jstree-themeicon fa fa-folder icon-lg icon-state-info jstree-themeicon-custom"
                                                        role="presentation"></i>Node 1458780302</a></li>
                                            </ul>
                                        </li>
                                        <li role="treeitem" aria-selected="false" aria-level="1" aria-labelledby="node_14587802904078_anchor"
                                            aria-expanded="true" id="node_14587802904078" class="jstree-node jstree-open" aria-busy="false"><i
                                                class="jstree-icon jstree-ocl" role="presentation"></i><a class="jstree-anchor" href="#" tabindex="-1"
                                                                                                          id="node_14587802904078_anchor"><i
                                                class="jstree-icon jstree-themeicon fa fa-folder icon-lg icon-state-warning jstree-themeicon-custom"
                                                role="presentation"></i>Node #3</a>
                                            <ul role="group" class="jstree-children" style="">
                                                <li role="treeitem" aria-selected="false" aria-level="2" aria-labelledby="node_145878030144755_anchor"
                                                    aria-disabled="true" id="node_145878030144755" class="jstree-node  jstree-leaf jstree-last"><i
                                                        class="jstree-icon jstree-ocl" role="presentation"></i><a class="jstree-anchor  jstree-disabled"
                                                                                                                  href="#" tabindex="-1"
                                                                                                                  id="node_145878030144755_anchor"><i
                                                        class="jstree-icon jstree-themeicon fa fa-file fa-large icon-state-default jstree-themeicon-custom"
                                                        role="presentation"></i>No childs </a></li>
                                            </ul>
                                        </li>
                                        <li role="treeitem" aria-selected="false" aria-level="1" aria-labelledby="node_145878029094114_anchor"
                                            aria-expanded="true" id="node_145878029094114" class="jstree-node  jstree-last jstree-open" aria-busy="false"><i
                                                class="jstree-icon jstree-ocl" role="presentation"></i><a class="jstree-anchor" href="#" tabindex="-1"
                                                                                                          id="node_145878029094114_anchor"><i
                                                class="jstree-icon jstree-themeicon fa fa-folder icon-lg icon-state-info jstree-themeicon-custom"
                                                role="presentation"></i>Node #4</a>
                                            <ul role="group" class="jstree-children" style="">
                                                <li role="treeitem" aria-selected="false" aria-level="2" aria-labelledby="node_145878030028965_anchor"
                                                    aria-disabled="true" id="node_145878030028965" class="jstree-node  jstree-leaf jstree-last"><i
                                                        class="jstree-icon jstree-ocl" role="presentation"></i><a class="jstree-anchor  jstree-disabled"
                                                                                                                  href="#" tabindex="-1"
                                                                                                                  id="node_145878030028965_anchor"><i
                                                        class="jstree-icon jstree-themeicon fa fa-file fa-large icon-state-default jstree-themeicon-custom"
                                                        role="presentation"></i>No childs </a></li>
                                            </ul>
                                        </li>
                                    </ul>
                                </div>
                                <div class="alert alert-info no-margin margin-top-10"> Note! The tree nodes are loaded from ../demo/jstree_ajax_data.php via
                                    ajax.
                                </div>
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
<script src="${basePath}/assets/jsm/js/ui-tree.js" type="text/javascript"></script>

</@imIndex.b6js>


