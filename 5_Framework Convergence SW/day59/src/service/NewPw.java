package service;

import java.util.UUID;

public class NewPw {

//	private Random ran = new Random();
//	private String aph = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
//	
//	public String getPw() {
//		
//		String result = "";
//		
//		for (int i = 0; i < 8; i++) {
//			int idx = ran.nextInt(aph.length());
//			
//			result += aph.charAt(idx);
//		}
//		
//		return result;
//	}
	
	public String getPw() {
		String result = "";
		
		result = UUID.randomUUID().toString().substring(0,8);
		
		return result;
	}
	
}
