/*
src
org.mit.quiz 패키지를 만들고
Quiz1클래스를 생성한다.
이클래스는 하나의 메소드가 있으면
이메소드는 두개의 정수를 받아서 모두 더해서 돌려주는메소드
public int allSum(int , int) 
--------------------------------------------
Quiz1클래스 만든메소드를 테스트하기 위해서
test에서 진행할것 (단, Quiz1을 직접 객체를 생성하지 말고
의존성 주입을 이용해서 작업할것)
*/

package org.mit.quiz;

import org.springframework.stereotype.Component;

@Component
public class Quiz1 {
	public int allSum(int num1, int num2) {
		return 55;
	}
}
