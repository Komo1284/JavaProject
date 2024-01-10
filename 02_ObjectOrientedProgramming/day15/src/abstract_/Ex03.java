package abstract_;

// 인터페이스의 장점
// 1. 프로그램의 규격을 미리 결정하고 일관성 유지 가능
// 2. 코드의 수정 없이 기능의 확장을 도모함
// 3. 다중 상속이 가능하기 떄문에 여러 형태로 업캐스팅 가능

import other.USB;

class PC {
	void connect(USB usb) {
		usb.run();
	}
}

class Phone implements USB {
	@Override
	public void run() {
		System.out.println("휴대폰 연결. 충전 중 80%");
	}
}

class Memory implements USB {
	@Override
	public void run() {
		System.out.println("64GB 메모리 연결. E:\\에 연결됨");
	}
}

class Remocon implements USB {
	@Override
	public void run() {
		System.out.println("리모컨 연결");
	}
}

class Camera implements USB {
	@Override
	public void run() {
		System.out.println("카메라 연결");
	}
}

public class Ex03 {
	public static void main(String[] args) {
		PC pc = new PC();
		
		Phone phone = new Phone();
		Memory mem = new Memory();
		Remocon rem = new Remocon();
		Camera cam = new Camera();
		
		pc.connect(phone);
		pc.connect(mem);
		pc.connect(rem);
		pc.connect(cam);
	}
}
