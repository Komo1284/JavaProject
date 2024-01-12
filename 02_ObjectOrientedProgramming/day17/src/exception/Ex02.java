package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

// ※ throws 할 차례 ※

public class Ex02 {
	public static void main(String[] args) {
		// 다중 예외 처리
		// - catch은 여러개 작성이 가능하고 다양한 예외를 처리할 수 있다
		Scanner sc = new Scanner(System.in);
		int n;
		
		try {
			int[] arr = new int[] { 10,20,30,40,50 };
			
			System.out.print("정수 입력 : ");
			n = sc.nextInt();
			
			System.out.println("n = " + n);
			System.out.printf("arr[%d] = %d\n", n, arr[n]);
			
			System.out.println(10 / n);
			
			
		} catch(InputMismatchException e) {
			System.err.println("정수가 아닙니다!!!");
		
		} catch(ArrayIndexOutOfBoundsException e) {
			System.err.println(e.getMessage() + "번 index는 없습니다");
			
		} catch(Exception e) {
			e.printStackTrace();
			return;
		} finally {
			// finally : 예외발생 여부에 관계 없이 '무조건' 실행되는 구문
			// - 주로 사용된 자원 해제 코드가 작성된다
			sc.close();
			System.out.println("스캐너 해제~~");
		}
	}
}
