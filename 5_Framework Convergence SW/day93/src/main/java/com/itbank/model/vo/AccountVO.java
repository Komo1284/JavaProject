package com.itbank.model.vo;

import java.sql.Date;

/*
	IDX     NOT NULL NUMBER        
	USERID  NOT NULL VARCHAR2(30)  
	USERPW  NOT NULL VARCHAR2(255) 
	NICK    NOT NULL VARCHAR2(30)  
	EMAIL   NOT NULL VARCHAR2(60)  
	J_DATE           TIMESTAMP(6)  
	PROFILE NOT NULL NUMBER
*/

public class AccountVO {
	
	private int idx, profile;
	private String userid, userpw, nick, email;
	private Date j_date;
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public int getProfile() {
		return profile;
	}
	public void setProfile(int profile) {
		this.profile = profile;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserpw() {
		return userpw;
	}
	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getJ_date() {
		return j_date;
	}
	public void setJ_date(Date j_date) {
		this.j_date = j_date;
	}
	
}
