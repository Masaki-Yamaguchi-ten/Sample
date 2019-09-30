package test;

import model.entity.EmployeeBean;

public class SelectTest {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		EmployeeBean employee = null;

		employee = new EmployeeBean();

		employee.setEmp_code(res.getString("emp_code"));

		for(EmployeeBean employee:employee){
			//System.out.println(emp.getEmp_code()+"\t");
			System.out.println(emp.getL_name()+"\t");
			System.out.println(emp.getF_name()+"\t");
			System.out.println(emp.getL_kana_name()+"\t");
			System.out.println(emp.getF_kana_name()+"\t");
			System.out.println(emp.getSex()+"\t");
			System.out.println(emp.getBirth_day()+"\t");
			//System.out.println(employee.getSection_name()+"\t");
			System.out.println(emp.getEmp_date());
		}
	}

}
