package jdbc;

import java.util.Scanner;

import model.vo.AccountVO;
import model.AccountDAO;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AccountVO user = new AccountVO();
		AccountDAO dao = new AccountDAO();
		
		user.signUp(sc);
		
		int row = dao.insert(user);
		String msg = "가입 실패";
		
		if(row != 0) {
			msg = "가입 성공";
		}
		
		System.out.println("\n" + msg + "\n");
		
		for(AccountVO tuple : dao.selectAll()) {
			System.out.println(tuple);
		}
	}
}
