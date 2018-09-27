<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<main>
	<h1>인덱스페이지</h1>
	<section>
		<h1>추천 레시피</h1>
		<table>
			<tr>
			<%-- <c:forEach> --%>
				<td>
					<ul>
						<li><img src="/"></li>
						<li>사과샌드위치</li>
					</ul>
				</td>
			<%-- </c:forEach> --%>
			</tr>
		</table>
	</section>
	
	<section>
		<h1>가을철 레시피</h1>
		<table>
			<tr>
			<%-- <c:forEach> --%>
				<td>
					<ul>
						<li><img src="/"></li>
						<li>전어구이</li>
					</ul>
				</td>
			<%-- </c:forEach> --%>
			</tr>
		</table>
	</section>
	
	<section>
		<h1>알아두면 좋은 손질법</h1>
		<table>
			<tr>
				<td>번호</td>
				<td>제목</td>
				<td>작성일</td>
			</tr>
			<tr>
				<td>1</td>
				<td>조개 해감하기</td>
				<td>2018/09/01</td>
			</tr>
		</table>
	</section>
</main>