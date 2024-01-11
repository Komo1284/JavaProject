package nested;

class Outer_{
	// private int nout = 10;
	private static int sout = 10;
	
	// 정적 중첩 클래스
	static class Inner_ {
		void inMethod() {
			// - 정적 멤버(Inner)는 일반 멤버(nout)을 참조할 수 없다
			// - 정적 멤버는 일반 멤버가 생성되기 전부터 존재하기 떄문에
			// System.out.println("out = " + nout);
			System.out.println("out = " + sout);
		}
	}
}

public class Ex02 {
	public static void main(String[] args) {
		Outer_.Inner_ in = new Outer_.Inner_();
		in.inMethod();
	}
}
