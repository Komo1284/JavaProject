package com.itbank.model.vo;

import java.sql.Date;

public class PersonVO {
	private String name;
	private double height;
	private Date birth;
	private int score;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "이름=" + name + ", 신장=" + height + ", 생일=" + birth + ", 토익점수=" + score;
	}
	
	
	
}
