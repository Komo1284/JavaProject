package generic;

public class Ex02 {
	// 1. 일단 전달 인자를 Object로 받는다
	// 2. 호출시 전달된 인자의 자료형을 T에 저장한다
	// 3. 종속문 실행시 T에 저장한 타입으로 다운 캐스팅을 수행
	static <T> void printArr(T[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		Integer[] arr1 = new Integer[] {10,20,30,40,50};
		Double[] arr2 = new Double[] { 3.14, 5.1};
		String[] arr3 = new String[] { "java", "c++" };
		
		printArr(arr1);
		printArr(arr2);
		printArr(arr3);
	}
}
