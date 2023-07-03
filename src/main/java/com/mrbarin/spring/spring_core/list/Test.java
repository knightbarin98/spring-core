package com.mrbarin.spring.spring_core.list;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/mrbarin/spring/spring_core/list/listconfig.xml");
		Hospital hospital = (Hospital) ctx.getBean("hospital");
		System.out.println(hospital.getName());
		System.out.println(hospital.getDepartments());
	}

}
