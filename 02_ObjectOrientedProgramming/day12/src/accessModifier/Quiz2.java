package accessModifier;

import quiz.Car;
import quiz.Person;

public class Quiz2 {
	public static void main(String[] args) {
		// 아래 코드가 동작하게 클래스를 작성
		Car car = new Car("모닝");
		//필드 : 모델명, 속도, 운전자(= 사람)
		Person hong = new Person("홍길동", 30);
		
		car.showInfo();		// 모닝 (0 km/h, x)
		
		car.rideOn(hong);	// 홍길동이 탑승
							// 모닝 (0 km/h, 홍길동)
		
		car.accel(30);		// 30 km/h 가속(단, 운전자가 없으면 동작x)
							// 모닝 (30 km/h, 홍길동)
	}
}
