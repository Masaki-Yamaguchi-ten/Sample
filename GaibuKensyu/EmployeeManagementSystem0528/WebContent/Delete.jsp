<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>従業員情報削除画面</title>
</head>
<body>
	<div align = "center">
	<h1>従業員情報削除画面</h1>
		<form action="Servlet" method="POST">
			従業員コード：<input type="text" name="emp_code"><br><br>

	<input type="submit" value="削除" name="ACTION">
	<input type="submit" value="一覧へ戻る" name="ACTION"><br>
	</form>
	</div>
</body>
</html>