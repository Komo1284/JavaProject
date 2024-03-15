package model.vo;

import java.sql.Date;

public class PersonVO {
	private String name;
	private Date birth;
	private double height;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = Date.valueOf(birth);
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}

	
	@Override
	public String toString() {
		String msg = "%s %.1f %s";
		msg = String.format(msg,  name, height, birth);
		
		return msg;
	}
}
