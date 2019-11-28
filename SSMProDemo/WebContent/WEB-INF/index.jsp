<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>数据主页</title>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/statics/css/index.css" />

	
</head>
<body>
	<header class="Header">
        <h1>学生信息管理系统</h1>
        <div class="publicHeaderR">
            <p><span style="color: red"> ${student.stuName }</span> , 欢迎你！</p>
            <a href="${pageContext.request.contextPath }/student/logout.html">退出登录</a>
        </div>
    </header>
	<div class="main">
			<ul>
				<li><a href="${pageContext.request.contextPath }/student/studentList.html">学生列表</a></li>
				<li><a href="#">我我</a></li>
				<li><a href="#">我我</a></li>
				<li><a href="#">我我</a></li>
				<li><a href="#">我我</a></li>
			</ul>
		</div>
</body>
</html>