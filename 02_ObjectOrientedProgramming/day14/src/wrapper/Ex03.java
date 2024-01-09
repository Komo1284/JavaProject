package wrapper;

public class Ex03 {
	public static void main(String[] args) {
		// String은 Wrapper는 아니지만 비슷한 구조
		//
		// class String {
		// 		char[] word = new char[n];
		//		그 외 메서드
		// }
		
		String str1 = "apple";
		String str2 = "apple";
		String str3 = new String("apple");
		
		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2);
		System.out.println("str3 = " + str3 + "\n");
		
		// ※ 상수 문자열은 같은 대상이 참조된다
		// - 인스턴스(new)로 만들어진 문자열은 별도의 공간에 생성된다
		System.out.println("str1 == str2 결과 : " + (str1 == str2));
		System.out.println("str1 == str3 결과 : " + (str1 == str3) + "\n");
		
		// String은 이미 내부 문자열이 같으면 참을 반환하게 equals()를 오버라이딩이 되어 있음
		System.out.println("str1.equals(str2) 결과 : " + str1.equals(str2));
		System.out.println("str1.equals(str3) 결과 : " + str1.equals(str3));
		
		// ※ 문자열은 사전순으로 앞에 있는 문자가 작은 문자열
		// appication VS banana --> a로 시작하는 문자열이 작은 문자열
		//
		// 1. 앞의 문자열이 크면 1
		// 2. 뒤의 문자열이 크면 -1
		// 3. 같으면 0
		System.out.println("결과1 : " + "application".compareTo("banana"));
		System.out.println("결과2 : " + "banana".compareTo("application"));
		System.out.println("결과3 : " + "app".compareTo("app"));
	}
}
