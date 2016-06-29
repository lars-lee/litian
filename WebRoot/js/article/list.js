/**
 * Created by litian on 2016/6/29.
 */
$(function () {
    var pageIndex = 1;
    var queryDate = null;
    $(".queryDate").click(function () {
        queryDate = $(this)[0].textContent;
        getArticles(queryDate, 1, 5);
    });
    $("#backPage").click(function () {
        if ((--pageIndex) < 1)pageIndex = 1;
        getArticles(queryDate, pageIndex, 5)
    });
    $("#nextPage").click(function () {
        ++pageIndex;
        getArticles(queryDate, pageIndex, 5)
    });
    function getArticles(queryDate, pageIndex, pageSize) {
        $.post(contextPath + "/getArticles", {
            queryDate: queryDate,
            pageIndex: pageIndex,
            pageSize: pageSize
        }, function (data) {
            var html = articleList(data.articles);
            if (html && html != "")
                $("#list").html(html);
            else
                $("#list").html('<div class="blog-post">等待作者编辑更多文章！</div>');
        });
    }

    function articleList(articles) {
        var html = "";
        if (articles instanceof Array) {
            for (var articleIndex in articles) {
                html += '<div class="blog-post">' +
                    '<h2 class="blog-post-title">' +
                    '<a class="blog-post-title" href="';
                html += (contextPath + '/article/detail/' + articles[articleIndex].id + '">' + articles[articleIndex].title + '</a></h2><p class="blog-post-meta">');
                var date = articles[articleIndex].cDate;
                html += getyyyyMMdd(date) + '</p><p>' + articles[articleIndex].fastInfo + '</p><hr></div>';
            }
            return html;
        }
        return "";
    }

    function getyyyyMMdd(dateTime) {
        var day = new Date(dateTime);
        var CurrentDate = "";
        //初始化时间
        var Year = day.getFullYear();
        var Month = day.getMonth() + 1;
        var Day = day.getDate();
        //Hour = day.getHours();
        // Minute = day.getMinutes();
        // Second = day.getSeconds();
        CurrentDate += Year + "-";
        if (Month >= 10) {
            CurrentDate += Month + "-";
        }
        else {
            CurrentDate += "0" + Month + "-";
        }
        if (Day >= 10) {
            CurrentDate += Day;
        }
        else {
            CurrentDate += "0" + Day;
        }
        return CurrentDate;
    }

});