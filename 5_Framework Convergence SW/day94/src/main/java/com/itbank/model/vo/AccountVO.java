package com.itbank.model.vo;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

/*
	IDX     NOT NULL NUMBER        
	USERID  NOT NULL VARCHAR2(30)  
	USERPW  NOT NULL VARCHAR2(255) 
	NICK    NOT NULL VARCHAR2(30)  
	EMAIL   NOT NULL VARCHAR2(60)  
	J_DATE           TIMESTAMP(6)  
	PROFILE NOT NULL NUMBER     
*/
@Getter
@Setter
public class AccountVO {
	
	private int idx, prifile;
	private String userid, userpw, nick, email;
	private Date j_date;
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public int getPrifile() {
		return prifile;
	}
	public void setPrifile(int prifile) {
		this.prifile = prifile;
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
