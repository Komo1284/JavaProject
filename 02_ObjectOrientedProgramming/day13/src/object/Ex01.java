package object;

/*
	Object 클래스
	- 자바의 최상위 클래스
	- 자바의 모든 클래스는 예외 없이 이 클래스를 상속 받게 된다
	- 따라서, 모든 클래스는 Object로 up-casting이 가능하다
	
	※ Object에는 몇몇 필드, 메서드가 있다
	- 이를 오버라이드해서 필요한 기능으로 변경해서 자주 사용
*/

class Person {
	private String name;
	private int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		String msg = "%s %d세";
		return String.format(msg, name, age);
	}

	
	// 아래 두 메서드는 직접 작성을 권장하지 않는다
	// 보통 Java를 지원하는 IDE 마다 자동 완성을 제공함 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		
		if (obj == null)
			return false;
		
		if (getClass() != obj.getClass())
			return false;
		
		Person other = (Person) obj;
		
		if (age != other.age)
			return false;
		
		if (name == null) {
			if (other.name != null)
				return false;
			
		} else if (!name.equals(other.name))
			return false;
		
		return true;
	}
	
}

public class Ex01 {
	public static void main(String[] args) {
		Person per1 = new Person("홍길동", 25);
		Person per2 = new Person("홍길동", 25);
		Person per3 = per1;
		
		
		// toString() : 참조 변수 출력시 자동으로 호출되게 되어 있음
		// - 이를 오버라이딩 하면 참조 변수를 원하는 형태로 출력 가능
		System.out.println("per1 = " + per1);
		System.out.println("per1 = " + per1.toString());
		
		System.out.println("\nper2 = " + per2);
		System.out.println("per3 = " + per3);
		
		// 참조 변수의 비교는 같은 인스턴스를 '가리키면' true
		System.out.println("\nper1 == per2 결과) " + (per1 == per2));
		System.out.println("per1 == per3 결과) " + (per1 == per3));
		
		// 실제 인스턴스의 필드값으로 비교를 하려면 equals()라는 메서드를 사용
		// - 상속 받은 형태로 그냥 쓰면 ==와 동일
		// - 따라서, 오버라이드 해서 사용하는 것이 일반적
		System.out.println("\nper1.equals(per2) 결과) " + per1.equals(per2));
		System.out.println("per1.equals(per3) 결과) " + per1.equals(per3));
		
	}
}
