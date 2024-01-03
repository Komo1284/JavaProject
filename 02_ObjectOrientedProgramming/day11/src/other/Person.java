package other;

/*
	접근 제어 지시자 : 멤버에 접근하는 정도를 지정하는 키워드
	1. private		클래스 내부에서만 접근 가능
	2. package		내부 + 같은 패키지까지 접근 까능
	3. protected	내부 + 패키지 + 상속 받은 클래스까지 접근 가능
	4. public		내부 + 패키지 + 상속 + 외부. 즉, 어디서든 접근가능
	
	※ 접근 제어자는 코드의 안정성을 높여준다
*/

public class Person {
	// int age; 처럼 지시자가 없으면 package 속성이다
	public String name;
	int age;
	private double height;
	
	public Person(String name, int age, double height){
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	public void showInfo() {
		String msg = "%s (%d세, %.1fcm)\n";
		System.out.printf(msg, name, age, height);
	}
}
