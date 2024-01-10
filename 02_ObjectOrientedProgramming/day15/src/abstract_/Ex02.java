package abstract_;

import other.Animal;
import other.FlyAble;

interface Machine{}

// 인터페이스만 단족으로 상속 가능
// 또, 다중 상속이 가능
class Airplain implements FlyAble,Machine {
	@Override
	public void fly() {
		System.out.println("엔진으로 날아간다");
	}
	
}

public class Ex02 {
	public static void main(String[] args) {
		Cat cat = new Cat();
		Dog dog = new Dog();
		Bird bird = new Bird();
		
		Airplain air = new Airplain();
		
		// 동물들 모여라
		Animal[] anis = new Animal[] {cat,dog,bird};
		
		// 날수있는 녀석들 모여라
		FlyAble[] flys = new FlyAble[] {bird,air};
		
		for (int i = 0; i < anis.length; i++) {
			anis[i].bark();
		}
		System.out.println();
		
		// 날수있는 녀석들의 날기
		for (int i = 0; i < flys.length; i++) {
			flys[i].fly();
		}
	}
}
