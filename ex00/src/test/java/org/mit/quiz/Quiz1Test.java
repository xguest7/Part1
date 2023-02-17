package org.mit.quiz;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@Log4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class Quiz1Test {
	@Autowired
	Quiz1 aaa;
	
	@Test
	public void gogogo() {
		log.info("출력값"+aaa.allSum(1, 10));
		assertEquals(55, aaa.allSum(1, 10));
	}
}
