package beans;

// Java Beans 작성 규칙
// 1. 기본 생성자가 꼭 필요하다
// 2. getter/setter가 필요하다

public class Person {
	private String name;
	private int age;
	private double height;
	
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
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}

	
}
