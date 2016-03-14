<%@ page language="java"  pageEncoding="UTF-8"%>
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
    <form action="${pageContext.request.contextPath}/login" method="post">
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

<a href="${pageContext.request.contextPath}/admin/index"> 管理员首页</a>&nbsp;|&nbsp;

</body>
</html>