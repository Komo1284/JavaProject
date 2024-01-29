package exception;

/*
	try ~ catch의 무분별한 사용은 코드의 가독성을 해친다
	따라서, 최소한의 try ~ catch로 예외를 처리하는 것이 가독성에 도움이 된다.
	
	이때, 발생한 예외를 다른 위치로 전가하는 구문을 throws라고 한다
*/

public class Ex01 {
	// main에서 발생한 예외를 직접 처리(try)하지 않고 호출한 위치로 전가하겠다
	// ※ main에서 전가한 예외는 JVM이 받아 처리하게 되고 JVM은 예외를 만나면 프로그램을 강제 종료 시킨다
	public static void main(String[] args) throws InterruptedException {
		for(int i = 10; i >= 1; i--) {
			System.out.println(i + "초");
			
			Thread.sleep(1000);
		}
		
		System.out.println("종료~");
	}
}
