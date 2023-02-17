package org.zerock.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.mit.quiz.EMPVO;
import org.mit.quiz.StudentVO;

public interface TimeMapper {

		//현재시간을 sql통해서 알아오고 싶다.
		@Select(" select sysdate from dual")
		String getTime();
		
		//xml을 통해서 sql 처리
		String getTime2();
	
		StudentVO aaa(String stu_no);
		
		List<StudentVO> aaalist();
		
		//스캇의 사원번호 넣어주면 emp 찾기
		EMPVO bbb(String num);
		
		//스캇의 사원목록 가져오기
		List<EMPVO> list();
		
}






