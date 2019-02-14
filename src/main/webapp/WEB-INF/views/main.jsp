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
		<fieldset class="main_fieldset">
			<legend class="main_legend">추천 해수욕장</legend>
			<table id="main_table">
			<tr>
			<c:forEach var="vo" items="${RECOMMENDLIST}">
				<td class="main_td">
				<div>
				<button class="sub_btn" id="${vo.title}" data-beach-id="${vo.b_id}">${vo.title}</button>
				<div class="main_img_wrapper">
				<img class="sub_img" alt="해수욕장사진" src="${vo.imgurl}" data-beach-id="${vo.b_id}" width="160" height="120">
				</div>
				</div>
				</td>
			</c:forEach>
			</tr>
			</table>
		</fieldset>
		<fieldset class="main_fieldset">
			<legend class="main_legend">최근 한줄평</legend>
			<table id="views">
			<c:forEach var="memo" items="${RECENTLIST}">
				<tr id="main_list" onclick="location.href='/beach/ex?b_id=${memo.b_id}'">
					<td id="view_title">${memo.b_title}</td>
					<td id="view_date">${memo.m_date}</td>
					<td id="view_auth">${memo.m_auth}</td>
					<td id="view_memo">${memo.m_memo}</td>
				</tr>
			</c:forEach>
			</table>	
		</fieldset>
	</section>
	<footer>
	
	</footer>
</body>
</html>