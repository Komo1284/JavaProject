package main;

import org.springframework.context.support.GenericXmlApplicationContext;

import beans.Toy;

public class Ex02 {
	public static void main(String[] args) {
		
		GenericXmlApplicationContext gxac;
		gxac = new GenericXmlApplicationContext("classpath:resources/appCtx.xml");
		
		
		Toy t1 = gxac.getBean(Toy.class);
		
		System.out.println("t1 = " + t1);
		
		t1.run();
		
		gxac.close();
	}
}
