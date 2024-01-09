package other;

public abstract class Animal {
	protected String type;
	
	public Animal(String type) {
		this.type = type;
	}
	
	public abstract void bark();
	
	public void eat(String food) {
		String msg = "%s(이)가 %s(을)를 먹는다\n";
		System.out.printf(msg, type, food);
	}
}
