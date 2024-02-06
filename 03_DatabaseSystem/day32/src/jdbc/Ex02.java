package jdbc;

import java.util.Scanner;
import model.AccountDAO;
import model.vo.AccountVO;

public class Ex02 {
	public static void main(String[] args) {
		// Account 테이블을 활용한 로그인 프로세스 구현
		// - 로그인 : 사용시 본인이 맞는지 인증하는 과정
		
		Scanner sc = new Scanner(System.in);
		
		AccountDAO dao = new AccountDAO();
		AccountVO user = new AccountVO();
	
		user.login(sc);
		
		user = dao.selectOne(user);
		String msg = "로그인 실패";
		
		if (user != null) {
			msg = "로그인 성공";
		}
		
		System.out.println(msg);
		System.out.println(user);
		
	}
}
