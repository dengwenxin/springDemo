<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<head>
<%@include file="common.jsp"%>
<link rel="stylesheet" href="${baseUrl}css/binaryCode.css">
<script src="${baseUrl}js/binaryCode.js"></script>
<meta charset="utf-8">
</head>

<body>
  <div id="header">
    <%@include file="header.jsp"%>
  </div>
  <div id="content">
    <form id="binaryCode" method="POST" action="${baseUrl }BinaryCode">
      <div class="binaryContent">
        <div>
          <table>
            <tr>
             <td><label>输入二维码内容:</label></td>
             <td><input id="codeInput" style="width:200px" name="codeContent"></input></td>
            </tr>
            <tr>
              <td><label>图片名字:</label></td>
              <td><input id="imageNameInput" style="width:200px" name="imageName"></input></td>
            </tr>
          </table>
         </div>
        <div id="createBinaryDiv">
           <button id="createBinaryCode" style="width:100px;height:28px;" value="createBinary">生成二维码</button>
        </div>
        <div><label>二维码内容：</label><label id="outCode" >${deImageContent }</label></div>
        <div><img src=${imageUrl }/></div>
      </div>
    </form>
  </div>
  <div id="left">
    <%@include file="left.jsp"%>
  </div>
</body>