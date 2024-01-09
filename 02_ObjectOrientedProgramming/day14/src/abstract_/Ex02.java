package abstract_;

/*
	추상 클래스
	- 추상적인 개념의 객체를 작성시 사용
	- 추상적인 개념이라 실체가 없다
	- 따라서, '인스턴스 생성이 불가능'
	- 상속만을 위 한 클래스
	- 또, 추상 메서드를 가질 수 있다
*/
abstract class Figure_{
	// 일반 메서드
	void show() {
		System.out.println("도형 객체 입니다");
	}
	
	// 추상 메서드
	// - 실행 코드(= 몸체)가 없는 껍데기 메서드
	// - 자식에서 오버라이드를 강제한다
	abstract void draw();
}

class Triangle_ extends Figure_{
	@Override
	void draw() {
		System.out.println("삼각형을 그린다");
	}
}

class Square_ extends Figure_{
	@Override
	void draw() {
		System.out.println("사각형을 그린다");
	}
}

class Circle_ extends Figure_{
	@Override
	void draw() {
		System.out.println("원을 그린다");
	}
}

public class Ex02 {
	public static void main(String[] args) {
		// - 추상 클래스는 인스턴스 생성 불가능
		// Figure_ fi = new Figure_();
		
		Triangle_ tr = new Triangle_();
		Square_ sq = new Square_();
		Circle_ ci = new Circle_();
		
		Figure_[] fis = new Figure_[] { tr, sq, ci };
		
		// 일반 메서드 -> 동일하게 수행
		for(int i = 0; i < fis.length; i++) {
			fis[i].show();
		}
		System.out.println();
		
		// 추상 메서드 -> 다양하게 수행
		for(int i = 0; i < fis.length; i++) {
			fis[i].draw();
		}
	}
}
