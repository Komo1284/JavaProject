package jdbc;

import model.DAO;

// DAO는 자주 사용되는 객체로 public 클래스로 만들어두면 좋다

public class Ex04 {
	public static void main(String[] args) {
		DAO dao = new DAO();
		
		System.out.println(dao.test());
		// v$version의 banner를 출력
	}
}
