package varialbe;

// 변수
// - 데이터를 저장하는 공간
// - 저장한 데이터는 몇 번이건 재사요 가능
// - 다른 값을 저장시 새 값으로 덮어쓴다.

public class Ex04 {
	public static void main(String[] args) {
		
		int n = 10;		// 변수 선언시 어떤 타입인지 자료형 명시가 필요
		
		System.out.println("n = " + n);
		
		n = 20;			// 이미 만들어진 변수를 사용시 자료형은 작성하지 않는다.
						// 만약 작성시 이름이 동일한 변수를 생성하는 것과 같고 에러가 발생
		System.out.println("n = " + n);
	}
}
