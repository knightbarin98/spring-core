package com.mrbarin.spring.spring_core.ref_types;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/mrbarin/spring/spring_core/ref_types/reftypesconfig.xml");
		Student student = (Student) ctx.getBean("students");
		System.out.println(student);
	}

}
