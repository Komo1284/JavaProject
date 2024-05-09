package com.itbank.model.vo;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

/*
	IDX      NOT NULL NUMBER        
	TITLE    NOT NULL VARCHAR2(150) 
	NICK              VARCHAR2(20)  
	CONTENTS NOT NULL CLOB          
	V_COUNT           NUMBER        
	W_DATE            DATE 
*/

@Getter
@Setter
public class BoardVO {
	
	private int idx, v_count, user_idx;
	private String title, nick, contents;
	private Date w_date;
}
