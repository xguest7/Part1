package org.zerock.sample;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.extern.log4j.Log4j;

@Component //스프링이 관리할 객체임을 알려줌 - scan도 되고 있어야한다.
@Data //데이터 클래스로 사용하기위한 메소드들을 만들어준다.
@Log4j
public class Chef implements InterChef{
	String name;

	@Override
	public void make() {
		log.warn("나는 볶는중...");
		
	}

}
