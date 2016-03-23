<base id="base" href="${basePath}">
<!DOCTYPE html>
<html>
<head>
    <title>admin首页</title>
</head>
<body>
<div>
    <p>提示：${msg!}</p>
</div>
<div>
    <img style="width: 100px;height: 100px" src="${basePath}/assets/jsm/img/head1.jpg">
    <form action="${basePath}/login" method="post">
        <table>
            <tr>
                <td>username:</td>
                <td><label>
                    <input type="text" name="username" value="linda"/>
                </label>
                </td>
            </tr>
            <tr>
                <td>password:</td>
                <td><label>
                    <input type="text" name="password" value="111111"/>
                </label></td>
            </tr>
            <tr>
                <td>Remember Me: </td>
                <td><label>
                    <input type="checkbox" name="rememberMe" value="true" checked/>
                </label></td>
            </tr>
            <tr>
                <td><input type="submit" value="submit"/>
            </tr>
        </table>
    </form>
</div>

<p>______________________________________________</p>

<a href="${basePath}/admin"> 管理员首页——需要记住我</a>&nbsp;|&nbsp;
<a href="${basePath}/admin/user"> 用户首页——需要登录</a>&nbsp;|&nbsp;
<a href="${basePath}/test"> 测试首页</a>&nbsp;|&nbsp;
<a href="${basePath}/test/parameter"> 测试传入参数</a>&nbsp;|&nbsp;
<a href="${basePath}/test/metronic"> 测试metronic</a>&nbsp;|&nbsp;

</body>
</html>