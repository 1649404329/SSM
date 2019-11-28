<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/statics/css/login.css" />
</head>

<body>
	<div class="main">
		<div class="title">
			<span>密码登录</span>
		</div>
		<!-- 登录异常信息显示 -->
		<div class="info">${message }</div>
		<div class="info">${exception.message }</div>
		
		<div class="title-msg">
			<span>请输入登录账户和密码</span>
		</div>

		<form class="login-form"
			action="${pageContext.request.contextPath }/student/login.html"
			method="post" novalidate>
			<!--输入框-->
			<div class="input-content">
				<!--autoFocus-->
				<div>
					<input type="text" autocomplete="off" placeholder="用户名"
						name="username" value="zy" required />
				</div>

				<div style="margin-top: 16px">
					<input type="password" autocomplete="off" placeholder="登录密码"
						value="123456" name="password" required maxlength="32" />
				</div>
			</div>

			<!--登入按钮-->
			<div style="text-align: center">
				<button type="submit" class="enter-btn">登录</button>
			</div>

			<div class="foor">
				<div class="left">
					<span>忘记密码 ?</span>
				</div>

				<div class="right">
					<span>注册账户</span>
				</div>
			</div>
		</form>
	</div>
</body>
</html>