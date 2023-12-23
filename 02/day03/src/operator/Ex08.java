package operator;

// 전치 > 산술 > 비교 > 논리 > 조건 > 대입 > 후치 

public class Ex08 {
	public static void main(String[] args) {
		// 조건 연산자 : 참/거짓에 따라서 값을 선택하는 연산자
		// (조건) ? 참 : 거짓
	
		int n = -10;
		
		String positive = (n >= 0) ? "양수" : "음수";
//		String positive = "양수";		(n = 10인 경우)
//		String positive = "음수";		(n = -10인 경우)
		
		System.out.printf("%d(은)는 %s 입니다\n", n, positive);
	}
}
