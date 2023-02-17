package org.zerock.persistence;

import static org.junit.Assert.fail;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@Log4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class DataSourceTests {
	
	@Autowired
	DataSource dataSource; 
	//인터페스를 구현 클래스가 스프링에서 인식되고 있다면 자동주입이 가능
	
	@Test
	public void testConnection() {
		try {
			dataSource.getConnection();
			log.info("커넥션 작업 성공");
		} catch (SQLException e) {
			e.printStackTrace();
			log.error("커넥션 작업 실패");
			fail();
		}
	}
	
}
