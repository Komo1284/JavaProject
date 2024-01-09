package abstract_;

import other.Animal;

class Cat extends Animal {

	public Cat(String type) {
		super(type);
	}

	@Override
	public void bark() {
		System.out.println("야옹");
	}
	
}

class Dog extends Animal {

	public Dog(String type) {
		super(type);
	}
	
	@Override
	public void bark() {
		System.out.println("멍멍");
	}
	
}

public class Ex03 {
	public static void main(String[] args) {
		Cat cat = new Cat("페르시안");
		Dog dog = new Dog("말티즈");
		
		// 동물들 집합!
		Animal[] ani = new Animal[] {cat, dog};
		
		// 동물들 울음소리!
		for (int i = 0; i < ani.length; i++) {
			ani[i].bark();
		}
		
		// 동물 친구들 밥먹자!
		for (int i = 0; i < ani.length; i++) {
			ani[i].eat("사료");
		}
		System.out.println();
		
		// 아래는 개별로 명령(= 메서드)을 수행
		// - 다형성이 아닌, 그냥 다르게 실행한 것
		ani[0].eat("츄르");
		ani[1].eat("개껌");
		
		// 다형성은 동일한 형태로 실행하는데, 다르게 수행되는 것을 의미
		// 따라서, 상속과 오버라이드가 꼭 필요
	}
	
}
