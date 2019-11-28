<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="/WEB-INF/index.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>数据主页</title>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/statics/css/studentList.css" />
<script type="text/javascript" src="${pageContext.request.contextPath }/statics/js/jquery-1.11.0.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/statics/js/studentList.js"></script>
</head>
<body>
	
	<table class="providerTable" cellpadding="0" cellspacing="0">
		<tr class="firstTr">
			<th>学号</th>
			<th>姓名</th>
			<th>班级</th>
			<th>年龄</th>
			<th>性别</th>
			<th>查看</th>
			<th>修改</th>
			<th>删除</th>
		</tr>
		<c:forEach var="student" items="${studentList}" varStatus="status">
			<tr id="pageMain">
				<td><span>${student.stuNo }</span></td>
				<td><span>${student.stuName }</span></td>
				<td><span>${student.stuClass}</span></td>
				<td><span>${student.stuAge}</span></td>
				<td>
					<span>
					 <c:if test="${student.stuSex==1}">男</c:if> 
					 <c:if test="${student.stuSex==0}">女</c:if>
					</span>
				</td>
				<td>
					<span><a class="viewStudent" href="${pageContext.request.contextPath}/student/${student.stuNo}" >查看</a></span>
				</td>
				<td>
					<span><a class="modifyStudent" href="#" >修改</a></span>
				</td>
				<td>
					<span ><a class="deleteStudent" href="${pageContext.request.contextPath}/student/delStudent.html?stuNo=${student.stuNo}" >删除</a></span>
				</td>
			</tr>
			
		</c:forEach>
	</table>
	
</body>
</html>