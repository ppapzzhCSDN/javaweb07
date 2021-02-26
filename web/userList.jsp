<%-- Created by IntelliJ IDEA. --%>
<%--登录后跳转到前端的界面--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
  <head>
    <title></title>
    <link rel="stylesheet" href="../static/css/bootstrap-3.3.7-dist/css/bootstrap.css">
    <%--..相对路径--%>
    <%--<link rel="stylesheet" href="${path}/static/bootstrap/css/bootstrap.css">--%>
    <%--{path}专门解决上下文路径  其实就是等于pageContext.request.conTextPath--%>
  </head>
  <body>
  <table class="table table-bordered">
    <tr>
      <td>序号</td>
      <td>id</td>
      <td>账号</td>
      <td>性别</td>
      <td>创建时间</td>
    </tr>
<c:forEach items="${listUser}" var="user" varStatus="status">
  <%--下一步是表格进行进一步循环--%>
  <tr>
    <td>${status.count}</td>
    <td>${user.id}</td>
    <td>${user.username}</td>
    <td>${user.sex}</td>
    <td>${user.createTime}</td>

  </tr>

</c:forEach>
  </table>
  </body>
</html>