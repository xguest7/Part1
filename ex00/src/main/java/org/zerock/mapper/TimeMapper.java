package org.zerock.mapper;

import org.apache.ibatis.annotations.Select;
import org.mit.quiz.StudentVO;

public interface TimeMapper {

		//현재시간을 sql통해서 알아오고 싶다.
		@Select(" select sysdate from dual")
		String getTime();
		
		//xml을 통해서 sql 처리
		String getTime2();
	
		StudentVO aaa(String stu_no);
}
