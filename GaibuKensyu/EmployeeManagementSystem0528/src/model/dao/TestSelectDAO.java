package model.dao;

import java.util.List;

import model.entity.EmployeeBean;

public class TestSelectDAO {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		EmployeeDAO dao= new EmployeeDAO();

		List<EmployeeBean>employeeList=null;

		employeeList=dao.selectAllEmployees();
		for(EmployeeBean employee:employeeList){
			System.out.println(employee.getEmp_code()+"\t");
			System.out.println(employee.getL_name()+"\t");
			System.out.println(employee.getF_name()+"\t");
			System.out.println(employee.getL_kana_name()+"\t");
			System.out.println(employee.getF_kana_name()+"\t");
			System.out.println(employee.getSex()+"\t");
			System.out.println(employee.getBirth_day()+"\t");
			//System.out.println(employee.getSection_name()+"\t");
			System.out.println(employee.getEmp_date());
		}
	}

}
