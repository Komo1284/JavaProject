package varialbe;

/*
	자바의 자료형	타입		크기
	-----------------------
	boolean		논리		1bit
	char		문자		2byte
	byte		정수		1byte
	short		정수		2byte
	int			정수		4byte
	long		정수		8byte
	float		실수		4byte
	double		실수		8byte
	
	*정수의 대표는 int
	*실수의 대표는 double
	*변수에 저장되지 않은 상수는 항상 대표 타입으로 지정된다
 */

public class Ex03 {
	public static void main(String[] args) {
		// 변수의 선언 : 변수를 생성하는 것
		int n = 10;
		
		System.out.println("n");
		System.out.println(n);
		
		System.out.println("n = " + n);
	}
}
