<footer class="blog-footer">
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
    <div style="float: left;margin-left: 20px;height: 30px; margin-top: 10px;background: black;clear: both;
    -moz-border-radius: 5px;      /* Gecko browsers */
    -webkit-border-radius: 5px;   /* Webkit browsers */
    border-radius:5px;            /* W3C syntax */">
        <div style="padding-top: 150px; display: inline-flex;">
            <div class="backMusic"></div>
            <div class="nextMusic"></div>
            <div class="playMusic"></div>
            <div class="stopMusic"></div>
        </div>
        <audio id="playAudio" style="float: left;height: 30px;" controls="controls"/><#--autoplay="autoplay"-->
    </div>
    <p>
        作者：<a href="http://weibo.com/525920310" target="_blank">@愤怒的李纯洁啊</a></p>
    <p><a href="#">返回首页</a>&nbsp;&nbsp;<a href="#">友情连接</a></p>
</footer>
<script src="${contextPath}/js/common/jquery/jquery.min.js"></script>
<script src="${contextPath}/js/common/WebConstant.js"></script>
<script src="${contextPath}/js/common/bootstrap/bootstrap.min.js"></script>
<script>
    var player = $("#playAudio")[0];
    var playList = [];
    var playIndex = 0;
    playList.push(contextPath + "/music/1.mp3");
    playList.push(contextPath + "/music/2.mp3");
    playList.push(contextPath + "/music/3.mp3");
    playMusic();
    function playMusic() {
        player.src = playList[0];
        player.play();
    }

    $(".backMusic").click(function () {
        if (--playIndex < 0)playIndex = playList.length - 1;
        player.src = playList[playIndex];
        player.play();
    });
    $(".nextMusic").click(function () {
        if (++playIndex > playList.length - 1)playIndex = 0;
        player.src = playList[playIndex];
        player.play();
    });
    $(document).on('click', ".playMusic", function () {
        player.pause();
        $(this).addClass("pauseMusic");
        $(this).removeClass("playMusic");
    });
    $(document).on('click', ".pauseMusic", function () {
        player.play();
        $(this).addClass("playMusic");
        $(this).removeClass("pauseMusic");
    });
    $(".stopMusic").click(function () {
        player.pause();
        player.currentTime = 0;
    });
    player.addEventListener('ended', playEndedHandler, false);
    function playEndedHandler() {
        if (++playIndex > playList.length - 1)playIndex = 0;
        player.src = playList[playIndex];
        player.play();
        !playList.length && player.removeEventListener('ended', playEndedHandler, false);//只有一个元素时解除绑定
    }
    /**
     * 顺序播放
     */
    function orderPlay() {

    }
    /**
     * 随机播放
     */
    function shufflePlay() {

    }
    /**
     * 单曲循环
     */
    function onceRepeat() {

    }
    /**
     * 单曲播放
     */
    function onePlay() {

    }
    /**
     * 循环播放
     */
    function allRepeat() {

    }
</script>