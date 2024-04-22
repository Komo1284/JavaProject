package com.itbank.model.vo;

import java.sql.Date;

/*
	IDX      NOT NULL NUMBER         
	TITLE             VARCHAR2(50)   
	NICK     NOT NULL VARCHAR2(30)   
	CONTENTS          CLOB           
	UPLOAD            VARCHAR2(1000) 
	V_COUNT           NUMBER         
	W_DATE            DATE    
*/

public class BoardVO {
	
	private int idx;
	private String title, nick, contents, upload;
	private int v_count;
	private Date w_date;
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getUpload() {
		return upload;
	}
	public void setUpload(String upload) {
		this.upload = upload;
	}
	public int getV_count() {
		return v_count;
	}
	public void setV_count(int v_count) {
		this.v_count = v_count;
	}
	public Date getW_date() {
		return w_date;
	}
	public void setW_date(Date w_date) {
		this.w_date = w_date;
	}
	
	
	
}
