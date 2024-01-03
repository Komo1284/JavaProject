package interaction;

class Student {
	String name;
	int kor, eng, mat;
	Student(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	void showInfo() {
		String msg = "%s (국 %d, 영 %d, 수 %d)\n";
		System.out.printf(msg, name, kor, eng, mat);
	}
}

public class Ex02 {
	public static void main(String[] args) {
		// 클래스 타입도 배열로 생성 가능하다
		// 1. 참조 변수를 배열에 할당
		Student s1 = new Student("홍길동", 70, 80, 98);
		Student s2 = new Student("김민지", 88, 77, 71);
		Student s3 = new Student("박철수", 99, 83, 71);
		
		Student[] stus1 = new Student[] { s1, s2, null };
		
		stus1[2] = s3;
		
		// 2. 인스턴스를 바로 배열에 할당
		Student[] stus2 = new Student[] {
				new Student("이수진", 87, 78, 93),
				null,
				new Student("최민수", 67, 99, 93)
		};
		
		stus2[1] = new Student("신철민", 90, 80, 76);
		
		for(int i = 0; i < stus2.length; i++) {
			stus2[i].showInfo();
		}
	}
}
