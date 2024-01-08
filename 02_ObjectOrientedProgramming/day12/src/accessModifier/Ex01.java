package accessModifier;

import other.Person;

public class Ex01 {
	public static void main(String[] args) {
		Person per = new Person("홍길동", 34);
		
		// getter와 setter 꼭 둘 다 구현할 필요 없다
		// - 필요시 get 혹은 set만 만들어 사용하기도 한다
		per.setName("홍진경");
		System.out.println("per 이름 : " + per.getName());
		
		per.setAge(44);
		System.out.println("per 나이 : " + per.getAge());
	}
}
