package other;


/*
	Java에서 난수(= 무작위 수, 랜덤)을 사용하는 방식
	1. Math 클래스의 random() 메서드
	2. Random 클래스
*/

public class Ex01 {
	public static void main(String[] args) {
		// 1. Math는 수학 관련 기능을 제공하는 클래스
		int n;
		for(int i = 1; i <= 6; i++) {
			n = (int)(Math.random() * 100) % 46;
			System.out.printf("%d ",n);
		}
		
	}
}
