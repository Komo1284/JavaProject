package other;

public abstract class Animal {
	// 일반 메서드
	public void eat(String food) {
		System.out.println(food + "(을)를 먹는다");
	}
	
	// 추상 메서드
	public abstract void bark();
}
