package com.itbank.model.vo;

import java.sql.Date;

/*
 	Reply 테이블)
 	------------------------
	IDX      NOT NULL NUMBER 
	B_IDX    NOT NULL NUMBER 
	U_IDX    NOT NULL NUMBER 
	CONTENTS          CLOB   
	W_DATE            DATE
	
	
	Reply_view 뷰)
	------------------------                    
	USERID   NOT NULL VARCHAR2(20) 
	NICK     NOT NULL VARCHAR2(20)
*/

public class ReplyVO {
	private int idx, b_idx, u_idx;
	private String contents, userid, nick;
	private Date w_date;
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public int getB_idx() {
		return b_idx;
	}
	public void setB_idx(int b_idx) {
		this.b_idx = b_idx;
	}
	public int getU_idx() {
		return u_idx;
	}
	public void setU_idx(int u_idx) {
		this.u_idx = u_idx;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public Date getW_date() {
		return w_date;
	}
	public void setW_date(Date w_date) {
		this.w_date = w_date;
	}
	
	
}
