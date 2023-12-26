package loop;

/*
 * 반복문 for
 *  초기, 조건, 증감이 한 곳에 모여있는 구문
 *  반복 횟수 파악이 용이해서 지정횟수 반복에 자주 사용된다
 *  또, 뒤에 배울 배열 같은 묶음 타입의 반복에도 사용된다
 */

public class Ex04 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + " : Hello World");
		}
	}
}
