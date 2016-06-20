/**
 * Created by litian on 2016/6/15.
 */
$(function () {
    $(".btn").click(function () {
        var username = $.trim($("#username").val());
        var password = $.trim($("#password").val());
        if (!username || "" == username) {
            alert("用户名不能为空!");
            $("#username").focus();
            return false;
        }
        if (!REGEX_MOBILE.test(username) && !REGEX_MAIL.test(username)) {
            alert("登录邮箱/手机号格式不正确!");
            $("#username").focus();
            return false;
        }
        if (!password || "" == password) {
            alert("请输入密码!");
            $("#password").focus();
            return false;
        }
        $.post("/signin", {username: username, password: password}, function (data) {
            alert(data.status);
        });
    });
});