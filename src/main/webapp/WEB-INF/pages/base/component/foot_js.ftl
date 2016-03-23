<#macro footFtl>

<!--[if lt IE 9]>
<script src="${basePath}/assets/global/plugins/respond.min.js"></script>
<script src="${basePath}/assets/global/plugins/excanvas.min.js"></script>
<![endif]-->

<!-- BEGIN CORE PLUGINS -->
<script src="${basePath}/assets/global/plugins/jquery.min.js" type="text/javascript"></script>
<script src="${basePath}/assets/global/plugins/bootstrap/js/bootstrap.min.js"
        type="text/javascript"></script>
<script src="${basePath}/assets/global/plugins/js.cookie.min.js" type="text/javascript"></script>
<script src="${basePath}/assets/global/plugins/bootstrap-hover-dropdown/bootstrap-hover-dropdown.min.js"
        type="text/javascript"></script>
<script src="${basePath}/assets/global/plugins/jquery-slimscroll/jquery.slimscroll.min.js"
        type="text/javascript"></script>
<script src="${basePath}/assets/global/plugins/jquery.blockui.min.js" type="text/javascript"></script>
<script src="${basePath}/assets/global/plugins/uniform/jquery.uniform.min.js"
        type="text/javascript"></script>
<script src="${basePath}/assets/global/plugins/bootstrap-switch/js/bootstrap-switch.min.js"
        type="text/javascript"></script>
<!-- END CORE PLUGINS -->

<!-- BEGIN THEME GLOBAL SCRIPTS -->
<script src="${basePath}/assets/global/scripts/app.min.js" type="text/javascript"></script>
<!-- END THEME GLOBAL SCRIPTS -->

<!-- BEGIN THEME LAYOUT SCRIPTS -->
<script src="${basePath}/assets/layouts/layout/scripts/layout.min.js" type="text/javascript"></script>
<script src="${basePath}/assets/layouts/layout/scripts/demo.min.js" type="text/javascript"></script>
<script src="${basePath}/assets/layouts/global/scripts/quick-sidebar.min.js"
        type="text/javascript"></script>
<!-- END THEME LAYOUT SCRIPTS -->

<!-- BEGIN 自定义js -->

    <#nested>

<!-- END 自定义js -->


</#macro>