package inherited;

import other.Person;

/*
	클래스는 서로 상속 관계일 때 형변환이 가능하다
	1. up-casting		자식의 인스턴스를 부모의 참조변수로 가리키는 것
	2. down-casting		up-casting된 인스턴스를 다시 자식 참조변수로 가리키는 것
*/

public class Ex03 {
	public static void main(String[] args) {
		// 자식 참조 변수 = 자식 인스턴스
		Student stu = new Student("홍길동", 17, 91);
		
		// 부모, 자식 모든 멤버를 사용 가능
		System.out.println("stu = " + stu.showInfo());
		stu.eat("김밥");
		stu.study("Java");
		
		
		// 1. up-casting
		// - 자식 인스턴스들을 묶어서 처리할 때 자주 사용된다
		Person per = new Student("홍길동", 17, 91);
		
		System.out.println("\nper = " + per.showInfo());
		per.eat("김밥");
		
		// - 업캐스팅시 자식의 필드는 참조 불가능
		// per.study("Java");
		
		
		// 2. down-casting
		// - 업 캐스팅으로 묶인 객체들 중 자식의 멤버를 사용해야 하는 경우 쓴다
		Student tmp = (Student)per;
		
		tmp.study("Java");
	}
}
