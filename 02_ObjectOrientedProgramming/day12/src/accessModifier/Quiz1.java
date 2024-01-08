package accessModifier;

import quiz.Person;

public class Quiz1 {
	public static void main(String[] args) {
		// 아래 코드가 실행되게 클래스를 작성
		// 단, 클래스는 quiz 패키지에 작성할 것
		// 또, 필드는 private로 지정 후 변경하지 않는다
		Person p1 = new Person("김민수", 23);
		Person p2 = new Person("박지민", 31);
		
		p1.showInfo();	// 김민수 (23세)
		p2.showInfo();	// 박지민 (31세)
		
		p1.eat("김밥");	// 김민수가 김밥을 먹는다
		
		p1.talkTo(p2);	// 김민수가 박지민에게 대화를 건다
	}
}
