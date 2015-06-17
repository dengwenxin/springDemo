<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<head>
<%@include file="common.jsp"%>
<link rel="stylesheet" href="${baseUrl}css/courseManager.css"></script>
<meta charset="utf-8">
</head>

<body>
  <div id="header">
    <%@include file="header.jsp"%>
  </div>
  <div id="content">
    <form id="courseManager" method="POST" action="${baseUrl }courseManager">
      <table id="coureTable" cellspacing="0" cellpadding="10">
        <thead >
          <tr> 
            <th class="coureTableTd">课程号</th>
            <th class="coureTableTd"> 课程名</th>
            <th class="coureTableTd"> 课程说明</th>
          </tr>
        </thead>
        <tbody>
        </tbody>
      </table>
    </form>
  </div>
  <div id="left">
    <%@include file="left.jsp"%>
  </div>
</body>