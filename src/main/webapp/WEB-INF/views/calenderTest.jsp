<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<head>
<%@include file="common.jsp"%>
<meta charset="utf-8">
<script src="${baseUrl}js/calederTest.js"></script>

</head>

<body>
  <div id="header">
    <%@include file="header.jsp"%>
  </div>
  <div id="content">
    <form id="calender" method="POST" action="${baseUrl }calenderTest">
      <div id="container" style="min-width: 1000px; height: 400px; margin-top: 10px;">
        <div id="mainCal"> </div>
      </div>
    </form>
  </div>
  <div id="left">
    <%@include file="left.jsp"%>
  </div>
</body>