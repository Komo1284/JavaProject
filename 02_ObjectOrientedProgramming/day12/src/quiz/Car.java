package quiz;

public class Car {
	private String model,driver;
	private int speed;
	public Car(String model){
		this.model = model;
	}
	
	public void showInfo(){
		if(driver == null) {
			System.out.printf("%s (%d km/h), x\n",model, speed);
		}else {
			System.out.printf("%s (%d km/h), %s\n",model, speed, driver);

		}
	}
	
	public void rideOn(Person name) {
		System.out.printf("%s이(가) 탑승\n",name.getName());
		this.driver = name.getName();
		showInfo();
	}
	
	public void accel(int speed) {
		if(driver == null) {
			System.out.println("운전자가 없습니다.");
		}else {
			System.out.printf("%d km/h 가속\n",speed);
			this.speed += speed;
			showInfo();
		}
		
	}
	
}
