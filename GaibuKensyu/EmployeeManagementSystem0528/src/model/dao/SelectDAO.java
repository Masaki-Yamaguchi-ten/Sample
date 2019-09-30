package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.entity.EmployeeBean;

public class SelectDAO {

	//入力したemp_codeがデータベースにあるか確認する
	public EmployeeBean deletecheck(String emp_code) throws Exception{

		EmployeeBean emp =null;

		String sql = "SELECT * FROM m_employee WHERE emp_code = ?";

		// データベースへの接続の取得、PreparedStatementの取得、SQLステートメントの実行（参照系）
		try(Connection con = ConnectionManager.getConnection();
				PreparedStatement pstmt =  con.prepareStatement(sql)){

			//プレースホルダへの値の設定
			pstmt.setString(1, emp_code);

			// SQLステートメントの実行（参照系）
			ResultSet res = pstmt.executeQuery();

			//結果の操作
			while(res.next()) {
				if(emp==null) {
					emp = new EmployeeBean();
				}
				emp.setEmp_code(res.getString("emp_code"));
			}
		} catch (Exception e) {
			throw e;
		}
		return emp;
	}

}
