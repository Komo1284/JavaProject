package main;

import beans.Battery;
import beans.Toy;

// 스프링을 활용하지 않은 코드
public class Ex01 {
	public static void main(String[] args) {
		Toy t1 = new Toy();		// 1. 장난감 객체를 생성
								// - 동작하려니 움직이지 않는다
		t1.run();
		
		Battery bat = new Battery();
		
		t1.setBat(bat);			// 2. 배터리가 빠져있음
		t1.run();				// - 이를 두고 의존성이 주입되지 않았다라고 표현
								// - 어떠한 객체를 사용시 필요한 의존성 문제를 해결하는 것을
								// - DI (Dependendy Injection)이라고 한다
								
		Toy t2 = new Toy();		// 3. t2는 왜? 동작하지 않을까?
								// - 다른 장난감(= 인스턴스)이니까~
		t2.run();
		
		Toy t3 = t1;			// 4. t3는 왜? 동작할까?
								// - t1과 같은 인스턴스를 가르키니까
		t3.run();
		
		System.out.println("t1 = " + t1);
		System.out.println("t2 = " + t2);
		System.out.println("t3 = " + t3);
		
	}
}
