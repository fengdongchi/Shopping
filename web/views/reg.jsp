<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2014/12/24
  Time: 15:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>无标题文档</title>
    <link href="<%=request.getContextPath()%>/css/style.css" rel="stylesheet" type="text/css"/>
    <link href="<%=request.getContextPath()%>/css/LoginAndReg.css" rel="stylesheet" type="text/css"/>
    <script src="${ctx}js/jiaoben.js" type="text/javascript"></script>
</head>
<body>
<form:form action="${ctx}reg1" method="post" modelAttribute="user">
    <div id="box">
        <!--top start -->
        <div id="top">
            <a href="<%=request.getContextPath()%>/indexg/index"><img src="<%=request.getContextPath()%>/images/logo.gif" alt="Estimation" width="255" height="58"
                                           border="0"
                                           class="logo"/></a>

            <p class="topDiv"></p>

            <p class="navLeft"></p>
            <ul>
                <li><a href="<%=request.getContextPath()%>/indexg/index" class="hover">首页</a></li>
                <li><a href="#">关于我们</a></li>
                <li><a href="#">在线客服</a></li>
                <li class="chart"><a href="<%=request.getContextPath()%>/chartg/chart">购物车</a></li>
            </ul>
            <p class="navRight"></p>

            <p class="topDiv"></p>

            <form path="serch" action="#" method="post">
                <input type="text" name="txtbox" value="购物搜索" class="txtBox"/>
                <input type="submit" name="go" value="搜" class="go"/>
            </form>
        </div>
        <!--top end -->
        <div class="nav">
            <ul>
                <li class="first"><a href="#">新品上架</a></li>
                <li><a href="#">坚果炒货</a></li>
                <li><a href="#">补血大枣</a></li>
                <li><a href="#">经典肉类</a></li>
                <li><a href="#">进口零食</a></li>
                <li><a href="#">美味糖果</a></li>
                <li><a href="#">天然干果</a></li>
                <li><a href="#">蒙古奶酪</a></li>
                <li><a href="#">台湾牛轧糖</a></li>
                <li><a href="#">蜜饯果脯</a></li>
                <li class="last">
                    <div id="welcome" class="welmsgdiv2"><span>您好，欢迎光临果果香。</span><a href="<%=request.getContextPath()%>/loging/login">登录</a><span
                            class="Lloginfg">&nbsp;</span><a href="${ctx}reg1">注册</a></div>
                </li>
            </ul>
        </div>
        <!--header end -->
        <!--guide01 start -->
        <div class="guide01">
            <img src="<%=request.getContextPath()%>/images/guide_01.jpg" width="973" height="62" border="0" usemap="#Map"/>
            <map name="Map" id="Map">
                <area shape="rect" coords="398,11,493,51" href="#"/>
                <area shape="rect" coords="540,12,633,51" href="#"/>
                <area shape="rect" coords="684,12,790,53" href="#"/>
                <area shape="rect" coords="830,10,953,54" href="#"/>
            </map>
        </div>
        <!--guide01 end -->
        <!--body start -->
        <div id="body">
            <div id="Login">
                <h1 align="left"><img src="<%=request.getContextPath()%>/images/pic_title.gif"></h1>
                <table width="800"  border="0" align="center" cellpadding="0" cellspacing="0" class="lineJL"
                       style="font-size: 12">
                    <tbody>
                    <tr>${msg}</tr>
                    <tr>
                        <td class="sty03" valign="top" width="236" align="right">请填写您的用户名：</td>
                        <td class="sty01" valign="top" width="219"><form:input path="username" id="username"
                                                                          onblur="Check_UserName()"
                                                                        />
                        </td>
                        <td class="sty04" valign="top" width="425" align="left">　<span style="color:red"
                                                                                       id="span_CheckUsername"></span><br></td>
                    </tr>
                    <tr>
                        <td class="sty03" valign="top" width="236" align="right">请填写您的Email地址：</td>
                        <td class="sty01" valign="top" width="219"><form:input path="email" id="email"
                                                                          onblur="Check_Email()"
                                                                          type="text"/>
                        </td>
                        <td class="sty04" valign="top" width="425" align="left">　<span style="color: red"
                                                                                       id="span_CheckEmail"></span>
                        </td>
                    </tr>
                    <tr>
                        <td class="sty03" valign="top" align="right">请设定密码：</td>
                        <td class="sty01" valign="top"><form:input id="pwd" path="pwd" maxlength="16"
                                                              onblur="ChangePassword();"
                                                              type="password" /></td>
                        <td class="sty03 sty04" valign="top" align="left">　<span
                                id="CheckRePassWord" style="color: red"></span></td>
                    </tr>
                    <tr>
                        <td class="sty03" valign="top" align="right">请再次输入设定密码：</td>
                        <td class="sty01" valign="top"><input id="pwd1" name="pwd1" maxlength="16"
                                                              onblur="Check_RePassWord()" value=""
                                                              type="password"></td>
                        <td align="left">　<span
                                id="ReCheckRePassWord"style="color: red"></span></td>
                    </tr>
                    <tr>
                        <td class="sty03" valign="top" align="right">昵称：</td>
                        <td class="sty01" valign="top"><form:input id="lname" path="lname" maxlength="16"
                                                              onblur="CheckNewUserName()" type="text" /></td>
                        <td class="sty03 sty04" valign="top" align="left"><span
                                id="CheckNewUserName" style="color: red"></span>　</td>
                    </tr>
                    <tr>
                        <td class="sty03" valign="top" align="right">请输入验证码：</td>
                        <td class="sty02" colspan="2" valign="top"><input name="Validate_Code" id="Validate_Code"
                                                                          onblur="CheckValidateCode()"
                                                                          style="width:100px;" maxlength="4" /><img
                                id="Img1"
                                style="vertical-align: top; padding: 0pt 0pt 0pt 8px;width: 70px;height: 20px"
                                src="<%=request.getContextPath()%>/validCode.jsp"
                                onclick='this.src="<%=request.getContextPath()%>/validCode.jsp?r="+Math.random()'
                                border="0">

                        </td>
                    </tr>
                    <tr>
                        <td>　</td>
                        <td align="right"><input src="<%=request.getContextPath()%>/images/submit.gif"
                                                 style="width:91px; height:25px; border:0;"
                                                 alt="完成注册" type="submit"/></td>
                        <td>　</td>
                    </tr>
                    <tr>
                        <td colspan="3">&nbsp;</td>
                    </tr>
                    </tbody>
                </table>

            </div>
            <br class="spacer"/>
        </div>
        <!--footer start -->
        <div id="footer">
            <ul>
                <li><a href="#">首页</a>|</li>
                <li><a href="#">关于我们</a>|</li>
                <li><a href="#">新闻资讯</a>|</li>
                <li><a href="#">价单下载</a>|</li>
                <li><a href="#">联系我们</a>|</li>
            </ul>
            <p class="copyright">Copyright 2010 vancl.com All Rights Reserved 冀ICP证xxxxxx号

            </p>

            <p class="design"><a href="http://www.CSSK8.com/" target="_blank" class="link">启奥科技</a></p>
        </div>
        <!--footer end -->
        <!--body end -->
    </div>
    <!--box-->
    </form:form>
</body>
</html>
