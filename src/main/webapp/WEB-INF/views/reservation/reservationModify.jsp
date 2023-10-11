<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>예약 수정</title>
</head>
<body>
    <h1>예약 수정</h1>
    <form action="/reservation/modify" method="post">
        <input type="hidden" name="R_name" value="${reservation.R_name}">
        <label for="R_date">날짜:</label>
        <input type="date" id="R_date" name="R_date" value="${reservation.R_date}" required><br>
        <label for="R_hospital_name">병원 이름:</label>
        <input type="text" id="R_hospital_name" name="R_hospital_name" value="${reservation.R_hospital_name}" required><br>
        <input type="submit" value="예약 수정">
    </form>
</body>
</html>
