<%@page import="java.util.ArrayList"%>
<%@page import="com.teamp.spring.tp.dto.BoardVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
글번호:${read.no}
글제목:${read.title}
<hr>
글내용:${read.content}
<hr>
글쓴이:${read.writer}
작성일:${read.writedate}
조회수:${read.readcount}
<hr>
<a href="/tp/board/BoardEdit?no=${read.no}"><button>글수정</button></a>
<a href="/tp/board/BoardDelete?no=${read.no}"><button>글삭제</button></a>
<a href="/tp/board/BoardList"><button>글목록</button></a>
</body>
</html>