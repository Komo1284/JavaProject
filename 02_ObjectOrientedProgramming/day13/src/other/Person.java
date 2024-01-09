package other;

public class Person {
	// protected : 내부 + 패키지 + 상속 받은 클래스까지 접근 가능
	protected String name;
	protected int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String showInfo() {
		String msg = "%s %d세";
		msg = String.format(msg, name, age);
		
		return msg;
	}
	
	public void eat(String food) {
		String msg = "%s(이)가 %s(을)를 먹는다\n";
		System.out.printf(msg, name, food);
	}
	
	public String getName() {
		return name;
	}
}
