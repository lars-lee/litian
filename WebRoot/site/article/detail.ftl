<!DOCTYPE html>
<html lang="en">
<head>
<#include "/site/common/headinfo.ftl"/>
    <title>文章详情</title>
    <link href="${contextPath}/css/common/bootstrap/bootstrap.min.css" rel="stylesheet">
    <link href="${contextPath}/css/article/blog.css" rel="stylesheet">

</head>

<body>

<#include "/site/common/nav.ftl"/>

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
                <#if member??&&member.id==article.mid>
                    <span id="edit">编辑</span>
                </#if>
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

<#include "/site/common/footer.ftl"/>

<script src="${contextPath}/js/common/jquery/jquery.min.js"></script>
<script src="${contextPath}/js/common/bootstrap/bootstrap.min.js"></script>
</body>
</html>
