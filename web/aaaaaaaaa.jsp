<html>
<head><title>Apache Tomcat/7.0.54 - Error report</title>
    <style><!--
    H1 {
        font-family: Tahoma, Arial, sans-serif;
        color: white;
        background-color: #525D76;
        font-size: 22px;
    }

    H2 {
        font-family: Tahoma, Arial, sans-serif;
        color: white;
        background-color: #525D76;
        font-size: 16px;
    }

    H3 {
        font-family: Tahoma, Arial, sans-serif;
        color: white;
        background-color: #525D76;
        font-size: 14px;
    }

    BODY {
        font-family: Tahoma, Arial, sans-serif;
        color: black;
        background-color: white;
    }

    B {
        font-family: Tahoma, Arial, sans-serif;
        color: white;
        background-color: #525D76;
    }

    P {
        font-family: Tahoma, Arial, sans-serif;
        background: white;
        color: black;
        font-size: 12px;
    }

    A {
        color: black;
    }

    A.name {
        color: black;
    }

    HR {
        color: #525D76;
    }

    --></style>
</head>
<body><h1>HTTP Status 500 - java.lang.ClassNotFoundException: org.apache.jsp.Reception.reg_jsp</h1>
<HR size="1" noshade="noshade">
<p><b>type</b> Exception report</p>

<p><b>message</b> <u>java.lang.ClassNotFoundException: org.apache.jsp.Reception.reg_jsp</u></p>

<p><b>description</b> <u>The server encountered an internal error that prevented it from fulfilling this request.</u>
</p>

<p><b>exception</b> <pre>org.apache.jasper.JasperException: java.lang.ClassNotFoundException: org.apache.jsp.Reception.reg_jsp
	org.apache.jasper.servlet.JspServletWrapper.getServlet(JspServletWrapper.java:177)
	org.apache.jasper.servlet.JspServletWrapper.service(JspServletWrapper.java:369)
	org.apache.jasper.servlet.JspServlet.serviceJspFile(JspServlet.java:390)
	org.apache.jasper.servlet.JspServlet.service(JspServlet.java:334)
	javax.servlet.http.HttpServlet.service(HttpServlet.java:727)
	org.apache.tomcat.websocket.server.WsFilter.doFilter(WsFilter.java:52)
	org.springframework.web.filter.CharacterEncodingFilter.doFilterInternal(CharacterEncodingFilter.java:88)
	org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:106)
</pre>
</p><p><b>root cause</b> <pre>java.lang.ClassNotFoundException: org.apache.jsp.Reception.reg_jsp
	java.net.URLClassLoader$1.run(URLClassLoader.java:366)
	java.net.URLClassLoader$1.run(URLClassLoader.java:355)
	java.security.AccessController.doPrivileged(Native Method)
	java.net.URLClassLoader.findClass(URLClassLoader.java:354)
	org.apache.jasper.servlet.JasperLoader.loadClass(JasperLoader.java:132)
	org.apache.jasper.servlet.JasperLoader.loadClass(JasperLoader.java:63)
	org.apache.jasper.servlet.JspServletWrapper.getServlet(JspServletWrapper.java:172)
	org.apache.jasper.servlet.JspServletWrapper.service(JspServletWrapper.java:369)
	org.apache.jasper.servlet.JspServlet.serviceJspFile(JspServlet.java:390)
	org.apache.jasper.servlet.JspServlet.service(JspServlet.java:334)
	javax.servlet.http.HttpServlet.service(HttpServlet.java:727)
	org.apache.tomcat.websocket.server.WsFilter.doFilter(WsFilter.java:52)
	org.springframework.web.filter.CharacterEncodingFilter.doFilterInternal(CharacterEncodingFilter.java:88)
	org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:106)
</pre>
</p><p><b>note</b> <u>The full stack trace of the root cause is available in the Apache Tomcat/7.0.54 logs.</u></p>
<HR size="1" noshade="noshade">
<h3>Apache Tomcat/7.0.54</h3></body>
</html>