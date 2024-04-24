package com.itbank.exception;


// 예외 클래스로 사용하려면 꼭 Exception을 상속 받을 필요 있다.
public class LoginException extends Exception {

	private static final long serialVersionUID = -7092126192139270827L;

	public LoginException(String msg) {
		super(msg);
	}
}
