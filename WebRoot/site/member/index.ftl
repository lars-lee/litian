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
                <div class="fc" href="${contextPath}/articles"></div>
                <style>
                    .fc:hover {
                        background: orange;
                    }

                    .fc {
                        border-top: .5em solid #2C2C2C;
                        position: relative;
                        width: 4em;
                        height: 6em;
                        border-right: 0.5em solid #2C2C2C;
                        border-bottom: 0.5em solid #2C2C2C;
                    }

                    .fc::before {
                        bottom: -.5em;
                        left: -0.5em;
                        position: absolute;
                        height: 4em;
                        border-left: 0.5em solid #2C2C2C;
                        border-bottom: 1em solid #2C2C2C;
                        content: "";
                    }

                    .fc::after {
                        top: -.5em;
                        left: -0.5em;
                        position: absolute;
                        border-right: .5em solid #2C2C2C;
                        border-top: 1em solid transparent;
                        content: "";
                    }
                </style>
                <div class="sc"></div>
                <style>
                    .sc {
                        position: relative;
                        width: 5em;
                        height: 5em;
                        margin-top: .4em;
                        margin-left: 4em;
                        background: transparent;
                        border: solid 0.5em;
                        overflow: hidden;
                    }

                    .sc:before {
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

                    .sc:after {
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
                </style>
                <div class="tc"></div>
                <style>
                    .tc {
                        background: #2C2C2C;
                        position: relative;
                        height: 0.4em;
                        width: 0.2em;
                        margin-top: 1.2em;
                        margin-left: 8em;
                    }

                    .tc::before {
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

                    .tc::after {
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
                </style>
                <div class="ffc" href="${contextPath}/helper/pwd"></div>
                <style>
                    .ffc {
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

                    .ffc::before {
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

                    .ffc::after {
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
            </div>
        </div><!-- /.blog-main -->

        <div style="padding-top: 150px; display: inline-flex;">
            <div class="backMusic"></div>
            <div class="nextMusic"></div>
            <div class="playMusic"></div>
            <div class="pauseMusic"></div>
            <div class="stopMusic"></div>
            <style>
                .backMusic {
                    width: 2em;
                    height: 2em;
                    border-radius: 50%;
                    position: relative;
                    border: 0.3em solid #2c2c2c;
                }

                .backMusic::before {
                    position: absolute;
                    content: "";
                    top: 0.29em;
                    right: 1em;
                    width: 0em;
                    height: 0em;
                    border-top: 0.7em solid rgba(44, 44, 44, 0);
                    border-bottom: 0.7em solid transparent;
                    border-right: 0.7em solid #2C2C2C;
                }

                .backMusic::after {
                    position: absolute;
                    content: "";
                    top: 0.29em;
                    right: 0.5em;
                    width: 0em;
                    height: 0em;
                    border-top: 0.7em solid rgba(44, 44, 44, 0);
                    border-bottom: 0.7em solid transparent;
                    border-right: 0.7em solid #2C2C2C;
                }

                .nextMusic {
                    width: 2em;
                    height: 2em;
                    border-radius: 50%;
                    position: relative;
                    border: 0.3em solid #2c2c2c;
                }

                .nextMusic::before {
                    position: absolute;
                    content: "";
                    top: 0.29em;
                    left: 1em;
                    width: 0em;
                    height: 0em;
                    border-top: 0.7em solid rgba(44, 44, 44, 0);
                    border-bottom: 0.7em solid transparent;
                    border-left: 0.7em solid #2C2C2C;
                }

                .nextMusic::after {
                    position: absolute;
                    content: "";
                    top: 0.29em;
                    left: 0.5em;
                    width: 0em;
                    height: 0em;
                    border-top: 0.7em solid rgba(44, 44, 44, 0);
                    border-bottom: 0.7em solid transparent;
                    border-left: 0.7em solid #2C2C2C;
                }

                .playMusic {
                    width: 2em;
                    height: 2em;
                    border-radius: 50%;
                    position: relative;
                    border: 0.3em solid #2c2c2c;
                }

                .playMusic::before {
                    position: absolute;
                    content: "";
                    top: 0.25em;
                    left: 0.75em;
                    width: 0em;
                    height: 0em;
                    border-top: 0.8em solid rgba(44, 44, 44, 0);
                    border-bottom: 0.8em solid transparent;
                    border-left: 0.8em solid #2C2C2C;
                }

                .pauseMusic {
                    width: 2em;
                    height: 2em;
                    border-radius: 50%;
                    position: relative;
                    border: 0.3em solid #2c2c2c;
                }

                .pauseMusic::before {
                    position: absolute;
                    background: #2C2C2C;
                    content: "";
                    top: 0.4em;
                    left: 0.45em;
                    width: 0.4em;
                    height: 1.3em;
                }

                .pauseMusic::after {
                    position: absolute;
                    background: #2C2C2C;
                    content: "";
                    top: 0.4em;
                    right: 0.45em;
                    width: 0.4em;
                    height: 1.3em;
                }

                .stopMusic {
                    width: 2em;
                    height: 2em;
                    border-radius: 50%;
                    position: relative;
                    border: 0.3em solid #2C2C2C;
                }

                .stopMusic::before {
                    position: absolute;
                    background: #2C2C2C;
                    content: "";
                    top: 0.4em;
                    left: 0.4em;
                    width: 1.2em;
                    height: 1.2em;
                }
            </style>
        </div>
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
