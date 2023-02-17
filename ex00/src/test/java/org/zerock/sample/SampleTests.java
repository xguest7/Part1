package org.zerock.sample;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j;



@Log4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class SampleTests {
		
	//의존성 주입 - 3가지방법(셋터를 이용한 주입,생성자를 통한 주입,직접주입) 
	@Autowired //직접주입
	InterChef aaa; //null 
	
	@Setter(onMethod_ = {@Autowired})
	Restaurant bbb;
	
	//주의> junit을 이용한 클래스 테스일 경우는 생성자 주입이 불가능하다.
	
	@Test
	public void myTest2() {
		//chef1.name="요리사";
		aaa.make(); 
		assertNotNull(aaa); 
	}
	
	@Test
	public void myTest3() {
		assertNotNull(bbb); //bbb객체가 null 이 아닐때 테스트 성공
		assertNotNull(bbb.chef); 
	}
}








