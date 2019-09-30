package model.entity;

import java.sql.Date;

public class EmployeeBean {

	private String emp_code;
	private String l_name;
	private String f_name;
	private String l_kana_name;
	private String f_kana_name;
	private String sex;
	private Date birth_day;
	//private String section_code;
	private Date emp_date;
	//private String update_date;

	public String getEmp_code() {
		return emp_code;
	}
	public void setEmp_code(String emp_code) {
		this.emp_code=emp_code;
	}

	public String getL_name() {
		return l_name;
	}
	public void setL_name(String l_name) {
		this.l_name=l_name;
	}

	public String getF_name() {
		return f_name;
	}
	public void setF_name(String f_name) {
		this.f_name=f_name;
	}

	public String getL_kana_name() {
		return l_kana_name;
	}
	public void setL_kana_name(String l_kana_name) {
		this.l_kana_name=l_kana_name;
	}

	public String getF_kana_name() {
		return f_kana_name;
	}
	public void setF_kana_name(String f_kana_name) {
		this.f_kana_name=f_kana_name;
	}

	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex=sex;
	}

	public Date getBirth_day() {
		return birth_day;
	}
	public void setBirth_day(Date birth_day) {
		this.birth_day=birth_day;
	}

	public Date getEmp_date() {
		return emp_date;
	}
	public void setEmp_date(Date emp_date) {
		this.emp_date=emp_date;
	}

}
