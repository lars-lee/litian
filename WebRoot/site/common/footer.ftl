<footer class="blog-footer">
    <style>
        .img-music {
            width: 24px;
            height: 24px;
        }

        .arrow-left {
            width: 0;
            height: 0;
            border-top: 9px solid transparent;
            border-bottom: 9px solid transparent;
            border-right: 9px solid #F4F4F4;
        }

        .arrow-right {
            width: 0px;
            height: 0px;
            border-top: 9px solid transparent;
            border-bottom: 9px solid transparent;
            border-left: 9px solid #F4F4F4;
        }

    </style>
    <div style="float: left;margin-left: 20px;height: 30px; margin-top: 10px;background: black;clear: both;
    -moz-border-radius: 5px;      /* Gecko browsers */
    -webkit-border-radius: 5px;   /* Webkit browsers */
    border-radius:5px;            /* W3C syntax */">
        <div id="preMusic" style="float: left;margin-top: 6px;margin-left: 10px;">
            <div class="arrow-left" style="float: left"></div>
            <div class="arrow-left" style="float: left"></div>
        </div>
        <div id="nextMusic" style="float: left;margin-top: 6px;margin-left: 10px;">
            <div class="arrow-right" style="float: left"></div>
            <div class="arrow-right" style="float: left"></div>
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
    $("#preMusic").click(function () {
        if (--playIndex < 0)playIndex = playList.length - 1;
        player.src = playList[playIndex];
    });
    $("#nextMusic").click(function () {
        if (++playIndex > playList.length - 1)playIndex = 0;
        player.src = playList[playIndex];
    });
    function playMusic() {
        player.src = playList[0];
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

<#--
<div id="audioBox"></div>
<script type="text/javascript">
    window.onload = function () {
        var arr = [contextPath + "/music/1.mp3",
            contextPath + "/music/2.mp3",
            contextPath + "/music/3.mp3"];//把需要播放的歌曲从后往前排
        var myAudio = new Audio();
        myAudio.preload = true;
        myAudio.controls = true;
        myAudio.src = arr.pop();//每次读数组最后一个元素
        myAudio.addEventListener('ended', playEndedHandler, false);
        myAudio.play();
        document.getElementById("audioBox").appendChild(myAudio);
        myAudio.loop = false;//禁止循环，否则无法触发ended事件
        function playEndedHandler() {
            myAudio.src = arr.pop();
            myAudio.play();
            !arr.length && myAudio.removeEventListener('ended', playEndedHandler, false);//只有一个元素时解除绑定
        }
    }
</script>-->
