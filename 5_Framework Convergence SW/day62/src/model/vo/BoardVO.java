package model.vo;

import java.sql.Date;

/*
	IDX        NOT NULL NUMBER        
	TITLE               VARCHAR2(100) 
	CONTENTS            CLOB          
	NICK       NOT NULL VARCHAR2(60)  
	VIEW_COUNT          NUMBER        
	W_DATE              DATE
*/

public class BoardVO {
	private int idx, view_count;
	private String title, contents, nick;
	private Date w_date;
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public int getView_count() {
		return view_count;
	}
	public void setView_count(int view_count) {
		this.view_count = view_count;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
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
