<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="/WEB-INF/views/include/include-head.jspf" %>
</head>
<body>
	<header>
		<button id="btn_home" title="Home">Korea Beach Infomation</button>
	<nav>
		<button class="main_btn" title="인천, 경기도" id="btn_gg">Gyeonggi</button>
		<button class="main_btn" title="충청도" id="btn_cc">Chungcheong</button>
		<button class="main_btn" title="강원도" id="btn_gw">Gangwon</button>
		<button class="main_btn" title="부산, 울산, 경상도" id="btn_gs">Gyeongsang</button>
		<button class="main_btn" title="전라도" id="btn_jl">Jeonla</button>
		<button class="main_btn" title="제주특별자치도" id="btn_jj">Jeju</button>
	</nav>
	</header>
	<section>
	
		<c:forEach var="vo" items="${BLIST}">
			<div class="sub_btn_wrapper animatable fadeInUp" >
				<button class="sub_btn" id="${vo.title}" data-beach-id="${vo.b_id}">${vo.title}</button>
				<div class="sub_img_wrapper">
				<img class="sub_img" alt="해수욕장사진" src="${vo.imgurl}" width="280" height="180" data-beach-id="${vo.b_id}">
				</div>
			</div>
		</c:forEach>
	
	</section>
	<footer>
	
	</footer>
</body>
</html>