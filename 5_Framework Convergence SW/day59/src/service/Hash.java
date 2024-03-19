package service;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Hash {
	
	public String getHash(String srcPw) {
		
		String hashPw;
		
		try {
			
			MessageDigest md = MessageDigest.getInstance("sha-512");
			
			md.reset();						
			md.update(srcPw.getBytes());
			
			hashPw = String.format("%0128x", new BigInteger(1, md.digest()));
			
			return hashPw;
			
		} catch (NoSuchAlgorithmException e) {}
		
		return null;
	}
}
