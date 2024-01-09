package abstract_;

import other.Animal;

class Bird extends Animal {

	public Bird(String type) {
		super(type);
	}

	@Override
	public void bark() {
		System.out.println("짹짹");
	}
	
}

class Hamster extends Animal {

	public Hamster(String type) {
		super(type);
	}

	@Override
	public void bark() {
		System.out.println("찍찍");
	}
	
}

public class Quiz1 {
	public static void main(String[] args) {
		Bird bird = new Bird("앵무새");
		Cat cat = new Cat("페르시안");
		Dog dog = new Dog("말티즈");
		Hamster ham = new Hamster("시리아 햄스터");
		
		Animal[] ani = new Animal[] {bird, cat, dog, ham};
		
	
		// 울음 소리 출력
		for(int i = 0; i < ani.length; i++) {
			ani[i].bark();
		}
		System.out.println();
		
		// 각각, 별도의 사료를 먹음을 출력
		ani[0].eat("모이");
		ani[1].eat("츄르");
		ani[2].eat("개껌");
		ani[3].eat("해바라기씨");
		
	}
}
