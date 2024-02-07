package jdbc;

import model.JoinDAO;
import model.vo.JoinVO;

public class Quiz2 {
	public static void main(String[] args) {
		// 1. emp(A)와 dep(B)의 inner join한 결과를 출력
		// 단, dep_idx로 오름차순, A.idx로 내림차순
		JoinDAO dao = new JoinDAO();
		for(JoinVO row : dao.inner()) {
			System.out.println(row);
		}
		
		System.out.println();
		
		// 2. emp(A)와 dep(B)의 right outer join한 결과를 출력
		// 단, dep_idx로 오름차순, A.idx로 내림차순
		for(JoinVO row : dao.rightOuter()) {
			System.out.println(row);
		}
		
	}
}
