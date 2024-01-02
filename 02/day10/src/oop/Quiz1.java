package oop;

class Student{
	String name;
	int kor,eng,mat;
	
	void showInfo() {
		System.out.printf("이름: %s (국 %d, 영 %d, 수 %d)\n",name,kor,eng,mat);
	}
	int total() {
		int total = kor+eng+mat;
		return total;
	}
	
	double avg() {
		double avg = (kor+eng+mat)/3.0;
		return avg;
	}
}

public class Quiz1 {
	public static void main(String[] args) {
		// 아래 코드가 동작하게 클래스를 작성하세요
		Student minsu = new Student();
		
		minsu.name = "김민수";
		minsu.kor = 70;
		minsu.eng = 80;
		minsu.mat = 98;
		
		minsu.showInfo();	// 이름: 김민수 (국 70, 영 80, 수 98)
		
		System.out.println("합계 : " + minsu.total());
		System.out.println("평균 : " + minsu.avg());
	}
}
