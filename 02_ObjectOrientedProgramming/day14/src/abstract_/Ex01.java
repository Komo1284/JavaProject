package abstract_;

/*
	다형성
	- 다양한 형태를 띈다는 의미
	- 하나의 명령으로 다양한 복합적인 효과를 내기 위해 사용
*/

class Figure{
	void draw() {
		System.out.println("도형을 그린다");
	}
}

class Triangle extends Figure{
	@Override
	void draw() {
		System.out.println("삼각형을 그린다");
	}
}

class Square extends Figure{
	@Override
	void draw() {
		System.out.println("사각형을 그린다");
	}
}

class Circle extends Figure{
	@Override
	void draw() {
		System.out.println("원을 그린다");
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Figure fi = new Figure();
		Triangle tr = new Triangle();
		Square sq = new Square();
		Circle ci = new Circle();
		
		// 도형 집합!
		Figure[] fis = new Figure[] { fi, tr, sq, ci };
		
		for (int i = 0; i < fis.length; i++) {
			fis[i].draw();
		}
	}
}
