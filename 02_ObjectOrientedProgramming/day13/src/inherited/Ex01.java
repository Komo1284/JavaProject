package inherited;

/*
	상속 : 재산 따위를 물려주는 행위
	
	클래스의 상속
	- 기존에 작성된 클래스의 기능을 물려 받아서 새 클래스를 작성하는 기법
	- 클래스들의 공통된 부분을 상위 클래스로 묶어서 재사용성을 높임
	
	상속 하는 클래스 : 부모, 상위, 슈퍼, 기반 클래스라고 한다
	상속 받는 클래스 : 자식, 하위, 서브, 파생 클래스라고 한다
*/

class Super {
	int n = 10;
	
	Super() {
		System.out.println("\n부모 생성자 호출");
	}
	
	void supMethod() {
		System.out.println("부모 클래스의 메서드 입니다~");
	}
}

class Sub extends Super {
	int m = 20;
	
	Sub() {
		super();	// 부모 생성자를 호출하는 키워드
		
		System.out.println("자식 생성자 호출");
	}
	
	void subMethod() {
		System.out.println("자식 클래스의 메서드 입니다~");
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Super sup = new Super();
		
		System.out.println("n = " + sup.n);
		sup.supMethod();
		
		// 2. 하지만 부모는 자식의 인스턴스를 가지지 않음
		// 즉, 자식의 멤버는 사용 불가능
		// System.out.println("m = " + sup.m);
		
		
		// 1. 자식 인스턴스는 내부에 부모의 인스턴스를 가지고 있다
		Sub sub = new Sub();
		
		// 따라서, 부모의 멤버는 물론
		System.out.println("n = " + sub.n);
		sub.supMethod();
		
		// 자신의 멤버까지 사용 가능
		System.out.println("m = " + sub.m);
		sub.subMethod();
	}
}
