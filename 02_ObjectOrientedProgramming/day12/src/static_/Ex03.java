package static_;

import static_.other.Function;

public class Ex03 {
	public static void main(String[] args) {
		// 정적 멤버는 인스턴스 없이 바로 사용 가능하다
		// 1. 1 ~ n까지 일렬로 출력하는 메서드
		Function.printNumber(5);
		Function.printNumber(10);
		
		/*
			필드가 없는 클래스는 인스턴스를 만들어도
			전부 동일하게 만들어진다.
			즉, 단순하게 메서드(= 기능)만 필요하면
			인스턴스 없이 클래스로 바로 사용하는 것이 효율이 좋다.
		*/
		
	}
}
