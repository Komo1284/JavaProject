package com.itbank.model.vo;

import java.sql.Date;

/*
	IDX    NOT NULL NUMBER        
	USERID NOT NULL VARCHAR2(30)  
	USERPW NOT NULL VARCHAR2(128) 
	NICK   NOT NULL VARCHAR2(50)  
	J_DATE          DATE    
*/

public class AccountVO {
	
	private int idx;
	private String userid, userpw, nick;
	private Date j_date;
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
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
	public Date getJ_date() {
		return j_date;
	}
	public void setJ_date(Date j_date) {
		this.j_date = j_date;
	}
	
	
	
}
