<#if articles??&&articles?has_content>
    <#list articles as article>
    <div class="blog-post">
        <h2 class="blog-post-title">
            <a class="blog-post-title"
               href="${contextPath}/article/detail/${article.id}">${article.title?default("")?html}</a>
        </h2>
        <p class="blog-post-meta">${(article.cdate?string("yyyy-MM-dd"))!}</p>
        <p>${article.fastInfo}</p>
        <hr>
    </div>
    </#list>
</#if>
