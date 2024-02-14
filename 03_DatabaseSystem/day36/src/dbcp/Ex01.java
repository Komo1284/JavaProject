package dbcp;

import model.DAO;

/*
	DBCP : DataBase Connection Pooling
	- DB 접속을 좀 더 효율적으로 바꿔주는 라이브러리
	
	※ JDBC만 있으면 접속은 가능하지만 효율이 떨어진다
	1. Connection이 필요할 때 하나 생성한다.
	2. 실행할 SQL 구문을 실행후 결과를 반환 받는다.
	3. Connection은 무한히 생성할 수 없으므로 사용 후 close로 끊어 준다.
	
	여기서 DB 접속할 때마다 1~3 과정이 반복된다.
	이 부분이 비효율적이다
	
	DBCP를 사용하면 서버 실행시 Connection을 미리 한번에 일정량을 생성한다
	생성한 Connection은 Pool이라는 공간에 저장되고 필요시마다 꺼내 쓰고 반납하게 된다
*/

public class Ex01 {
	public static void main(String[] args) {
		DAO dao = new DAO();
		System.out.println(dao.test());
	
	}
}
