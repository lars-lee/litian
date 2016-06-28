<!DOCTYPE html>
<html lang="en">
<head>
<#include "/site/common/headinfo.ftl"/>
    <title>文章详情</title>
    <link href="${contextPath}/css/article/blog.css" rel="stylesheet">
</head>
<body>
<#include "/site/common/nav.ftl"/>
<div class="container">
    <div class="blog-header">
        <h1 class="blog-title">${(author.name)!'匿名'}</h1>
        <p class="lead blog-description">${(author.info)!'这个人很懒，还没有介绍...'}</p>
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
            </div>
        </#if>
        </div>
    </div>
</div>
<#include "/site/common/footer.ftl"/>
</body>
</html>
