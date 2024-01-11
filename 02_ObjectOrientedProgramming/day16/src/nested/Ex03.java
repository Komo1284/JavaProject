package nested;

public class Ex03 {
	
	private static int out = 10;
	
	public static void main(String[] args) {
		// 지역 중첩 클래스
		// - 메서드안에 선언된 클래스
		// - 해당 메서드가 끝나면 제거 된다
		class Local {
			Local() {
				System.out.println("지역 중첩 인스턴스 생성");
				System.out.println("out = " + out);
			}
		}
		
		Local lo = new Local();
	}
}
