<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>文章详情</title>
    <link href="../../css/common/bootstrap/bootstrap.min.css" rel="stylesheet">
    <link href="../../css/article/blog.css" rel="stylesheet">

    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>

<div class="blog-masthead">
    <div class="container">
        <nav class="blog-nav">
            <a class="blog-nav-item active" href="/index">首页</a>
            <a class="blog-nav-item" href="#">导航1</a>
            <a class="blog-nav-item" href="#">导航2</a>
            <a class="blog-nav-item" href="#">导航3</a>
            <a class="blog-nav-item" href="#">导航4</a>
        </nav>
    </div>
</div>

<div class="container">
    <div class="blog-header">
        <h1 class="blog-title">我的昵称</h1>
        <p class="lead blog-description">这个人很很懒，还没有介绍...</p>
    </div>

    <div class="row">
        <div class="col-sm-8 blog-main">
        <#if article??&&article?has_content>
            <div class="blog-post">
                <h2 class="blog-post-title">${article.title?if_exists}</h2>
                <p class="blog-post-meta">
                ${(article.udate?string("MM dd, yyyy"))!"07 07, 1937"}
                </p>
                <#assign tempString = "" />
                <#list article.content as lis>
                    <#assign tempString += (lis+",") />
                </#list>
                <p>${byteArray2String(tempString)?if_exists}</p>
            </div><!-- /.blog-post -->
        </#if>
        </div><!-- /.blog-main -->


        <div class="col-sm-3 col-sm-offset-1 blog-sidebar">
            <div class="sidebar-module sidebar-module-inset">
                <h4>介绍</h4>
                <p>写一些其他介绍</p>
            </div>
            <div class="sidebar-module">
                <h4>Archives</h4>
                <ol class="list-unstyled">
                    <li><a href="#">2016-06</a></li>
                    <li><a href="#">2016-05</a></li>
                    <li><a href="#">2016-04</a></li>
                    <li><a href="#">2016-03</a></li>
                    <li><a href="#">2016-02</a></li>
                    <li><a href="#">2016-01</a></li>
                    <li><a href="#">2015-12</a></li>
                    <li><a href="#">2015-11</a></li>
                    <li><a href="#">2015-10</a></li>
                    <li><a href="#">2015-09</a></li>
                </ol>
            </div>
            <div class="sidebar-module">
                <h4>其他</h4>
                <ol class="list-unstyled">
                    <li><a href="#">GitHub</a></li>
                    <li><a href="#">Twitter</a></li>
                    <li><a href="#">Facebook</a></li>
                </ol>
            </div>
        </div><!-- /.blog-sidebar -->
    </div><!-- /.row -->
</div><!-- /.container -->

<footer class="blog-footer">
    <p>作者：<a href="http://weibo.com/525920310" target="_blank">@愤怒的李纯洁啊</a></p>
    <p>
        <a href="#">返回首页</a>
    </p>
</footer>


<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="../../js/common/jquery/jquery.min.js"></script>
<script src="../../js/common/bootstrap/bootstrap.min.js"></script>
</body>
</html>
