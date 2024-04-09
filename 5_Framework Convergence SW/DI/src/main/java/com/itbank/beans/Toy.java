package com.itbank.beans;

public class Toy {
	private Battery bat;
	
	public void run() {
		if (bat == null) {
			System.out.println("베터리가 없습니다!!!");
			return;
		}
		
		System.out.println("장난감이 움직 입니다~\n");
	}

	public void setBat(Battery bat) {
		this.bat = bat;
	}
	
}
