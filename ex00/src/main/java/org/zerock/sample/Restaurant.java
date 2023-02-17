package org.zerock.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Setter;

@Component
@AllArgsConstructor
public class Restaurant {
	
	Chef chef;
	
	/* 필드주입
	@Autowired		
	Chef chef;	*/

	/* 수정자 주입
	Chef chef;
	
	@Autowired
	public void setChef(Chef chef) {
		this.chef = chef;
	}	*/
	
	/* 롬복이용한 수정자 주입법
	@Setter(onMethod_ = {@Autowired})
	Chef chef; */
	
	/* 생성자 주입 -스프링4.3 이상부터는 생성자 주입일경우 @Autowired가 생략이가능
	 * 단 생성자가 유일하게 존재해야함. 
	Chef chef; 
	
	//@Autowired
	public Restaurant(Chef chef) {
		this.chef = chef;
	}  */
	
	/* 롬복에서 생성자를 만들도록 하면 자동으로 주입가능 */
	
	
	
	
	
}
