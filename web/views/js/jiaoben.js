function Check_UserName(){
    var username=document.getElementById("username");
    var span_CheckUsername=document.getElementById("span_CheckUsername");
    if(username.value==""||username.value.length<3){
        span_CheckUsername.innerHTML="请填写有效的 用户名作为下次登录的用户名，";

        return false;
    }else{
        span_CheckUsername.innerHTML="√";
        return true;
    }
}


function Check_Email(){
    var email=document.getElementById("email").value;
    var span_CheckEmail=document.getElementById("span_CheckEmail");
    if(isEmail(email)){
        span_CheckEmail.innerHTML="√";
    return true;
    }
    span_CheckEmail.innerHTML="请填写有效的 Email地址，<br>　同时我们也会给这个地址发送您的帐户信息、订单通知等。";
    return false;
}
function isEmail(str){
    var reg =/^([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+@([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+\.(?:com|cn)$/;
    return reg.test(str);
}


function ChangePassword(){
    var pwd=document.getElementById("pwd");
    var CheckRePassWord=document.getElementById("CheckRePassWord");
    if(pwd.value==""||pwd.value.length<6||pwd.value.length>16){
        CheckRePassWord.innerHTML="密码请设为6-16位字母或数字";
        return false;
    }
    CheckRePassWord.innerHTML="√";
    return true;
}
function Check_RePassWord(){
    var pwd1=document.getElementById("pwd1");
    var pwd=document.getElementById("pwd");
    var ReCheckRePassWord=document.getElementById("ReCheckRePassWord");
    if(pwd1.value==""||pwd1.value.length<6||pwd1.value!=pwd.value){
        ReCheckRePassWord.innerHTML="两次密码输入不一致，或者密码不合法！";
        document.getElementById("pwd1").focus();
        return false;
    }
    ReCheckRePassWord.innerHTML="√";
    return true;
}
function CheckNewUserName(){
    var lname=document.getElementById("lname");
    var CheckNewUserName=document.getElementById("CheckNewUserName");
    if(lname.value==""){
        CheckNewUserName.innerHTML="请输入中英文、数字、下划线或它们的组合";
        return false;
    }
    CheckNewUserName.innerHTML="√";
    return true;
}

