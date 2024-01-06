package array;

import java.util.Arrays;

/*
	배열은 초기화 하지 않으면 기본값으로 초기화된다고 했다
	각 타입의 기본값은 아래와 같다
	
	1. boolean : false
	2. char : '\0'
	3. 정수 : 0
	4. 실수 : 0.0
	5. 클래스 : null
*/

public class Ex04 {
	public static void main(String[] args) {
		boolean[] bos = new boolean[3];
		char[] chs = new char[4];
		int[] its = new int[5];
		double[] cbs = new double[3];
		String[] sts = new String[3];
		
		System.out.println("bos = " + Arrays.toString(bos));
		System.out.println("chs = " + Arrays.toString(chs));
		System.out.println("its = " + Arrays.toString(its));
		System.out.println("cbs = " + Arrays.toString(cbs));
		System.out.println("sts = " + Arrays.toString(sts));
	}
}
