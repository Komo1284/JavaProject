package abstract_;

import java.util.Arrays;
import java.util.Comparator;

class Person{
	private String name;
	private Integer age;
	Person(String name, Integer age){
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name + " " + age + "세";
	}
	
}

public class Quiz1 {
	public static void main(String[] args) {
		
		// 1. 실수형 배열을 생성 후 내림 차순 정렬
		Double[] arr1 = new Double[] {3.14, 2.22, 5.12};
		Comparator<Double> desc = (Double o1, Double o2) -> {
			return (int) (o2 - o1);
		};
		
		Arrays.sort(arr1, desc);
		System.out.println("arr1 = " + Arrays.toString(arr1));
		
		
		// 2. 문자열 배열을 생성 후 오름 차순 정렬
		String[] arr2 = new String[] {"Apple", "Samsung", "Nokia"};
		Arrays.sort(arr2);
		System.out.println("arr1 = " + Arrays.toString(arr2));
		
		// 3. Person 클래스를 생성후 이름순으로 내림 차순
		// 필드는 이름, 나이만 가진다
		Person hong = new Person("홍길동", 24);
		Person lee = new Person("이신정", 55);
		Person kim = new Person("김진호", 32);
		Person[] arr3 = new Person[] {hong, lee, kim};
		Comparator<Person> desc2 = (Person o1, Person o2) -> {
			String name1 = o1.getName();
			String name2 = o2.getName();
			
			return name2.compareTo(name1);
			// return o2.getAge() - o1.getAge();
		};
		
		Arrays.sort(arr3, desc2);
		System.out.println("arr3 = " + Arrays.toString(arr3));
		
	}
}
