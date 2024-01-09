package object;

import java.util.Scanner;

/*
	Account 클래스를 작성한다
	- 필드는 id, pw, nick을 가진다
	- 미리 Account 인스턴스를 하나 생성해둔다
	- 사용자에게 id, pw를 입력 받아서 Account 인스턴스를 하나 생성
	- 사용자에게 입력 받아서 만든 인스턴스와 미리 생성해둔 인스턴스의 id, pw가 같으면 로그인 성공을 출력
	- id나 pw가 다르면 로그인 실패를 출력
*/

class Account {
	private String id, pw, nick;
	
	Account(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	
	Account(String id, String pw, String nick) {
		this(id, pw);		// this()는 다른 생성자 호출에 사용
		this.nick = nick;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((pw == null) ? 0 : pw.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (pw == null) {
			if (other.pw != null)
				return false;
		} else if (!pw.equals(other.pw))
			return false;
		return true;
	}

	String getNick() {
		return nick;
	}
}

public class Quiz1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id, pw;
		
		System.out.print("ID : ");
		id = sc.next();
		
		System.out.print("PW : ");
		pw = sc.next();
		
		Account store = new Account("itbank", "it12", "아뱅");
		Account user = new Account(id, pw);
	
		if (store.equals(user)) {
			System.out.println(store.getNick() + "님 로그인");
		}
		else {
			System.out.println("일치하는 계정이 없습니다");
		}
		
		sc.close();
	}
}
