package varialbe;

public class Quiz1 {
	// 1. 학생의 이름, 국영수 점수를 저장할 변수를 선언
	// 단, 국영수는 정수 타입으로
	
	// 2. 1번의 변수에 값을 채운 후 아래와 같이 출력
	//
	// 결과)
	// 이름 : 김민지
	// 성적 : 국어(92), 영어(88), 수학(95)
	
	public static void main(String[] args) {
		String name = "김민지";
		int ko = 92, en = 88, ma = 95;

		
		System.out.printf("이름 : %s\n", name);
		System.out.printf("성적 : 국어(%d), 영어(%d), 수학(%d)", ko, en, ma);
	}
}
