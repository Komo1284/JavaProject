package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

// 2. throws를 활용한 경우
// - 각 메서드에서 발생하는 예외를 모두 main으로 전가
public class Ex03 {
	
	// 입력을 수행하는 메서드 -> 정수가 아니면 예외가 발생한다
	static int input(Scanner sc) {

		int n = 0;
	
		System.out.print("정수 입력: ");
		n = sc.nextInt();
		
		sc.close();
		
		return n;
		
	}
	
	// 전달받은 정수만큼 타임을 출력
	static void timer(int n) throws InterruptedException {
		for(int i = n; i >= 1; i--) {
			System.out.println(i + "초");
			Thread.sleep(1000);
		}
		
		System.out.println("종료~");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try{
			int n = input(sc);
			timer(n);
		}catch(InputMismatchException e){
			System.err.println("정수가 아닙니다");
		}catch(InterruptedException e) {
			System.err.println();
		}finally {
			sc.close();
		}
		
	}
}
