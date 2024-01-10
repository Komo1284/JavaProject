package abstract_;

import java.util.Arrays;
import java.util.Comparator;

class Student {
	private String name;
	private int kor, eng, mat;
	Student(String name, int kor, int eng, int mat){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	@Override
	public String toString() {
		String msg = "%s, 국%d 영%d 수%d 합계 : %d\n";
		msg = String.format(msg, name, kor, eng, mat, kor+eng+mat);
		return msg;
	}
	
	
}

public class Quiz2 {
	public static void main(String[] args) {
		// Student 클래스를 작성한 후
		// 성적 합계 순으로 내림 차순한다
		// 필드는 이름, 국 영 수를 가진다
		
		Student[] stus = new Student[] {
			new Student("홍길동",75,23,96),
			new Student("이민정",53,11,76),
			new Student("김지원",12,97,91)
		};
		
		Comparator<Student> score = (Student o1, Student o2) -> {
			int stu1 = o1.getKor() + o1.getEng() + o1.getMat();
			int stu2 = o2.getKor() + o2.getEng() + o2.getMat();
			return stu2 - stu1;
		};
		
		Arrays.sort(stus, score);
		System.out.println(Arrays.toString(stus));
		
		
	}
}
