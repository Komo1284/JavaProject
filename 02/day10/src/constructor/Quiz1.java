package constructor;

class Car{
	String name = "";
	int speed = 0;
	Car(String name){
		this.name = name;
	}
	void accel(int speed) {
		this.speed += speed;
		System.out.printf("%d km/h 가속\n",speed);
		showInfo();
	}
	void break_(int speed) {
		this.speed -= speed;
		System.out.printf("%d km/h 감속\n",speed);
		showInfo();
	}
	void showInfo() {
		System.out.printf("%s (%d km/h)\n", name, speed);
	}
}

public class Quiz1 {
	public static void main(String[] args) {
		
		//아래 코드가 동작하게 클래스를 작성
		Car car = new Car("모닝");		// 필드 : 모델명, 속도
		
		car.showInfo();		// 모닝(0 km/h)
		
		car.accel(40);		// 40 km/h 가속
							// 모닝(40 km/h)
		
		car.break_(15);		// 15 km/h 감속
							// 모닝(25 km/h)
	}
}
