<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>修改用户</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改用户</small>
                </h1>
            </div>
        </div>
    </div>
    <form action="${pageContext.request.contextPath}/user/updateUser" method="post">

        <input type="hidden" name="id" value="${user.id}">
        <div class="form-group">
            <label>用户姓名：</label>
            <input type="text" class="form-control" name="name" value="${user.name}" required>
        </div>
        <div class="form-group">
            <label>用户名：</label>
            <input type="text" class="form-control" name="username" value="${user.username}" required>
        </div>
        <div class="form-group">
            <label>密码：</label>
            <input type="text" class="form-control" name="password" value="${user.password}" required>
        </div>
        <input type="submit" value="修改">
    </form>

</div>
