package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

//import dao.ConnectionManager;
import model.entity.EmployeeBean;

public class EmployeeDAO {

	//入力したemp_codeのレコードを表示する
	public List<EmployeeBean> selectAllEmployees() throws Exception {

		List<EmployeeBean>employeeList = null;
		String mysql = "SELECT * FROM m_employee";

		//
		try(Connection con = ConnectionManager.getConnection();
				PreparedStatement pstmt=con.prepareStatement(mysql);
				ResultSet res = pstmt.executeQuery()){

			//結果の操作
			while(res.next()) {
				if (employeeList == null) {
					employeeList = new ArrayList<EmployeeBean>();

				}

				EmployeeBean employee = new EmployeeBean();
				employee.setEmp_code(res.getString("emp_code"));
				employee.setL_name(res.getString("l_name"));
				employee.setF_name(res.getString("f_name"));
				employee.setL_kana_name(res.getString("l_kana_name"));
				employee.setF_kana_name(res.getString("f_kana_name"));
				employee.setSex(res.getString("sex"));
				employee.setBirth_day(res.getDate("birth_day"));
				//employee.setSection_name(res.getString("section_name"));
				employee.setEmp_date(res.getDate("emp_date"));

				employeeList.add(employee);
				}

				//SQLに関する例外処理
				}catch(Exception e) {
					throw e;

				}
		return employeeList;
	}


	//従業員情報を削除する
	public int delete(String emp_code) throws Exception{

		int count = 0;

		String sql = "DELETE FROM m_employee WHERE emp_code=?";

		try(Connection con = ConnectionManager.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);
				){

			//プレースホルダへの値の設定
			pstmt.setString(1,emp_code);

			//SQLステートメントの実行(更新系)
			count = pstmt.executeUpdate();

			//SQLの例外処理
		}catch(Exception e) {
			throw e;
		}
		return count;
	}

	//入力したemp_codeのレコードを取得
	public EmployeeBean selectEmployees(String emp_code) throws Exception {

		EmployeeBean employee = null;
		String mysql = "SELECT * FROM m_employee WHERE emp_code=?";

		//
		try(Connection con = ConnectionManager.getConnection();
				PreparedStatement pstmt=con.prepareStatement(mysql);
				ResultSet res = pstmt.executeQuery()){

			//結果の操作
			while(res.next()) {
				employee = new EmployeeBean();

				employee.setEmp_code(res.getString("emp_code"));
				employee.setL_name(res.getString("l_name"));
				employee.setF_name(res.getString("f_name"));
				employee.setL_kana_name(res.getString("l_kana_name"));
				employee.setF_kana_name(res.getString("f_kana_name"));
				employee.setSex(res.getString("sex"));
				employee.setBirth_day(res.getDate("birth_day"));
				//employee.setSection_name(res.getString("section_name"));
				employee.setEmp_date(res.getDate("emp_date"));
				}

				//SQLに関する例外処理
				}catch(Exception e) {
					throw e;

				}
		return employee;
	}
}