<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2014/12/24
  Time: 15:45
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
    <link href="<%=request.getContextPath()%>/css/gmxx.css" rel="stylesheet" type="text/css"/>
    <script type="text/javascript">
        <%
            String username=(String)session.getAttribute("username");
            if(username.equals(null)){
                response.sendRedirect(request.getContextPath()+"/loging/login");
            }
        %>
    </script>
 </head>
<body>
<div id="box">
<!--top start -->
<div id="top">
    <a href="<%=request.getContextPath()%>/indexg/index"><img
            src="<%=request.getContextPath()%>/images/logo.gif" alt="Estimation" width="255" height="58"
            border="0" class="logo"/></a>

    <p class="topDiv"></p>

    <p class="navLeft"></p>
    <ul>
        <li><a href="<%=request.getContextPath()%>/indexg/index" class="hover">首页</a></li>
        <li><a href="#">关于我们</a></li>
        <li><a href="#">在线客服</a></li>
        <li class="chart"><a href="${ctx}chart">购物车</a></li>
    </ul>
    <p class="navRight"></p>

    <p class="topDiv"></p>

    <form name="serch" action="#" method="post">
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
            <div id="welcome" class="welmsgdiv2"><span>您好，欢迎光临果果香。</span><a
                    href="<%=request.getContextPath()%>/loging/login">登录</a><span
                    class="Lloginfg">&nbsp;</span><a href="<%=request.getContextPath()%>/views/reg1">注册</a>
            </div>
        </li>
    </ul>
</div>
<!--header end -->
<!--guide01 start -->
<div class="guide01">
    <img src="<%=request.getContextPath()%>/images/guide_01.jpg" width="973" height="62" border="0"
         usemap="#Map"/>
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
        <DIV id="gwc">
            <DIV class="mcar" style="width:774px; margin:auto"><IMG alt=我的购物车
                                                                    src="<%=request.getContextPath()%>/images/pic_gwc__r2_c2.jpg">
            </DIV>
            <DIV class="title"><SPAN id="transferSpan"></SPAN></DIV>
            <DIV id="divPointError" style="DISPLAY: none; FLOAT: left; MARGIN: 0px 0px 10px">
                <DIV class="pointErrorMsg">您目前的积分为：<SPAN id="myPointNumber">0</SPAN>分，本次购物需支付：<SPAN
                        id="needPointNumber">0</SPAN>分，请修改购物车中的积分换购产品。
                </DIV>
                <IMG id="imgPointError"
                     src="<%=request.getContextPath()%>/images/jifenbuzhu.gif" useMap=#Map border=0>
                <MAP id="Map"
                     name=Map>
                    <AREA shape=RECT coords=962,9,972,19
                          href="javascript:ClosePointError();">
                </MAP>
            </DIV>
            <DIV class="bxSty"><!--Product-->
                <table width="80%" border="0" align="center" cellpadding="0" cellspacing="0" class="tabSty01"
                       id="shoppingCatTable">
                    <tr class="trSty01" bgcolor="#7a7f89">


                        <td align="center" height="32">商品</td>
                        <td align="center" height="32">名称</td>
                        <td align="center" height="32">单价</td>
                        <td align="center" height="32">数量</td>
                        <td align="center" height="32">小计</td>
                        <td align="center">操作</td>
                    </tr>
                    <%
                        int in=0;
                    %>
                    <c:forEach  items="${chart_list}" var="u">
                    <tr>
                        <td width="160" height="160" align="center" valign="middle"><span class="imgw"><a href="#" target="_blank">
                            <img src="<%=request.getContextPath()%>/${u.picpath}"
                                border="0" width="160"/></a></span></td>
                        <td><a href="#" target="_blank"><span class="STYLE5">${u.describe}</span></a></td>
                        <td align="center">￥<span id="00072650<%=in%>">${u.price}</span></td>
                        <td align="center"><input id="OrderAmount_2<%=in%>" maxlength="3"
                                                  onchange="changeSuccess=false;EditProductCount<%=in%>()"
                                                  onkeypress=" if((arguments[0] || window.event).keyCode==13){this.blur(); return false;}"
                                                  style="width: 20px; height: 15px; color: rgb(75, 75, 75);"
                                                  value="1" type="text"/></td>
                        <td align="center">￥<span id="Pdt_price<%=in%>">${u.price}</span></td>
                        <td align="center"><a href="javascript:DeleteProduct<%=in%>();">删除</a></td>
                    </tr>
                        <script type="text/javascript">
                                function EditProductCount<%=in%>() {
                                    var danjia = document.getElementById("00072650<%=in%>").innerHTML;
                                    var shuliang = document.getElementById("OrderAmount_2<%=in%>").value;
                                    var allprice = danjia * shuliang;
                                    document.getElementById("Pdt_price<%=in%>").innerHTML = allprice;
                                    addmoney();
                                }
                                function DeleteProduct<%=in%>(){
                                    var table=document.getElementById("shoppingCatTable");
                                    var tbody=table.getElementsByTagName("tbody")[0];
                                    var tr=document.getElementsByTagName("tr");
                                    tbody.removeChild(tr[1]);
                                    addmoney();
                                }
                        </script>
                        <%
                            in+=1;
                        %>
                    </c:forEach>
                    <script type="text/javascript">
                        var list=${chart_list};
                        function addmoney() {
                            for(var i=0;i<list.length;i++){
                                var xiaoji=document.getElementById('"Pdt_pric"+"i"');
                                allprice+=xiaoji;
                                document.getElementById("spRealTotalAmount").innerHTML = allprice;
                            }
                        }
                    </script>
                </table>
                <td>
                    &nbsp; &nbsp;
                    <a href="<%=request.getContextPath() %>/chartg/chart_list?chartpageIndex=${chartpageIndex-1<=0?1:chartpageIndex-1}" style="color:black;"><<</a>&nbsp;
                    第${chartpageIndex}页/共${totalPages}页
                    <a href="<%=request.getContextPath() %>/chartg/chart_list?chartpageIndex=${chartpageIndex+1>totalPages?totalPages:chartpageIndex+1}" style="color:black;">>></a>
                </td>
                <TABLE width="80%" border=0 align="center" cellPadding=0 cellSpacing=0 class="dobuleBorder">

                </TABLE>
                <TABLE width="80%" border=0 align="center" cellPadding=0 cellSpacing=0 class="tabSty001">
                    <TBODY>
                    <TR>
                        <TD class="tdSty03" vAlign=top align=left colSpan=2><A
                                href="<%=request.getContextPath()%>/indexg/index"><IMG
                                src="<%=request.getContextPath()%>/images/pic_gwc__r10_c3.jpg" alt=继续购物
                                width=95 height=25 border="0"></A><A
                                href="<%=request.getContextPath()%>/indexg/index">&nbsp;<IMG
                                src="<%=request.getContextPath()%>/images/pic_gwc__r10_c8.jpg" alt=清空购物车
                                width=95 height=25 border="0"
                                class="jl02"></A></TD>
                        <TD align=left>&nbsp;</TD>
                        <TD align=middle>&nbsp;</TD>
                        <TD class="tdSty04" vAlign=top align=right colSpan=3><A
                                href="<%=request.getContextPath()%>/meraddr/addr?username=${username}"><IMG
                                src="<%=request.getContextPath()%>/images/pic_gwc__r2_c10.jpg" alt=去结算
                                border="0"></A></TD>
                    </TR>
                    </TBODY>
                </TABLE>
                <!--Product end--></DIV>
            <DIV id=OffProductList></DIV>
            <TABLE cellSpacing=0 cellPadding=0 width=760 border=0>
                <TBODY>
                <TR>
                    <TD vAlign=center align=left><SPAN
                            id="TenPayNotice"></SPAN></TD>
                </TR>
                </TBODY>
            </TABLE><SPAN
                id="leavelNotMustPresentLsit"></SPAN>

            <DIV class="sty006 reusableColor3" align=left style="width:774px; padding:0; margin:auto">
                您在购物过程中有任何疑问，请查阅 <A
                    href="#" target=_blank><SPAN
                    class="reusableColor1">帮助中心</SPAN></A> 或 <A href="#"
                                                                target=_blank><SPAN
                    class="reusableColor1">联系客服</SPAN></A></DIV>
            <DL class="dobuleBorder" style="display:none;">
                <DT><STRONG>关于"我的购物车"</STRONG></DT>
                <DD>·为方便您提交订单，您添加至"我的购物车"中已经选择的、尚未提交订单的商品清单，我们将为您保留90天。<BR>·在商品保留期间，您所选择商品的价格、优惠政策、库存、配送时间等信息可能会有所变化，请以网页最新信息为准。
                </DD>
            </DL>
        </DIV>
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
    <p class="copyright">Copyright 2010 All Rights Reserved 冀ICP证xxxxxx号

    </p>

    <p class="design"><a href="#" target="_blank" class="link">启奥科技</a></p>
</div>
<!--footer end -->
<!--body end -->
</div>
<!--box-->
</body>
</html>
