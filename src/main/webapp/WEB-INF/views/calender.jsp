<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<head>
<%@include file="common.jsp"%>
<meta charset="utf-8">
<script src="${baseUrl}js/index.js"></script>
<script src="${baseUrl}js/makCal.js"></script>

</head>

<body>
  <div id="header">
    <%@include file="header.jsp"%>
  </div>
  <div id="content">
    <form id="calender" method="POST" action="${baseUrl }calender">
      <div id="container" style="min-width: 1000px; height: 400px; margin-top: 10px;">

        <div class="yearmonth fll" style="display: inline-block;">
          <div id="dropdownYear" class="year jp-dropdown fll">
            <div class="numberCal fll ">
              <span id="yearValue">2014</span>
            </div>
          </div>
        </div>
<!--         <ul id="yearjpDDM" class="jp-dropdown-menu jp-ddmH-extend" style="display: block; list-style-type: none"></ul> -->
        <select id="yearjpDDM" style="width: 80px "> </select>

        <div class='month jp-dropdown fll' id='dropdownMonth' style="display: inline-block;">
          <div class='numberCal fll '>
            <span id='monthValue'></span>
          </div>
          <div class='selectdown fll' id="select1"></div>
          <select class='jp-dropdown-menu w59' style="width: 80px ">
            <option>01月</option>
            <option>02月</option>
            <option>03月</option>
            <option>04月</option>
            <option>05月</option>
            <option>06月</option>
            <option>07月</option>
            <option>08月</option>
            <option>09月</option>
            <option>10月</option>
            <option>11月</option>
            <option>12月</option>
          </select>
        </div>

        <div class='calendar' id='mainCal' style="background: #fff;">
          <table>
            <thead class="tablehead">
              <tr>
                <td class="thead" style="color: #bc5016;">日</td>
                <td class="thead">一</td>
                <td class="thead">二</td>
                <td class="thead">三</td>
                <td class="thead">四</td>
                <td class="thead">五</td>
                <td class="thead" style="color: #bc5016;">六</td>
              </tr>
            </thead>
          </table>
        </div>
      </div>
    </form>
  </div>
  <div id="left">
    <%@include file="left.jsp"%>
  </div>
</body>