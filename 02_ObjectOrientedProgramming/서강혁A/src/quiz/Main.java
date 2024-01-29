package quiz;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

import collection.Controller;
import collection.Student;


/*
	회원가입,탈퇴,전체목록,단일검색,정렬(id로 내림차순) 메뉴생성
	id중복 x
	id로만 검색 - 회원유형을 같이 표시
	각 회원정보는 비밀번호 제외 모든 속성 표시
	배열사용시, 최대 회원수는 100으로 설정
*/

class Member{
	String id;
	String password;
	String name;
	String type;
	
	public Member(String id, String password, String name, String type){
		this.id = id;
		this.password = password;
		this.name = name;
		this.type = type;
	}
	
}

class Seller extends Member{
	 String store;

	public Seller(String id, String password, String name, String type, String store) {
		super(id, password, name, type);
		this.store = store;
	}
	
	@Override
		public String toString() {
			return store;
		}
}

class Customer extends Member{
	String address;

	public Customer(String id, String password, String name, String type, String address) {
		super(id, password, name, type);
		this.address = address;
	}
	
	@Override
		public String toString() {
			return address;
		}
	
}

class Controller {
	private Scanner sc = new Scanner(System.in);
	LinkedList<Member> list = new LinkedList<Member>();
	
	private void showMenu() {
		System.out.println("--회원 정보 관리 프로그램--");
		System.out.println("1. 전체회원 정보");
		System.out.println("2. 회원 가입");
		System.out.println("3. 회원 탈퇴");
		System.out.println("4. 회원 정보 검색");
		System.out.println("5. 회원 정렬");
		System.out.println("0. 종료\n");
		
		System.out.print(">>> ");
	}
	
	private void showInfo() {
		System.out.println("<<회원 목록>>");
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("ID: %s, 이름: %s, 회원타입: %s\n",
					list.get(i).id,list.get(i).name,list.get(i).type);
		}
	}

	private void addlist() {
		System.out.println("회원 정보를 추가합니다.");
		System.out.println("회원타입을 선택해주세요 >> ");
		System.out.print("1. 판매자\n2. 구매자\n");
		String id,password,name,t,store,address;
		boolean check = true;
		int type = sc.nextInt();
		switch (type) {
		case 1 : 
			t = "판매자";
			System.out.print("회원의 ID를 입력해주세요 >> ");
			id = sc.next();
			for(int i = 0; i < list.size(); i++) {
				if(id.equals(list.get(i).id)) {
					check = false;
				}
				else {
					check = true;
				}
			}
			if (check) {
				System.out.print("회원의 PASSWORD를 입력해주세요 >> ");
				password = sc.next();
				System.out.print("회원의 이름을 입력해주세요 >> ");
				name = sc.next();
				System.out.print("판매자님의 가게이름을 입력해주세요 >> ");
				store = sc.next();
			}else {
				System.out.println("중복된 ID입니다. 처음으로 돌아갑니다.");
				break;
			}
			
			Member sel = new Seller(id,password,name,t,store);
			list.add(sel);
			System.out.println("회원가입이 완료되었습니다.");
			break;
		case 2 :
			t = "구매자";
			System.out.print("회원의 ID를 입력해주세요 >> ");
			id = sc.next();
			for(int i = 0; i < list.size(); i++) {
				if(id.equals(list.get(i).id)) {
					check = false;
				}
				else {
					check = true;
				}
			}
			if (check) {
				System.out.print("회원의 PASSWORD를 입력해주세요 >> ");
				password = sc.next();
				System.out.print("회원의 이름을 입력해주세요 >> ");
				name = sc.next();
				System.out.print("구매자님의 배송지를 입력해주세요 >> ");
				address = sc.next();
			}else {
				System.out.println("중복된 ID입니다. 처음으로 돌아갑니다.");
				break;
			}
			
			Member cus = new Customer(id,password,name,t,address);
			list.add(cus);
			System.out.println("회원가입이 완료되었습니다.");
			break;
		}
	}
	
	private void searchInfo() {
		System.out.print("상세정보를 보고싶은 회원의 ID를 입력하세요 >> ");
		String id = sc.next();
		for(int i = 0; i < list.size(); i++) {
			if(id.equals(list.get(i).id)) {
				System.out.printf("ID : %d\n",list.get(i).id);
				System.out.printf("이름 : %s\n",list.get(i).name);
				if (list.get(i).type.equals("판매자")) {
					System.out.printf("가게이름 : %s\n",list.get(i).toString());
				}else {
					System.out.printf("배송주소 : %s\n",list.get(i).toString());
				}
			}
		}
	}
	
	private void removeInfo() {
		System.out.print("회원 탈퇴할 ID를 입력해주세요 >> ");
		String id = sc.next();
		for(int i = 0; i < list.size(); i++) {
			if(id.equals(list.get(i).id)) {
				list.remove(i);
			}
		}
		System.out.println("회원탈퇴가 완료되었습니다.");
	}
	
	private void sortID() {
		Comparator<Member> desc = new Comparator<Member>() {
			@Override
			public int compare(Member o1, Member o2) {
				
				return o2.id.compareTo(o1.id);
			}
		};
		list.sort(desc);
	}
	
	void run() {
		int menu;
		
		do {
			showMenu();
			menu = sc.nextInt();
			
			switch(menu){
			case 1 : showInfo(); break;
			case 2 : addlist(); break;
			case 3 : removeInfo(); break;
			case 4 : searchInfo(); break;
			case 5 : sortID(); break;
			case 0 : System.out.println("프로그램 종료");
			}
			
		}while(menu != 0);
		
		sc.close();
	}
}

public class Main {
	public static void main(String[] args) {
		new Controller().run();
	}
}
