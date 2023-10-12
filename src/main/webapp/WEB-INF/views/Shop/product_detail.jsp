<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>${product.pName} - 제품 상세 정보</title>
    <style>
        /* 기본 스타일 */
        body {
            font-family: 'Arial', sans-serif;
            margin: 20px;
        }
        .product-detail {
            display: flex;
        }
        .product-image {
            margin-right: 20px;
        }
        .product-description {
            flex: 1;
        }
        h1 {
            font-size: 24px;
            margin-bottom: 10px;
        }
        p {
            margin-bottom: 10px;
        }
    </style>
</head>
<body>

<div class="product-detail">
    <!-- 제품 이미지 -->
    <div class="product-image">
        <img src="${product.pImage}" alt="${product.pName} 이미지" width="300">
    </div>

    <!-- 제품 상세 정보 -->
    <div class="product-description">
        <h1>${product.pName}</h1>
        <p><strong>브랜드:</strong> ${product.pBrand}</p>
        <p><strong>가격:</strong> ${product.pPrice}원</p>
        <p><strong>재고:</strong> ${product.pStock}개</p>
        <p><strong>카테고리:</strong> ${product.pCategory}</p>
        <p><strong>태그:</strong> ${product.pTags}</p>
        <p><strong>설명:</strong> ${product.pDescription}</p>
        <p><strong>생성 일자:</strong> ${product.pCreatedDate}</p>
        <p><strong>업데이트 일자:</strong> ${product.pUpdatedDate}</p>
    </div>
</div>

</body>
</html>
