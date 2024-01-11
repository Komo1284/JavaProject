package nested;

/*
	중첩 클래스 (nested class)
	- 클래스 안에 클래스를 작성하는 기법
	- 객체 지향의 캡슐화를 더우 높이는데 사용
*/

class Outer {
	private int out = 10;
	
	// 인스턴스 중첩 클래스
	// - Outer의 멤버로 존재하는 클래스
	// - 멤버이름 private 같은 지시자가 붙을 수 있다
	private class Inner {
		// Inner는 Outer의 멤버이므로 Outer의 private를 접근 가능
		void inMethod() {
			System.out.println("out = " + out);
		}
	}
	
	void outMethod() {
		System.out.println("outMethod 실행");
		System.out.println("Inner 인스턴스 생성");
		
		Inner in = new Inner();
		in.inMethod();
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Outer o = new Outer();
		
		o.outMethod();
	}
}
