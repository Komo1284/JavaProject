package inherited;

import other.Person;

class Police extends Person {
	private String rank;
	
	Police(String name, int age, String rank) {
		super(name, age);
		this.rank = rank;
	}
	
	@Override
	public String showInfo() {
		String msg = super.showInfo() + " %s";
		msg = String.format(msg, rank);
		
		return msg;
	}
	
	void patrol(String area) {
		String msg = "%s %s(이)가 %s(을)를 순찰한다\n";
		System.out.printf(msg, rank, name, area);
	}
}

public class Quiz1 {
	public static void main(String[] args) {
		// 아래 코드가 동작하게 클래스를 작성
		// 단, other.Person을 상속 받아서 작성할 것
		Police pol = new Police("김민수", 29, "순경");
		
		System.out.println("pol = " + pol.showInfo());
		// pol = 김민수 29세 순경
		
		pol.eat("팥빵");
		// 김민수가 팥빵을 먹는다
		
		pol.patrol("해운대구");
		// 순경 김민수가 해운대구를 순찰한다
	}
}
