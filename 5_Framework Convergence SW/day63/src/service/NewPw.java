package service;

import java.util.UUID;

public class NewPw {
	
	public String getPw() {
		String result = "";
		result = UUID.randomUUID().toString().substring(0, 6);
		
		return result;
	}
}
