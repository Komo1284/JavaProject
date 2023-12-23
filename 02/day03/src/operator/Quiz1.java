package operator;

public class Quiz1 {
	public static void main(String[] args) {
		// 1. 이름, 국영수 점수를 저장할 변수를 선언
		// 단, 국영수는 정수로
		String name;
		int kor, eng, mat;
	
		
		// 2. 1번에 선언한 변수에 값을 대입
		name = "홍길동";
		kor = 70;
		eng = 80;
		mat = 98;
		
		int sum = kor + eng + mat;
		
		
		// 3. 아래와 같이 출력한다
		// 결과)
		// 이름 : 홍길동 (국 70, 영 80, 수 98)
		// 합계 : 248 (82.67)
		String result = "이름 : %s (국 %d, 영 %d, 수 %d)\n";
		
		System.out.printf(result, name, kor, eng, mat);
		System.out.printf("합계 : %d (%.2f)\n", sum, sum / 3.0);
	}
}
