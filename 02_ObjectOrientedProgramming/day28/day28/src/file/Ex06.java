package file;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

class User {
	private int idx;
	private String userid, userpw;
	
	@Override
	public String toString() {
		String msg = "%d %s %s";
		msg = String.format(msg, idx, userid, userpw);
		
		return msg;
	}
	
	void load(Scanner sc) {
		idx = sc.nextInt();
		userid = sc.next();
		userpw = sc.next();
	}
}

public class Ex06 {
	public static void main(String[] args) throws IOException {
		// Scanner를 활용하면 특정 양식의 데이터를 구분해서 가져오기 좋다
		File file = new File("E:\\FileTest\\users.txt");
		Scanner sc = new Scanner(file);
		
		LinkedList<User> users = new LinkedList<User>();
		User user;
		
		while (sc.hasNext()) {		// 문서에 다음이 없을 때까지 반복
			user = new User();		// 한 계정의 정보를 저장할 객체 생성
			user.load(sc);			// 파일에서 읽어온 정보를 객체에 저장
			
			users.add(user);		// 리스트에 추가
			
			System.out.println(user);
		}
		
		// System.out.println(users);
		
		sc.close();
	}
}
