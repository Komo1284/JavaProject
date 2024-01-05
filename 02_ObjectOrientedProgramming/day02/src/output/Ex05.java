package output;

public class Ex05 {

	public static void main(String[] args) {
		// 표준 출력 함수
		// - 표준 출력은 console을 통해서 데이터를 주고 받는 것
		
		// 1. println() : 괄호 안에 전달된 데이터를 콘솔에 출력. 끝에 개행 발생
		System.out.println("Hello");
		System.out.println("World!!!");
		System.out.println();
		System.out.println("빈 println()은 콘솔에서 개행으로 사용되기도 한다.");
		
		// 2. print() : println()과 동일. 단, 끝에 개행이 없음
		System.out.print("안녕");
		System.out.print("세상아");
		System.out.println();
		
		// 3. printf() : 서식을 활용한 출력. 끝에 개행이 없음
		System.out.printf("이름 : %s, 나이 : %d세", "홍길동",26);
		

	}

}
