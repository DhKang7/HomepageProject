<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>예약 관리</title>
</head>
<body>
    <h1>예약 관리</h1>

    <!-- 예약 추가 폼 -->
    <form action="/reservation/bookadd" method="post">
        <h2>예약 추가</h2>
        <label for="add_R_name">이름:</label>
        <input type="text" id="add_R_name" name="R_name" required><br>
        <label for="add_R_date">날짜:</label>
        <input type="date" id="add_R_date" name="R_date" required><br>
        <label for="add_R_hospital_name">병원 이름:</label>
        <input type="text" id="add_R_hospital_name" name="R_hospital_name" required><br>
        <input type="submit" value="예약 추가">
    </form>

    <!-- 예약 목록 -->
    <h2>예약 목록</h2>
    <table>
        <thead>
            <tr>
                <th>이름</th>
                <th>날짜</th>
                <th>병원 이름</th>
                <th>옵션</th>
            </tr>
        </thead>
        <tbody>
            <!-- 서버로부터 받은 데이터를 이곳에 삽입 -->
            <tr>
                <td>예약자 이름</td>
                <td>날짜</td>
                <td>병원 이름</td>
                <td>
                    <a href="/reservation/confirmDelete?R_name=예약자 이름">삭제</a>
                    <a href="/reservation/editReservation?R_name=예약자 이름">수정</a>
                </td>
            </tr>
            <!-- 추가 데이터에 대한 루프 -->
        </tbody>
    </table>

    <!-- 예약 수정 폼 -->
    <h2>예약 수정</h2>
    <form action="/reservation/bookmodify" method="post">
        <input type="hidden" name="R_name" value="예약자 이름">
        <label for="edit_R_name">이름:</label>
        <input type="text" id="edit_R_name" name="R_name" value="예약자 이름" required><br>
        <label for="edit_R_date">날짜:</label>
        <input type="date" id="edit_R_date" name="R_date" value="날짜" required><br>
        <label for="edit_R_hospital_name">병원 이름:</label>
        <input type="text" id="edit_R_hospital_name" name="R_hospital_name" value="병원 이름" required><br>
        <input type="submit" value="예약 수정">
    </form>
    
</body>
</html>
