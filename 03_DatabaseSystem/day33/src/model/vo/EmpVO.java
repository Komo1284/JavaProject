package model.vo;

import java.sql.Date;

public class EmpVO {
	private int idx,salary,dep_idx;
	private String name,position,gender,phone,email;
	private Date birth,h_date;
	
	@Override
	public String toString() {
		String msg = "%d %s %s %s %s %s %s %s %d %d";
		msg = String.format(msg, idx, name, position, gender, 
				birth, h_date, phone, email, salary, dep_idx);
		
		return msg;
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getDep_idx() {
		return dep_idx;
	}

	public void setDep_idx(int dep_idx) {
		this.dep_idx = dep_idx;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public Date getH_date() {
		return h_date;
	}

	public void setH_date(Date h_date) {
		this.h_date = h_date;
	}
	
	
}
