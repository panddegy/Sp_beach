<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="/WEB-INF/views/include/include-head.jspf" %>
<script type="text/javascript">
$(function(){
	$("#btn_submit").click(function(){
		var auth=$("#m_auth").val()
		var memo=$("#m_memo").val()
		if(auth==""){
			alert("input author")
			$("#m_auth").focus()
			return false
		}
		if(memo==""){
			alert("input text")
			$("#m_memo").focus()
			return false
		}
		$("form").submit()
	})


})
</script>
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
		
	<fieldset id="ex_fieldset">
			
		<legend id="ex_legend" onclick="window.open('${BEACH.homepage}')" title="관련사이트">${BEACH.title}</legend>
		<div>
			<img id="ex_img" alt="해수욕장사진" src="${BEACH.imgurl}" width="460" height="370">
			<div id="ex_map">${BEACH.mapurl}</div>
		</div>
		<div id="ex_text">
			<p id="ex_subtitle">${BEACH.subtitle}</p>
			<p>Activity &nbsp;&nbsp;&nbsp;&nbsp;: ${BEACH.topic}</p>
			<p>Address &nbsp;&nbsp;&nbsp;: ${BEACH.addr}</p>
			<p>Telephone : ${BEACH.tel}</p>
		</div>
		<hr>
		<div>
		<c:choose>
			<c:when test="${empty MEMO}"></c:when>
		<c:otherwise>
		
		<table id="views">
			<c:forEach var="memo" items="${MEMO}">
				<tr>
					<td id="view_date">${memo.m_date}</td>
					<td id="view_auth">${memo.m_auth}</td>
					<td id="view_memo">${memo.m_memo}</td>
				</tr>
			</c:forEach>
		</table>	
		
		</c:otherwise>
		</c:choose>
		</div>
		<hr>
		<form action="write" method="post">
			<input type="hidden" id="b_id" name="b_id" value="${BEACH.b_id}">
			<input type="hidden" id="b_title" name="b_title" value="${BEACH.title}">
			<input type="text" id="m_auth" name="m_auth" placeholder="작성자">
			<input type="text" id="m_memo" name="m_memo" placeholder="한줄평을 입력하세요(255자)">
			<button type="button" id="btn_submit">submit</button>
		</form>
		</fieldset>
	</section>
	<footer>
	
	</footer>
</body>
</html>














