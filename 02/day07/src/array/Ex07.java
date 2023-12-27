package array;

public class Ex07 {
	public static void main(String[] args) {
		int[][] arr = new int[3][4];
		
		System.out.println("arr의 크기 :" + arr.length);
		System.out.println("arr[0]의 크기 : " + arr[0].length + "\n");
		
		arr[0][2] = 7;
		arr[1][0] = 16;
		
		for (int i = 0; i < arr.length; i++	) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ", arr[i][j]);
				// %nd : n자리를 미리 확보 후 데이터를 출력
			}
			System.out.println();
		}
	}
}
