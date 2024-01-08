package static_;

/*
	클래스 멤버의 종류
	1. 일반 멤버
	- 인스턴스 마다 별도로 공간을 가진다
	- 인스턴스가 생성되어야만 공간이 만들어 진다.
	
	2. 정적 멤버
	- 인스턴스가 공유하는 공간이다
	- 인스턴스가 없어도 이미 공간이 있다
*/

class Person {
	// 일반 멤버 (= 인스턴스 멤버)
	String name;
	
	// 정적 멤버 (= 클래스 멤버)
	static int eyes = 2;
	
	Person(String name){
		this.name = name;
	}
	
	void showInfo() {
		System.out.printf("%s (눈 : %d개)\n", name, eyes);
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Person cheon = new Person("천진반");
		Person kim = new Person("김민수");
		Person lee = new Person("이수진");
		
		// - 정적 멤버는 클래스 자체가 가지는 멤버
		// - 즉, 클래스명으로 접근하는 것이 올바른 방법
//		cheon.eyes = 3;
		Person.eyes = 3;
		
		cheon.showInfo();
		kim.showInfo();
		lee.showInfo();
	}

}
