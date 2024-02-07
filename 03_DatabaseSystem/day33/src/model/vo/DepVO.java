package model.vo;

import java.sql.Date;

public class DepVO {
	private int idx;
	private String dep_name,dep_phone,dep_email;
	private Date dep_create;
	
	@Override
	public String toString() {
		String msg = "%d %s %s %s %s";
		msg = String.format(msg, idx, dep_name, dep_phone, 
				dep_email, dep_create);
		
		return msg;
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getDep_name() {
		return dep_name;
	}

	public void setDep_name(String dep_name) {
		this.dep_name = dep_name;
	}

	public String getDep_phone() {
		return dep_phone;
	}

	public void setDep_phone(String dep_phone) {
		this.dep_phone = dep_phone;
	}

	public String getDep_email() {
		return dep_email;
	}

	public void setDep_email(String dep_email) {
		this.dep_email = dep_email;
	}

	public Date getDep_create() {
		return dep_create;
	}

	public void setDep_create(Date dep_create) {
		this.dep_create = dep_create;
	}
	
	
}
