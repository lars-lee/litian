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

        .articleLink {
            border-top: .5em solid #2C2C2C;
            position: relative;
            width: 4em;
            height: 6em;
            border-right: 0.5em solid #2C2C2C;
            border-bottom: 0.5em solid #2C2C2C;
        }

        .articleLink:hover {
            background-color: lightskyblue;
            cursor: pointer;
        }

        .articleLink::before {
            bottom: -.5em;
            left: -0.5em;
            position: absolute;
            height: 4em;
            border-left: 0.5em solid #2C2C2C;
            border-bottom: 1em solid #2C2C2C;
            content: "";
        }

        .articleLink::after {
            top: -.5em;
            left: -0.5em;
            position: absolute;
            border-right: .5em solid #2C2C2C;
            border-top: 1em solid transparent;
            content: "";
        }

        .photoLink {
            position: relative;
            width: 5em;
            height: 5em;
            margin-top: .4em;
            margin-left: 4em;
            background: transparent;
            border: solid 0.5em;
            overflow: hidden;
        }

        .photoLink:hover {
            background-color: lightskyblue;
            cursor: pointer;
        }

        .photoLink:before {
            content: "";
            position: absolute;
            bottom: 0;
            right: 0;
            width: 0;
            height: 0;
            border-bottom: solid 1.5em;
            border-left: solid 1em transparent;
            border-right: solid 1em transparent;
            -webkit-box-shadow: -1em -1em 0 transparent, -1em -1em 0 transparent, -1em 0em 0 #2c2c2c;
            -moz-box-shadow: -1em -1em 0 transparent, -1em -1em 0 transparent, -1em 0em 0 #2c2c2c;
            box-shadow: -1em -1em 0 transparent, -1em -1em 0 transparent, -1em 0em 0 #2c2c2c;
        }

        .photoLink:after {
            content: "";
            position: absolute;
            left: 0.3em;
            top: 0.3em;
            width: 1.5em;
            height: 1.5em;
            background: transparent;
            border-radius: 50%;
            -webkit-box-shadow: inset 0.4em -0.2em 0 #2c2c2c;
            -moz-box-shadow: inset 0.4em -0.2em 0 #2c2c2c;
            box-shadow: inset 0.4em -0.2em 0 #2c2c2c;
        }

        .gameLink {
            background: #2C2C2C;
            position: relative;
            height: 0.4em;
            width: 0.2em;
            margin-top: 1.2em;
            margin-left: 8em;
        }

        .gameLink:hover {
            background-color: lightskyblue;
            cursor: pointer;
        }

        .gameLink::before {
            box-shadow: 2.4em 0em 0 -0.2em #EDEEE8, 1.3em 0em 0 -0.2em #EDEEE8, 1.4em 0em 0 -0.2em #EDEEE8, 1.5em 0em 0 -0.2em #EDEEE8, 1.6em 0em 0 -0.2em #EDEEE8, 2.3em 0em 0 -0.2em #EDEEE8, 2.5em 0em 0 -0.2em #EDEEE8, 2.6em 0em 0 -0.2em #EDEEE8, 0.5em 0em 0 0 #EDEEE8, -0.5em 0em 0 0 #EDEEE8, 0em -0.5em 0 0 #EDEEE8, 0em 0.5em 0 0 #EDEEE8, 1.1em -0.05em 0 0.95em #2C2C2C, 1.759em -0.05em 0 0.95em #2C2C2C, 3.2em -0.8em 0 0.2em #2C2C2C, 3.2em 0.77em 0 0.2em #2C2C2C;
            top: 1.3em;
            left: -2.1em;
            z-index: 99999;
            height: 0.5em;
            width: 0.5em;
            background: #EDEEE8;
            content: '';
            position: absolute;
        }

        .gameLink::after {
            content: "";
            left: 1.9em;
            top: 2em;
            position: absolute;
            background: #EDEEE8;
            width: 0.6em;
            height: 0.6em;
            border-radius: 100%;
            box-shadow: -0.8em -0.8em 0 0 #EDEEE8, 0.8em -0.8em 0 0 #EDEEE8, 0em -1.6em 0 0 #EDEEE8, 0em -0.8em 0 1em #2C2C2C, -4em -0.8em 0 1em #2C2C2C;
        }

        .toolLink {
            margin-left: 6em;
            margin-top: 1.2em;
            font-size: 21px;
            background: #2C2C2C;
            height: 0.3em;
            width: 0.15em;
            position: relative;
            -webkit-transform: rotate(-45deg);
            -moz-transform: rotate(-45deg);
            -o-transform: rotate(-45deg);
            -ms-transform: rotate(-45deg);
            transform: rotate(-45deg);
            -webkit-box-shadow: 0 0.25em 0 0 #2C2C2C, 0 -0.25em 0 0 #2C2C2C, 0 -0.55em 0 0.07em #2C2C2C, 0 0.55em 0 0.1em #2C2C2C, 0 0.9em 0 0.1em #2C2C2C, 0 1.2em 0 0.1em #2C2C2C;
            box-shadow: 0 0.25em 0 0 #2C2C2C, 0 -0.25em 0 0 #2C2C2C, 0 -0.55em 0 0.07em #2C2C2C, 0 0.55em 0 0.1em #2C2C2C, 0 0.9em 0 0.1em #2C2C2C, 0 1.2em 0 0.1em #2C2C2C;
        }

        .toolLink:hover {
            background-color: lightskyblue;
            cursor: pointer;
        }

        .toolLink::before {
            height: 1.5em;
            width: 0.3em;
            -webkit-transform: rotate(90deg);
            -moz-transform: rotate(90deg);
            -o-transform: rotate(90deg);
            -ms-transform: rotate(90deg);
            transform: rotate(90deg);
            background: #2C2C2C;
            position: absolute;
            content: "";
            top: -0.2em;
            left: -0.3em;
        }

        .toolLink::after {
            height: 0.3em;
            width: 0.3em;
            -webkit-transform: rotate(90deg);
            -moz-transform: rotate(90deg);
            -o-transform: rotate(90deg);
            -ms-transform: rotate(90deg);
            transform: rotate(90deg);
            position: absolute;
            border-left: 0.2em solid #2C2C2C;
            border-bottom: 0.4em solid #2C2C2C;
            border-right: 0.2em solid #2C2C2C;
            border-top: 0.05em solid transparent;
            content: "";
            top: 0.17em;
            left: 0.55em;
            border-top-right-radius: 25% 25%;
            border-top-left-radius: 25% 25%;
            border-bottom-left-radius: 50% 50%;
            border-bottom-right-radius: 50% 50%;
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
            <div style="padding-top: 150px; display: inline-flex;">
                <div class="articleLink"></div>
                <div class="photoLink"></div>
                <div class="gameLink"></div>
                <div class="toolLink"></div>
            </div>
        </div>
    </div>
</div>

<#include "/site/common/footer.ftl"/>
<script>
    $(function () {
        $(".articleLink").click(function () {
            window.location.href = contextPath + "/articles";
        });
        $(".toolLink").click(function () {
            window.location.href = contextPath + "/helper/pwd";
        });
    });
</script>
</body>
</html>
