<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>注册页面</title>

    <meta name="keywords" content="keyword1,keyword2,keyword3">
    <meta name="description" content="this is my page">
    <meta name="content-type" content="text/html; charset=UTF-8">
    <link href="../../css/common/bootstrap/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="../../css/member/signin.css">

    <script src="../../js/common/jquery/jquery.min.js"></script>
    <script src="../../js/member/register.js"
</head>

<body>
<div class="container">
    <form class="form-signin" action="/registerResult" method="post">
        <h2 class="form-signin-heading">注册</h2>
        <input type="email" id="username" name="username" class="form-control" placeholder="请输入登录邮箱/手机号" required
               autofocus>
        <input type="password" id="password" name="password" class="form-control" placeholder="密码" required>
        <button class="btn btn-lg btn-primary btn-block" type="submit">注册</button>
        <a class="btn btn-lg btn-primary btn-block" href="/login">登录</a>
        </button>
    </form>
</div> <!-- /container -->
</body>
</html>
