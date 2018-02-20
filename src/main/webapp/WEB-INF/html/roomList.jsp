<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/2/20
  Time: 18:04
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>教室列表</title>
</head>
<body>
<table>
    <tr>
        <td>教室编号</td>
        <td>教室大小</td>
        <td>教室地址</td>
    </tr>
    <c:forEach items="${roomList}" var="item">
        <tr>
            <td>${item.roomid}</td>
            <td>${item.roomsize}</td>
            <td>${item.roomposition}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
