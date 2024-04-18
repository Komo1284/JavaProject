package com.itbank.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.itbank.service.TestService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class AopTest {
	
	@Autowired
	private TestService ts;
	
	@Test
	public void test1() {
		ts.firstAOP();
	}
	
	@Test
	public void runTime() throws InterruptedException {
		long begin = System.currentTimeMillis();
		
		System.out.println("로직 수행~~");
		Thread.sleep(1000);
		
		long end = System.currentTimeMillis();
		
		System.out.println("소요 시간 : " + (end - begin) / 1000.0);
		
	}
	

}
