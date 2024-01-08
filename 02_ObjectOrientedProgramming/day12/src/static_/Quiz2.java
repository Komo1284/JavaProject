package static_;

class Student{
	private static int total = 0;
	private String name;
	public Student(String name){
		this.name = name;
		total ++;
	}
	
	static int getTotal() {
		return total;
	}
	
	static void remove(int n) {
		total -= n;
	}
	
	public void showInfo(){
		System.out.printf("%s (학급 : %d명)\n",name,Student.getTotal());
	}
}

public class Quiz2 {
	public static void main(String[] args) {
		System.out.println("학급 수 : " + Student.getTotal() + "명");
		
		Student hong = new Student("홍길동");
		System.out.println("학급 수 : " + Student.getTotal() + "명");
		
		Student kim = new Student("김민지");
		Student lee = new Student("이진호");
		System.out.println("학급 수 : " + Student.getTotal() + "명");
		
		hong.showInfo();		// 홍길동 (학급 : 3명)
		kim.showInfo();			// 김민지 (학급 : 3명)
		lee.showInfo();			// 이진호 (학급 : 3명)
		
		// ※ 인스턴스의 참조가 사라지면 인스턴스는 메모리에서 제거된다.
		// - 가비지 컬렉터라는 녀석이 위의 역할을 한다
		hong = null;
		kim = null;
		Student.remove(2);
		
		System.out.println("학급 수 : " + Student.getTotal() + "명\n");
	}
}
