package loop;

/*
	반복문 while
	- 조건식이 참이면 종속문을 수행
	- 종속문이 끝나면 다시 반복 처음으로 돌아온다
*/

public class Ex01 {
	public static void main(String[] args) {
		int i = 1;
		
		while (i <= 2100000000) {
			System.out.println(i + " : Hello World!!!");
			i++;
		}
	}
}
