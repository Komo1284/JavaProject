package generic;

class Po <T> {
	private T x,y;
	
	Po(T x, T y){
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	
	Po<T> add(Po<T> p){
//		T x = this.x + p.x;
		return	null;
	}
}

public class Ex03 {
	public static void main(String[] args) {
		Po<Integer> p1 = new Po<>(5,6);
		Po<Double> p2 = new Po<>(3.12, 6.7);
		
		System.out.println("p1 = " + p1);
		System.out.println("p2 = " + p2);
		
		Po<Integer> p3 = new Po<>(3, 8);
		Po<Integer> p4 = p1.add(p3);
	}
}
