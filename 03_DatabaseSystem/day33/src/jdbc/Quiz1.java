package jdbc;

import model.DepDAO;
import model.EmpDAO;
import model.vo.DepVO;
import model.vo.EmpVO;

public class Quiz1 {
	public static void main(String[] args) {
		// 1. emp 테이블의 정보를 모두 출력
		// 단, dep_idx 오름 차순, idx 내림차순
		EmpDAO empdao = new EmpDAO();
		for(EmpVO row : empdao.selectAll()) {
			System.out.println(row);
		}
		
		System.out.println();
		
//		 2. dep 테이블의 정보를 모두 출력
//		 단, idx로 오름 차순
		DepDAO depdao = new DepDAO();
		for(DepVO row : depdao.selectAll()) {
			System.out.println(row);
		}
		
	}
}
