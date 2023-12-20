package varialbe;

public class Ex09 {
	public static void main(String[] args) {
		// 변수 선언 방법
		// 1. 선언 후 바로 초기화
		int n1 = 10;
		
		// 2. 선언만
		int n2;
		
		// 3. 같은타입 한번에 생성
		String name, address;
		
		// *선언만한 변수는 나중에 데이터를 채울 수 있다.
		n2 = 20;
		name = "홍길동";
		address = "서울 특별시 종로구";
		
		System.out.println("n1 = " + n1);
		System.out.println("n2 = " + n2);
		System.out.println("name = " + name);
		System.out.println("address = " + address);
	}
	
}
