<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 2019/4/8
  Time: 21:23
  To change this template use File | Settings | File Templates.
--%>
<%@page isELIgnored="false" pageEncoding="UTF-8" contentType="text/html; UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>emplist</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="css/style.css" />
</head>
<body>
<div id="wrap">
    <div id="top_content">
        <div id="header">
            <div id="rightheader">
                <p>
                    2009/11/20
                    <br />
                </p>
            </div>
            <div id="topheader">
                <h1 id="title">
                    <a href="#">main</a>
                </h1>
            </div>
            <div id="navigation">
            </div>
        </div>
        <div id="content">
            <p id="whereami">
            </p>
            <h1>
                Welcome!
            </h1>
            <table class="table">
                <tr class="table_header">
                    <td>ID</td>
                    <td>Name</td>
                    <td>Salary</td>
                    <td>Age</td>
                    <td>Operation</td>
                </tr>
                <c:forEach items="${requestScope.list}" var="list">
                <tr class="row1">
                    <td>${list.id}</td>
                    <td>${list.name}</td>
                    <td>${list.salary}</td>
                    <td>${list.sex}</td>
                    <td>
                        <a href="${pageContext.request.contextPath}/ems/delete?id=${list.id}">delete emp</a>&nbsp;
                        <a href="/ems/updateEmp.jsp?id=${list.id}&name=${list.name}&age=${list.age}&salary=${list.salary}&sex=${list.sex}">update emp</a>
                    </td>
                </tr>
                </c:forEach>
            </table>
            <p>
                <input type="button" class="button" value="Add Employee" onclick="location='/ems/addEmp.jsp'"/>
            </p>
        </div>
    </div>
    <div id="footer">
        <div id="footer_bg">
            ABC@126.com
        </div>
    </div>
</div>
</body>
</html>