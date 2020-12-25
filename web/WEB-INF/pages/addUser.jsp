<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>新增书籍</title>
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
                    <small>新增用户</small>
                </h1>
            </div>
        </div>
    </div>
    <form action="${pageContext.request.contextPath}/user/addUser" method="post">
        <div class="form-group">
            <label>用户姓名：</label>
            <input type="text" class="form-control" name="name" required>
        </div>
        <div class="form-group">
            <label>用户名：</label>
            <input type="text" class="form-control" name="username" required>
        </div>
        <div class="form-group">
            <label>密码：</label>
            <input type="text" class="form-control" name="password" required>
        </div>
        <input type="submit" value="添加">
    </form>

</div>
