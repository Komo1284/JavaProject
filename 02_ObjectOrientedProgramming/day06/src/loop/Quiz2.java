package loop;

/*
 * 1. 1~1000까지의 합계를 출력
 * 
 * 2. 1~1000까지의 합계를 출력
 * 단, 3의 배수는 합에서 제외
 * 
 * 3. 1~1000까지의 합계를 출력
 * 단, 3의 배수는 합에서 제외. 3,5의 공배수는 합에 포함
 * 
 */

public class Quiz2 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i <= 1000; i++) {
			sum += i;
		}
		System.out.println("1 ~ 1000의 합은 : " + sum);
		
		sum = 0;
		for(int i = 1; i <= 1000; i++) {
			if(i % 3 == 0) {
				continue;
			}
			sum += i;
		}
		System.out.println("1 ~ 1000의 합(3의 배수 제외) : " + sum);
		
		sum = 0;
		for(int i = 1; i <= 1000; i++) {
			if((i % 3 == 0) && (i % 5 != 0)) {
				continue;
			}
			sum += i;
		}
		System.out.println("1 ~ 1000의 합(3의 배수 제외,3과5의 공배수는 포함) : " + sum);
		
		// if문은 빈구문으로도 의미가 있음
	}
	
	
}
