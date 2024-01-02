package interaction;

/*
	상호작용
	- 객체 간에 서로 영향을 주고 받는 행위
*/

class Point2D{
	int x, y;

	public Point2D(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	String show() {
		//return "(" + x + ", "+ y + ")";
		return String.format("(%s, %s)", x, y);
	}
	
	Point2D add (Point2D tar) {
		int x = this.x + tar.x;
		int y = this.y + tar.y;
		
		Point2D result = new Point2D(x,y);
		
		return result;
	}
	
	Point2D mul (Point2D tar) {
		return new Point2D(x * tar.x, y * tar.y);
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Point2D p1 = new Point2D(3,2);
		Point2D p2 = new Point2D(5,6);
		
		System.out.println("p1 = " + p1.show());
		System.out.println("p2 = " + p2.show());
		
		// 클래스는 대입 연산자만 수행 가능
		// Point2D p3 = p1 + p2;
		Point2D p3 = p1.add(p2);
		
		System.out.println("p3 = " + p3.show());
		
		// 연습)
		Point2D p4 = p1.mul(p2);		// p1 * p2
		System.out.println("p4 = " + p4.show());
	}
}
