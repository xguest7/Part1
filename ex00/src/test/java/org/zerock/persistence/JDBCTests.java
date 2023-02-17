package org.zerock.persistence;

import static org.junit.Assert.fail;

import java.sql.DriverManager;

import org.junit.Test;

import lombok.extern.log4j.Log4j;

@Log4j
public class JDBCTests {
	
	@Test
	public void testConnection(){
		try {
			//1.드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2.연결해서 커넥션 객체를 가지고 이후 작업직행
			DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", 
					"book_ex", "book_ex");
			log.info("DB연결 성공");
		} catch (Exception e) {
			e.printStackTrace();
			log.error("DB연결 실패");
			fail(); //무조건 junit 테스트 실패 (이후코드는 실행 안됨)
		}
		
	}
}
