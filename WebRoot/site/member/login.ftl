<!DOCTYPE html>
<html lang="en">
<head>
<#include "/site/common/common.ftl"/>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>登录</title>
    <link href="${contextPath}/css/common/bootstrap/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="${contextPath}/css/member/signin.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>

<div class="container">

    <form class="form-signin" action="${contextPath}/index" method="post">
        <h2 class="form-signin-heading">登录</h2>
        <input type="email" id="username" name="username" class="form-control" placeholder="请输入登录邮箱/手机号" required
               autofocus>
        <input type="password" id="password" name="password" class="form-control" placeholder="密码" required>
        <div class="checkbox">
            <label>
                <input type="checkbox" value="remember-me">记住用户名
            </label>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit">登陆</button>
        <a class="btn btn-lg btn-primary btn-block" href="${contextPath}/register">注册</a>
    </form>

</div> <!-- /container -->

<script src="${contextPath}/js/common/jquery/jquery.min.js"></script>
<script src="${contextPath}/js/common/WebConstant.js"></script>
<script src="${contextPath}/js/member/login.js"></script>
</body>
</html>
