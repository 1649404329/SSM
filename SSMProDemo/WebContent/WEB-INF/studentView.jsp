<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="/WEB-INF/index.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>数据主页</title>
<style type="text/css">
	#pageMain{
		font-size: 26px;
		color: white;
	}
	td{
		width: 50px;
	}
	h2{
		color: white;
	}
</style>

</head>
<body>
	<h2>学生信息</h2>
	<table>
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
			</tr>
	</table>
	
</body>
</html>