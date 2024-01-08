package static_;

class Human{
	private String name;
	private static int eyes = 2;
	
	Human(String name){
		this.name = name;
	}
	
	void showInfo() {
		System.out.printf("%s (눈 %d개)\n", name, eyes);
	}
	
	// static 메서드는 this가 없다
	// - 왜? 클래스 자체가 가지며 인스턴스가 공유( = 구분 불필요)
	static int getEyes() {
		return eyes;
	}
	
	static void setEyes(int eyes) {
		Human.eyes = eyes;
		// name = "실행 안됨";
		// - 정적 멤버는 일반 멤버를 참조 할 수 없다
		
	}
}

public class Ex02 {
	public static void main(String[] args) {
		System.out.println("사람 눈 개수 : " + Human.getEyes());
		
		Human hong = new Human("홍길동");
		Human kim = new Human("김민지");
		
		Human.setEyes(3);
		
		hong.showInfo();
		kim.showInfo();
	}
}
