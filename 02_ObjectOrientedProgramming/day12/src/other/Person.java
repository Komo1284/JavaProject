package other;

public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	// getter : 필드의 값을 얻을 때
	public String getName() {
		return name;
	}
	
	// setter : 필드의 값을 변경할 때
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
