package inherited;

import other.Person;

public class Ex04 {
	public static void main(String[] args) {
		Person per = new Person("홍길동", 34);
		Student stu = new Student("김민지", 16, 87);
		Police pol = new Police("박철수", 36, "경위");
		
		
		// 업 캐스팅은 아래와 같이 하위 클래스를 묶는 용도로 자주 사용된다
		Person[] pers = new Person[] { per, stu, pol };
		
		for (int i = 0; i < pers.length; i++) {
			System.out.println(pers[i].showInfo());
		}
		
		
		// Person 무리 중 학생을 꺼내서 다운 캐스팅을 적용하면
		Student tmp = (Student)pers[1];
		
		// 다시 자식의 멤버를 사용할 수 있게 된다
		tmp.study("Java");
		
		// 다운 캐스팅시 원래 타입과 맞지 않으면 에러
		// tmp = (Student)pers[2];
		
		
		// 업 캐스팅된 인스턴스의 원래 타입 파악하기
		System.out.println(pers[1] instanceof Student);
		System.out.println(pers[2] instanceof Student);

		System.out.println(pers[2] instanceof Police);
	}
}
