<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보 수정</title>
</head>
<body>
 <style>
        body {
            margin-top: 15%;
            margin-left: 30%;
            margin-right: 30%;
            text-align: center;
        }

        form {
            text-align: left;
        }
    </style>
<form action="/tp/Login/editInfo" method="post">
    <br>id:<input type="text" id="U_ID" name ="U_ID" value="<%= session.getAttribute("U_ID") %>" readonly>
    <br>name:<input type="text" id="U_NAME" name="U_NAME" value="<%= session.getAttribute("U_NAME") %>">
    <br>address:<input type="text" id="U_ADDRESS" name="U_ADDRESS" value="<%= session.getAttribute("U_ADDRESS") %>">
    <br>email:<input type="text" id="U_EMAIL" name="U_EMAIL" value="<%= session.getAttribute("U_EMAIL") %>">
    <br>phone:<input type="text" id="U_PHONE" name="U_PHONE" value="<%= session.getAttribute("U_PHONE") %>">
    <input type="submit" id="registerButton" value="정보 수정">
</form>
</body>
</html>