package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

	private final static String URL ="jdbc:mysql://localhost/emp_sys_db?useSSL=false";
	private final static String USER = "soumu";
	private final static String PASSWORD = "soumusystem";

	public static Connection getConnection() throws SQLException, ClassNotFoundException{

		//JDBCドライバクラスの初期化処理
		Class.forName("com.mysql.jdbc.Driver");

		//コネクションの取得
		return DriverManager.getConnection(URL,USER,PASSWORD);
	}

}