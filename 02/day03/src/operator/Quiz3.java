package operator;

/*
	현재 건물에 엘리베이터가 2대 존재한다
	A는 7층, B는 9층에 머물러 있다
	엘리베이터는 1층 ~ 15층까지 있다
	현재 사용자의 위치에 따라서 가까운 엘리베이터를 호출한다
	단, 거리가 같으면 A를 호출한다
	
	ex) 현재 5층   -> A를 호출합니다
	ex) 현재 10층 -> B를 호출합니다
*/

public class Quiz3 {
	public static void main(String[] args) {
		int A = 7, B = 9;
		int cur = 10;
		
		int disA = A - cur;
		int disB = B - cur;
		
		disA = (disA < 0) ? -disA : disA;
		disB = (disB < 0) ? -disB : disB;
		
		System.out.println("A와의 거리 : " + disA);
		System.out.println("B와의 거리 : " + disB);
		
		char result = (disA < disB) ? 'A' : 'B';
		
		System.out.printf("가까운 %c를 호출합니다\n", result);
	}
}
