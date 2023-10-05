<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>예약 관리</title>
</head>
<body>
    <h1>예약 관리</h1>
    
    <h2>예약 추가</h2>
    <form action="/reservation/add" method="post">
        <label for="exId">병원명:</label>
        <input type="text" id="exId" name="B_hospital_name" required><br>
        
        <label for="exBookNumber">예약 이름:</label>
        <input type="text" id="exName" name="B_name" required><br>
        
        <label for="exBookDate">예약 날짜:</label>
        <input type="date" id="exBookDate" name="B_date" required><br>
        
        <input type="submit" value="추가">
    </form>
    
    <h2>예약 목록</h2>
    <table border="1">
        <tr>
            <th>병원명</th>
            <th>예약 이름</th>
            <th>예약 날짜</th>
            <th>동작</th>
        </tr>
        <c:forEach var="reservation" items="${reservations}">
            <tr>
                <td>${reservation.B_hospital_name}</td>
                <td>${reservation.B_name}</td>
                <td>${reservation.B_date}</td>
                <td>
                    <a href="/reservation/modify?B_name=${reservation.B_name}">수정</a>
                    <a href="/reservation/delete?B_name=${reservation.B_name}">삭제</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
