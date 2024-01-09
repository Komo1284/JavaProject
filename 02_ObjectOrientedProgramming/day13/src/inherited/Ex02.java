package inherited;

import other.Person;

class Student extends Person {
	private int score;
	
	Student(String name, int age, int score) {
		// 부모의 필드는 부모 생성자로
		super(name, age);
		
		// 자식의 필드는 직접
		this.score = score;
	}
	
	@Override
	public String showInfo() {
		// return super.showInfo() + " " + score + "점";
		// - super.메서드명() : 부모의 메서드를 호출한다
		
		// 오버라이드는 전체를 다시 써도 된다
		String msg = "%s %d세 %d점";
		msg = String.format(msg, name, age, score);
		
		return msg;
	}
	
	void study(String subject) {
		String msg = "%s(이)가 %s(을)를 공부한다\n";
		System.out.printf(msg, name, subject);
	}
}

public class Ex02 {
	public static void main(String[] args) {
		Person per = new Person("홍길동", 33);

		System.out.println("per = " + per.showInfo());
		per.eat("라면");
		
		
		Student stu = new Student("김민지", 17, 88);
		
		System.out.println("\nstu = " + stu.showInfo());
		stu.eat("떡볶이");
		stu.study("Java");
		
		// 자식 인스턴스가 사용하는 메서드
		// 1. 그대로 물려 받은 메서드
		// 2. 오버라이드한 메서드
		// 3. 자식에서 생성한 메서드
	}
}
