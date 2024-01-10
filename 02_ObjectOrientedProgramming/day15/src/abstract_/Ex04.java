package abstract_;

import other.USB;

/*
	익명 클래스
	- 이름 없는 클래스. 일회용
	- 한 인스턴스에만 적용할 클래스이다
	- 주로, 추상 클래스나 인터페이스를 바로 구현해서 사용시 작성
	
	함수형 인터페이스
	- 인터페이스에 메서드가 하나만 있는 인터페이스
*/

public class Ex04 {
	public static void main(String[] args) {
		PC pc = new PC();
		
		// 익명 클래스
		USB phone = new USB() {	
			@Override
			public void run() {
				System.out.println("휴대폰 연결. 50% 충전");
			}
		};
		
		pc.connect(phone);
		
		USB memory = () -> {
			System.out.println("32GB 연결. E:\\에 연결됨");
		};
		
		pc.connect(memory);
	}
}
