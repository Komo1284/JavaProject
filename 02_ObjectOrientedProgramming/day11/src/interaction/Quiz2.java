package interaction;

class Human {
	String name;
	Human(String name){
		this.name = name;
	}
}

class Taxi {
	// - 0 index : 운전석
	// - 나머지 : 보조석
	String model;
	int speed;
	Human[] sits = new Human[4];
	Taxi(String model) {
		this.model = model;
	}
	
	void showInfo() {
		String tmp[] = new String[4];
		String msg = "%s : [%s, %s, %s, %s]\n";
		for(int i = 0; i < tmp.length; i++) {
			if(sits[i] != null) {
				tmp[i] = sits[i].name;
			}else {
				tmp[i] = "빈좌석";
			}
		}
		System.out.printf(msg,model,tmp[0],tmp[1],tmp[2],tmp[3]);
		System.out.printf("%s (%d km/h)\n\n", model, speed);
	}
	
	void rideOn(int sit,Human human) {
		if (sits[sit] == null) {
			sits[sit] = human;
			if(sit == 0) {
				System.out.printf("%d석(= 운전석)에 %s 탑승\n",sit,human.name);
			}else {
				System.out.printf("%d번석에 %s 탑승\n",sit,human.name);
			}
		}else {
			System.out.println("탑승불가");
		}
	}
	
	void accel(int speed) {
		if(sits[0] != null) {
			this.speed += speed;
		}
		showInfo();	
		
	}
	
}

public class Quiz2 {
	public static void main(String[] args) {
		Taxi car = new Taxi("아반떼");
		
		Human hong = new Human("홍길동");
		Human kim = new Human("김민수");
		Human lee = new Human("이수민");
	
		car.showInfo();			// 아반떼 : [빈좌석, 빈좌석, 빈좌석, 빈좌석]
		
		car.rideOn(0, hong);	// 0번석(= 운전석)에 홍길동 탑승
		car.rideOn(1, kim);		// 1번석에 김민수 탑승
		
		car.rideOn(1, lee);		// 1번은 이미 사람이 앉은 좌석 -> 탑승 불가
		car.rideOn(3, lee);		// 3번석에 이수민 탑승
		
		car.showInfo();			// 아반떼 : [홍길동, 김민수, 빈좌석, 이수민]
		
		car.accel(30);			// 자동차 가속 메서드
								// 운전자가 없으면 실행x
		
	}
}
