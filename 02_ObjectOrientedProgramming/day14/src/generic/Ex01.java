package generic;

/*
	Generic : 일반적인
	Generic Programming
	- 다양한 자료형에 대해서 타입에 의존하지 않고 개발하는 방식
	
	원리)
	1. Object로 up-casting해서 사용한다
	2. 하지만, 자식의 멤버를 사용할 수 없게 된다
	3. 따라서, 자동으로 원래 타입으로 다운 캐스팅 되게 구현되어 있다
*/

public class Ex01 {
	
	static void printArr(Object[] arr) {
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
