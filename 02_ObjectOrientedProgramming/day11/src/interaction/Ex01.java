package interaction;

// 서로 다른 클래스 객체 간에 상호작용을 적용

class Person {
	String name;
	
	Person(String name){
		this.name = name;
	}
}

class Car {
	String model;	// 모델명
	int speed;		// 속도
	Person driver;	// 운전자 (=사람)
	
	public Car(String model) {
		super();
		this.model = model;
	}
	
	void showInfo() {
		
		String name = (driver == null) ? "없음" : driver.name;
		String msg = "%s (%d km/h, %s)\n";
		System.out.printf(msg, model, speed, name);
	}
	
	void rideOn(Person driver) {
		this.driver = driver;
		showInfo();
	}
	
	void accel(int speed) {
		if (driver == null) {
			System.out.println("운전자가 없습니다!!!");
			return;
		}
		this.speed += speed;
		System.out.println(speed + " km/h 가속");
		showInfo();
	}
	
	void break_(int speed) {
		this.speed -= speed;
		System.out.println(speed + " km/h 감속");
		showInfo();
	}
	
	void rideOff(){
		if (this.speed == 0) {
			this.driver = null;
			System.out.println("하차합니다.");
		}else {
			System.out.println("차가 움직이고 있습니다.");
		}
		
		showInfo();
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Person hong = new Person("홍길동");
		Car car = new Car("Audi");
		
		car.showInfo();
		
		car.rideOn(hong);
		
		// 연습) 자동차 가속 메서드
		// 1. 전달한 정수만큼 속도를 증가
		// 2. 단, 운전자가 없으면 속도 증가가 되지 않게 한다
		car.accel(30);
		
		// 감속 메서드. 마찬가지로 운전자가 있어야 함
		car.break_(20);
		
		// 하차 메서드. 단, 속도가 0이 아니면 불가능
		car.rideOff();
	}
}
