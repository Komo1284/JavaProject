package jdbc;

import java.util.Scanner;
import model.AccountDAO;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int idx;
		
		System.out.print("삭제할 계정 번호 : ");
		idx = sc.nextInt();
		
		AccountDAO dao = new AccountDAO();
		int row = dao.delete(idx);
		String msg = "삭제 실패";
		
		if(row != 0) {
			msg = "삭제 성공";
		}
		
		System.out.println(msg);
		sc.close();
	}
}
