package com.itbank.service;

import java.util.UUID;

public class NewPw {
	
	public static String getPw() {
		String result = "";
		result = UUID.randomUUID().toString().substring(0, 6);
		
		return result;
	}
}