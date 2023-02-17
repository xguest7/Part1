package org.zerock.sample2;

import org.springframework.stereotype.Component;
import org.zerock.sample.InterChef;

import lombok.extern.log4j.Log4j;

@Component
@Log4j
public class Chef2 implements InterChef {

	String name;
	@Override
	public void make() {
		log.warn("나는 주문중... ");

	}

}
