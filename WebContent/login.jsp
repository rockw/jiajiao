<%-- 
    Document   : login
    Created on : 2012-10-8, 11:20:40
    Author     : rock
--%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8" import="java.util.*"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>注册</title>
    </head>
    <body>
        <h1>登录页面</h1>
        <hr>
        <html:errors/>
        <logic:present name="msg" scope="request">
            <h4>${msg}</h4>
        </logic:present>
        <html:form action="login.do" method="post">
            用户名：<html:text property="loginner" /><br>
            密&nbsp;&nbsp;&nbsp;&nbsp;码：<html:password property="password"/><br>
            <html:submit value="登录"></html:submit>
        </html:form>
    </body>
</html>
