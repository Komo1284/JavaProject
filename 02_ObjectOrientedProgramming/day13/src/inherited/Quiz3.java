package inherited;

import other.Person;

class Airplain {
	// 비행기 좌석
	private Person[] sits = new Person[10]; 
	
	void ride(Person per) {
		for (int i = 0; i < sits.length; i++) {
			if (sits[i] == null) {
				sits[i] = per;
				
				System.out.printf("%s님 탑승\n", per.getName());
				return;
			}
		}
		
		System.out.println("남은 좌석이 없습니다...");
	}
	
	void list() {
		System.out.println("\n좌석 현황)");
		
		for (int i = 0; i < sits.length; i++) {
			String msg = "%d번 좌석 : %s\n";
			String info = (sits[i] == null) ? "-- 빈좌석 --" : sits[i].showInfo();
			
			System.out.printf(msg, i + 1, info);
		}
	}
	
	void emergency(Person per) {
		System.out.println("\n긴급 상황 발생");
		System.out.println("기내에서 의사를 찾습니다...");
		
		for (int i = 0; i < sits.length; i++) {
			if (sits[i] instanceof Doctor) {
				System.out.println("의사 발견!!!");
				
				Doctor tmp = (Doctor)sits[i];
				tmp.cure(per);
				
				return;
			}
		}
		
		System.out.println("기내에 의사가 없습니다...");
	}
}

public class Quiz3 {
	public static void main(String[] args) {
		Person per = new Person("홍길동", 33);
		Student stu = new Student("김철수", 16, 88);
		Police pol = new Police("조수진", 38, "경감");
		Doctor doc = new Doctor("박하나", 30, "내과");
		
		Airplain air = new Airplain();
		
		air.ride(per);			// 비행기에 사람을 태우는 메서드
		air.ride(stu);			// 좌석에는 0번 부터 순서대로 앉도록 한다
		air.ride(pol);			// 단, 좌석이 부족하면 탑승 불가 메세지를 출력
		air.ride(doc);
		
		air.list();				// 승객 목록을 출력
								// 완료 후 좌석을 늘려서 테스트
		
		air.emergency(stu);		// 긴급 상황 메서드
								// 기내에서 의사를 찾아서
								// 전달된 사람을 치료
	}
}
