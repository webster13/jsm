<#macro tpJsPlugins>

<!--[if lt IE 9]>
<script src="${basePath}/static/metronic/assets/global/plugins/respond.min.js"></script>
<script src="${basePath}/static/metronic/assets/global/plugins/excanvas.min.js"></script>
<![endif]-->
<!-- BEGIN CORE PLUGINS -->
<script src="${basePath}/static/metronic/assets/global/plugins/jquery.min.js" type="text/javascript"></script>
<script src="${basePath}/static/metronic/assets/global/plugins/bootstrap/js/bootstrap.min.js"
        type="text/javascript"></script>
<script src="${basePath}/static/metronic/assets/global/plugins/js.cookie.min.js" type="text/javascript"></script>
<script src="${basePath}/static/metronic/assets/global/plugins/bootstrap-hover-dropdown/bootstrap-hover-dropdown.min.js"
        type="text/javascript"></script>
<script src="${basePath}/static/metronic/assets/global/plugins/jquery-slimscroll/jquery.slimscroll.min.js"
        type="text/javascript"></script>
<script src="${basePath}/static/metronic/assets/global/plugins/jquery.blockui.min.js" type="text/javascript"></script>
<script src="${basePath}/static/metronic/assets/global/plugins/uniform/jquery.uniform.min.js"
        type="text/javascript"></script>
<script src="${basePath}/static/metronic/assets/global/plugins/bootstrap-switch/js/bootstrap-switch.min.js"
        type="text/javascript"></script>
<!-- END CORE PLUGINS -->

<!-- BEGIN PAGE LEVEL PLUGINS -->
    <#nested>
<!-- END PAGE LEVEL PLUGINS -->


</#macro>