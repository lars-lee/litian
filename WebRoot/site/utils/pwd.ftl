<!DOCTYPE html>
<html lang="en">
<head><#include "/site/common/headinfo.ftl"/>
    <link href="${contextPath}/css/common/bootstrap/bootstrap.min.css" rel="stylesheet"> <link href="${contextPath}/css/article/blog.css" rel="stylesheet">
    <meta charset="UTF-8">
    <title>密码</title>
</head>
<body>
<#include "/site/common/nav.ftl"/><br/>
<div class="container">
<#if pwdBeans??&&pwdBeans?has_content>
    <#list pwdBeans as pwdBean>
    ${pwdBean.id}-
    ${pwdBean.name}-
    ${pwdBean.website}-
    ${pwdBean.mail}-
    ${pwdBean.enPwd}<br/>
    </#list>
</#if></div>
</body>
</html>