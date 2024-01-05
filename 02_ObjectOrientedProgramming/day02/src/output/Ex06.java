package output;
public class Ex06 {
	public static void main(String[] args) {
		// escape sequence : 이스케이프 시퀀스
		// - 문자열 내에서 특수한 기능으로 사용되는 문자들
		// - 백슬래시(\)와 결합되어 사용된다.
		//
		// 문자열 : 쌍따옴표("")로 묶인 데이터. 단어나 문장을 표현하기 위한 타입
		
		System.out.println("Hello\nWorld!!!"); 	// \n : new line. 개행
		System.out.println("\n안녕\n\n하세요");	// - 문자열 내에서 여러개 사용 가능
												// - 또한 문자 하나당 백슬래시가 한개가 필요
		
		System.out.println("Eclipse \t\t 2019버전"); // \t : tab. 들여쓰기
		System.out.println("저희 java는 '8버전' 입니다.");
		System.out.println("저희 java는 \"8버전\" 입니다.");
		
		System.out.println("공유 폴더 \\\\192.168.112.7");
	}
}
