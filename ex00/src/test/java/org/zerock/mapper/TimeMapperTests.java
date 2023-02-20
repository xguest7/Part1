package org.zerock.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mit.quiz.EMPVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import lombok.extern.log4j.Log4j;

@Log4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class TimeMapperTests {
	
	@Autowired
	TimeMapper timeMapper;
	
	@Test
	public void testGetTime() {
		log.info("sql결과값"+timeMapper.getTime());
	}
	
	
	@Test
	public void testGetTime2() {
		log.info("sql결과값"+timeMapper.getTime2());
	}

	@Test
	public void testAaa() {
		log.info(timeMapper.aaa("20153075 "));
	}
	
	@Test
	public void testBbb() {
		log.info("결과값"+timeMapper.bbb("7369"));
	}
	
	@Test
	public void testList() {
		List<EMPVO> list =timeMapper.list();
		for(EMPVO vo :list) {
			log.info(vo);
		}
	}
	
	@Test
	public void testAaaList() {
		log.info(timeMapper.aaalist());
		
	}
	
}









