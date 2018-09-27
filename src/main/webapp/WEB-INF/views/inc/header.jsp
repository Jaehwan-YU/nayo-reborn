<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<header>
	<h1><a href="/"><img src="" alt="나요"/></a></h1>
	<section>
		<h1>검색</h1>
		<form>
			<input type="text" placeholder="재료명, 레시피 검색" />
			<input type="submit" value="검색" />
		</form>
	</section>
	
	<nav>
		<h1>회원메뉴</h1>
		<ul>
			<li><a href="nayo-reborn/login">로그인</a></li>
			<li><a href="nayo-reborn/notice/list">고객센터</a></li>
			<li><a href="nayo-reborn/signup">회원가입</a></li>
		</ul>
	</nav>
	
	<nav>
		<h1>메인메뉴</h1>
		<ul>
			<li><a href="nayo-reborn/member/food">나의 식재료</a></li>
			<li><a href="nayo-reborn/recipe/list">레시피</a></li>
			<li><a href="nayo-reborn/member/shopbag">장바구니</a></li>
			<li><a href="nayo-reborn/member/menu">나의 식단</a></li>
		</ul>
	</nav>
</header>