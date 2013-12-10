<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<header class="header_wrapper"><!--header_wrapper Start-->
		<div class="header"><!--header Start-->
			<div class="logo fltleft">
				<a href="#"><img src="img/logo.png" alt="" /></a>
			</div>
			<div class="navigation fltright">
				<!--navigation Start-->
				<ul class="sf-menu">
					<li class="active"><a href="main.jsp">首页</a></li>
					<li><a href="myinfo.jsp">我的资料</a></li>
					<li><a href="announce.jsp">发布信息</a></li>
				    <li><a href="findstudent.jsp">找学生</a></li>
				    <li><a href="findteacher.jsp">找老师</a></li>
					<li><a href="myacount.jsp">${username}</a>
						<ul>
							<li><a href="#">My Account</a></li>
							<li><a href="#">Billing Settings</a></li>
							<li><a href="#">Notifications</a></li>
						</ul>
					</li>
		            <li id="nosep"><a href="register.jsp">注册</a></li>
				</ul>
			</div>
			<!--navigation End-->
		</div>
		<!--header End-->

	</header>
	<!--header_wrapper End-->
</body>
</html>