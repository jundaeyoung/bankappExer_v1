<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/view/layout/header.jsp"%>


<div class="col-sm-8">
	<h2>로그인</h2>
	<h5>어서오세요 환영합니다.</h5>
	<div class="bg-light p-md-5 h-75">
		<form action="/user/sign-in" method="post">
			<div class="form-group">
				<label for="username">User name:</label> <input type="text" class="form-control" placeholder="사용자 이름을 입력해주세요." id="username" name="username">
			</div>
			<div class="form-group">
				<label for="pwd">Password:</label> <input type="password" class="form-control" placeholder="비밀번호를 입력해주세요." id="pwd" name="password">
			</div>
			<button type="submit" class="btn btn-primary" style="margin-top: 10px;">Submit</button>
		</form>
	</div>
	<br>
</div>

<%@ include file="/WEB-INF/view/layout/footer.jsp"%>

