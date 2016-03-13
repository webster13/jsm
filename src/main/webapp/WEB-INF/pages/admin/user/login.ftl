<base id="base" href="${base}">
<!DOCTYPE html>
<html>
<head>
    <title>login page</title>
</head>
<body>
<div>
    <p>提示：${msg}</p>
</div>
<div>
    <form action="${base}/admin/user/login" method="post">
        <table>
            <tr>
                <td>username:</td>
                <td><input type="text" name="username" value="linda"/>
                </td>
            </tr>
            <tr>
                <td>password:</td>
                <td><input type="text" name="password" value="111111"/></td>
            </tr>
            <tr>
                <td>Remember Me: </td>
                <td><input type="checkbox" name="rememberMe" value="true" checked/></td>
            </tr>
            <tr>
                <td><input type="submit" value="submit"/>
            </tr>
        </table>
    </form>
</div>

</body>
</html>