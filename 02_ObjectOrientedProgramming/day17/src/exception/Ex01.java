package exception;

/*
	오류 : 프로그램에서 발생하는 오작동 등을 의미
	1. 에러 : 시스템 레벨의 오류를 의미. 잘못된 문법이나 기계적 오류
	2. 예외 : 소프트웨어 레벨의 오류. 잘못된 입력이나 연산을 통한 오류
	
	예외는 발생 후 혹은 발생 전에 미리 예측 후 처리 가능
	이를, 예외 처리라고 한다
	
	예외 처리 이유)
	1. 예외가 발생해도 실행을 이어가야 할 때
	2. 예외 처리를 하지 않으면 사용하지 못하는 메서드들이 있다
*/

public class Ex01 {
	public static void main(String[] args) {
		
		try {	// try : 예외 발생을 감지하는 구문. 발생한 예외는 catch로 전달
			
			System.out.println(10 / 0);
			
			System.out.println("try에서 예외가 발생하면");
			System.out.println("발생 시점 이후의 코드는 수행하지 않음");
		
		} catch(ArithmeticException e) {
				// catch : 예외 발생시 처리하는 구문
			
			System.err.println("예외 발생!!!");
			System.err.println("메세지 : " + e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료~");
	}
}
