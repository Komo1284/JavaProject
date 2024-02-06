package jdbc;

import java.util.Scanner;

import model.vo.AccountVO;
import model.AccountDAO;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AccountVO user = new AccountVO();
		
		user.update(sc);
		
		AccountDAO dao = new AccountDAO();
		int row = dao.update(user);
		String msg = "수정 실패";
		
		if (row != 0) {
			msg = "수정 성공";
		}
		
		System.out.println(msg);
		sc.close();
		
	}
}
