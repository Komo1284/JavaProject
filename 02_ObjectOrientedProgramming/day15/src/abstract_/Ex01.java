package abstract_;

import other.Animal;
import other.FlyAble;

class Cat extends Animal{

	@Override
	public void bark() {
		System.out.println("야옹");
	}	
}

class Dog extends Animal{

	@Override
	public void bark() {
		System.out.println("멍멍");
	}
}

// 클래스와 인터페이스 상속 목적
// 1. 클래스 : 기능 '확장'
// 2. 인터페이스 : 기능 '구현'

class Bird extends Animal implements FlyAble{
	@Override
	public void fly() {
		System.out.println(type + "로 날아간다");
	}

	@Override
	public void bark() {
		System.out.println("짹짹");
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Cat cat = new Cat();
		Dog dog = new Dog();
		Bird bird = new Bird();
		
		// 동물(= Animal)들 모여라(= up-casting)
		Animal[] anis = new Animal[] {cat,dog,bird};
		
		anis[2].bark();
		// anis[2].fly();	FlyAble에 있는 메서드라 실행x
		
		FlyAble fa = bird;
		fa.fly();
	}
}
