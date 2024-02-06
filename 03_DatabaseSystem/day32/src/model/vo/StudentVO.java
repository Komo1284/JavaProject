package model.vo;

import java.util.Scanner;

public class StudentVO {
	private int idx,kor,eng,mat;
	private String name;
	
	@Override
	public String toString() {
		String msg = "%d %s %d %d %d";
		msg = String.format(msg, idx, name, kor, eng, mat);
		
		return msg;
	}
	
	public void search(Scanner sc) {
		System.out.print("Idx : ");
		idx = sc.nextInt();
		
	}

	public void add(Scanner sc) {
		
		System.out.print("이름 : ");
		name = sc.next();
		
		System.out.print("국어점수 : ");
		kor = sc.nextInt();
		
		System.out.print("영어점수 : ");
		eng = sc.nextInt();
		
		System.out.print("수학점수 : ");
		mat = sc.nextInt();
	}
	
	public void update(Scanner sc) {
		System.out.print("변경할 학생의 학번 : ");
		idx = sc.nextInt();
		
		add(sc);
	}
	

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
