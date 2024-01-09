package final_;

public class Ex02 {
	public static void main(String[] args) {
		// final 변수에 값을 초기화 하지 않으면 딱 1번 값을 할당 가능
		final int fn;
		
		fn = 10;
		System.out.println("fn = " + fn);
		
		// 상수로 주로 사용되는 값 원주율 PI
		// - 이 값이 변경(= 회손)되면 원에 관한 모든 연산이 잘못됨
		// - 따라서, final은 변경 불가능하게 잠금을 거는 역할
		// Math.PI = 4.14;
		
		double r = 6.7;
		double cir = Math.pow(r, 2) * Math.PI;
		
		System.out.println("cir = " + cir);
	}
}
