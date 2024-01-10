package abstract_;

import java.util.Arrays;
import java.util.Comparator;

// Comparable은 해당 클래스의 '기본' 비교기준으로 사용된다
// - 지정 클래스에 상속 받아서 구현

class Human implements Comparable<Human>{
	private String name;
	private int age;
	private double height;
	
	Human(String name, int age, double height){
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	@Override
	public String toString() {
		String msg = "%s (%d세, %.1fcm)";
		msg = String.format(msg, name, age, height);
		return msg;
	}
	
	@Override
	public int compareTo(Human o) {
		
		return name.compareTo(o.name);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}

public class Ex07 {
	public static void main(String[] args) {
		Human[] hus = new Human[] {
				new Human("홍길동", 22, 172.3),
				new Human("김민수", 26, 183.9),
				new Human("이나영", 33, 162.8)
		};
		
		Arrays.sort(hus);
		System.out.println("hus = " + Arrays.toString(hus));
		
		// 그 외 비교 기준은 외부에서 Comparator를 사용한다
		Comparator<Human> ageDesc = (Human o1, Human o2) -> {
			return o2.getAge() - o1.getAge();
		};
		
		Arrays.sort(hus, ageDesc);
		System.out.println("\nhus = " + Arrays.toString(hus));
	}
}
