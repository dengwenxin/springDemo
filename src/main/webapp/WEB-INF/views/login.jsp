<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<c:url value="/" var="baseUrl" />
<link rel="stylesheet" href="${baseUrl}css/login.css">
<title>Login</title>
</head>
<body>
  <div id="loginMain">
  <div style="color:red">${error }</div>
    <form action="login" method="POST">
      <div id="loginUserName">
        <input class="loginInput" type="text" placeholder="用户名" name="userName" />
      </div>
      <div id="password">
        <input class="loginInput" type="password" placeholder="密码" name="password" />
      </div>
      <div id="loginBtnDiv">
        <input id="loginBtn" type="submit" value="Login" />
      </div>
    </form>
  </div>
</body>
