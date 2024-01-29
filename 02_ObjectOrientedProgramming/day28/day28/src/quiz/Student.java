package quiz;

public class Student {
	private String name;
	private int kor, eng, mat;
	
	public Student(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	@Override
	public String toString() {
		String msg = "%s %d %d %d";
		msg = String.format(msg, name, kor, eng, mat);
		
		return msg;
	}
	
	public void update(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	public String getName() {
		return name;
	}
}
