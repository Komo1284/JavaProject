package accessModifier;

// package 클래스
// - 외부에서 import 할 수 없다
// - java파일과 이름이 달라도 된다
class Human {
	private String name;
	private int age;
	
	Human(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	// access 메서드 
	// - getter/setter라고 하며
	// - 필드를 간접적으로 제공하는 메서드
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
}

// public 클래스
// - 외부에서 import 할 수 있다
// - 단, -java파일과 이름이 같아야 한다
// - 따라서, 한 .java에 한개만 작성 가능하다
public class Ex02 {
	public static void main(String[] args) {
		Human h1 = new Human("홍길동", 34);
		
//		System.out.println("이름 : " + h1.name);
//		System.out.println("나이 : " + h1.age);
	}
}
