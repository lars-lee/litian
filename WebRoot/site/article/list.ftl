<!DOCTYPE html>
<html lang="en">
<head>
<#include "/site/common/headinfo.ftl"/>
    <title>文章列表</title>
    <link href="${contextPath}/css/common/bootstrap/bootstrap.min.css" rel="stylesheet">
    <link href="${contextPath}/css/article/blog.css" rel="stylesheet">
</head>

<body>

<#include "/site/common/nav.ftl"/>

<div class="container">
    <div class="blog-header">
        <h1 class="blog-title"></h1>
        <p class="lead blog-description"></p>
    </div>

    <div class="row">
        <div id="blog-main" class="col-sm-8 blog-main">
            <div id="list">
            <#if articles??&&articles?has_content>
                <#list articles as article>
                    <div class="blog-post">
                        <h2 class="blog-post-title">
                            <a class="blog-post-title"
                               href="${contextPath}/article/detail/${article.id}">${article.title?default("")?html}</a>
                        </h2>
                        <p class="blog-post-meta">${(article.cDate?string("yyyy-MM-dd"))!}</p>
                        <p>${article.fastInfo}</p>
                        <hr>
                    </div>
                </#list>
            </#if>
            </div>
            <nav>
                <ul class="pager">
                    <li><a id="backPage" href="#">上一页</a></li>
                    <li><a id="nextPage" href="#">下一页</a></li>
                </ul>
            </nav>
        </div>
        <div class="col-sm-3 col-sm-offset-1 blog-sidebar">
            <div class="sidebar-module sidebar-module-inset">
                <h4>介绍</h4>
                <p>写一些其他介绍</p>
            </div>
            <div class="sidebar-module">
                <h4>Archives</h4>
                <ol class="list-unstyled">
                <#if queryDates??&&queryDates?has_content>
                    <#list queryDates as queryDate>
                        <li><a href="#" class="queryDate">${queryDate}</a></li>
                    </#list>
                </#if>
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
<script src="${contextPath}/js/article/list.js"></script>
</body>
</html>
