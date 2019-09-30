<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="model.entity.EmployeeBean" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>従業員情報確認画面</title>
</head>
<body>

	<div align = "center">
	<h1>従業員情報確認画面</h1>
		<table border="1">
			<tr>
				<td>従業員コード</td>
				<td>氏</td>
				<td>名</td>
				<td>氏(フリガナ)</td>
				<td>名(フリガナ)</td>
				<td>性別</td>
				<td>生年月日</td>

				<td>入社日</td>
			</tr>

			<%
			List<EmployeeBean> employeeList =
					(List<EmployeeBean>) request.getAttribute("employeeList");
			if(employeeList !=null){
				for(int i=0; i<employeeList.size();i++){
				EmployeeBean emp = employeeList.get(i);
			%>
			<tr>
				<td><%=emp.getEmp_code() %></td>
				<td><%=emp.getL_name() %></td>
				<td><%=emp.getF_name() %></td>
				<td><%=emp.getL_kana_name() %></td>
				<td><%=emp.getF_kana_name() %></td>
				<td><%=emp.getSex() %></td>
				<td><%=emp.getBirth_day() %></td>
				<td><%=emp.getEmp_date() %></td>
			</tr>
			<%
				}
			}
			%>
		</table>
		<br>
	</div>

	<div align = "center">
	<form action="Servlet" method="POST">
		<input type="submit" value="確定" name="ACTION">
		<input type="submit" value="訂正" name="ACTION"><br>
	</form>
	</div>
</body>
</html>