<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/reservation/add" method="post">	<!-- todo: http://localhost:8080/guest/write 부분 해결 -->
		<textarea rows="3" name='R_name'></textarea>
		<textarea rows="3" name='R_date'></textarea>
		<textarea rows="3" name='R_hospital_name'></textarea>
		<input type="submit" value="예약">
	</form>
</body>
</html>