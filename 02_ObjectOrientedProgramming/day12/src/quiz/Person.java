package quiz;

public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public void showInfo(){
		System.out.printf("%s (%d세)\n",name, age);
	}
	
	public void eat(String food) {
		System.out.printf("%s(이)가 %s을(를) 먹는다\n",name, food);
	}
	
	public void talkTo(Person tar) {
		System.out.printf("%s이(가) %s에게 대화를 건다\n",name,tar.name);
	}
}
