<!DOCTYPE html>
<html lang="en">
<head>
<#include "/site/common/headinfo.ftl"/>
    <title>李天的首页</title>
    <link href="${contextPath}/css/article/blog.css" rel="stylesheet">
    <style>
        a:focus, a:hover {
            text-decoration: blink;
        }

        .img-main {
            width: 96px;
            height: 96px;
        }
        .articleLink {
            font-size: 16px;
            border-top: 0.2em solid #2C2C2C;
            position: relative;
            width: 1em;
            height: 2em;
            border-right: 0.2em solid #2C2C2C;
            border-bottom: 0.2em solid #2C2C2C;
        }

        .articleLink::before {
            bottom: -0.2em;
            left: -0.5em;
            position: absolute;
            width: 0.5em;
            height: 1.72em;
            border-left: 0.2em solid #2C2C2C;
            border-bottom: 0.2em solid #2C2C2C;
            content: "";
        }
        .articleLink::after {
            top: -0.2em;
            left: -0.50em;
            position: absolute;
            border-right: 0.5em solid #2C2C2C;
            border-top: 0.5em solid transparent;
            content: "";
        }
    </style>
</head>

<body>

<#include "/site/common/nav.ftl"/>

<div class="container">
    <div class="row">
        <br/>
        <div class="col-sm-8 blog-main">
            <br/><br/>
            <div>
                <a class="blog-post-title" href="${contextPath}/articles">
<div style="width: 96px;"><div class="articleLink"></div></div>
                </a>
                <a class="blog-post-title" href="#">
                    <img class="img-main" src="../../img/photo96.png" alt="照片"/>
                </a>
                <a class="blog-post-title" href="#">
                    <img class="img-main" src="../../img/game96.png" alt="游戏"/>
                </a>
                <a class="blog-post-title" href="${contextPath}/helper/pwd">
                    <img class="img-main" src="../../img/assistant96.png" alt="工具"/>
                </a>
            </div>
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

<#include "/site/common/footer.ftl"/>

</body>
</html>
