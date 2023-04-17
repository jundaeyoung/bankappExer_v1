<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/view/layout/header.jsp"%>
<div class="row gx-4 gx-lg-5">
	<div class="col-md-4 mb-5">
		<div class="card h-100">
			<div class="card-body">
				<form action="/account/list">
					<button class="btn btn-primary btn-sm" style="background-color: #FFFFFF; color: black; border: none">
						<h2 class="card-title">계좌 목록</h2>
					</button>
				</form>
			</div>
		</div>
	</div>
	<div class="col-md-4 mb-5">
		<div class="card h-100">
			<div class="card-body">
				<form action="/account/withdraw">
					<button class="btn btn-primary btn-sm" style="background-color: #FFFFFF; color: black; border: none">
						<h2 class="card-title">출금</h2>
					</button>
				</form>
			</div>
		</div>
	</div>
	<div class="col-md-4 mb-5">
		<div class="card h-100">
			<div class="card-body">
				<form action="/account/deposit">
					<button class="btn btn-primary btn-sm" style="background-color: #FFFFFF; color: black; border: none">
						<h2 class="card-title">입금</h2>
					</button>
				</form>
			</div>
		</div>
	</div>
	<div class="col-md-4 mb-5">
		<div class="card h-100">
			<div class="card-body">
				<form action="/account/transfer">
					<button class="btn btn-primary btn-sm" style="background-color: #FFFFFF; color: black; border: none">
						<h2 class="card-title">이체</h2>
					</button>
				</form>
			</div>
		</div>
	</div>
	<div class="col-md-4 mb-5">
		<div class="card h-100">
			<div class="card-body">
				<form action="/account/save">
					<button class="btn btn-primary btn-sm" style="background-color: #FFFFFF; color: black; border: none">
						<h2 class="card-title">계좌 생성</h2>
					</button>
				</form>
			</div>
		</div>
	</div>

</div>
</div>

<%@ include file="/WEB-INF/view/layout/footer.jsp"%>

