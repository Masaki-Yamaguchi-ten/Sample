package test;

import model.dao.EmployeeDAO;
import model.entity.EmployeeBean;

public class TestEmployeeDAO {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		EmployeeDAO dao = new EmployeeDAO();

		//テスト１　削除
		System.out.println("\nテスト１開始");
		String emp_code="1";

		try {
			EmployeeBean emp =  dao.delete(emp_code);

			//操作
			if(emp!=null) {
				System.out.println(emp.getEmp_code());
			}else {
				System.out.println(emp_code+"\t"+"該当者なし");
			}

		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}


	}

}
