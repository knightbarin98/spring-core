package com.mrbarin.spring.spring_core.set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/mrbarin/spring/spring_core/set/setconfig.xml");
		CarDealer cardealer = (CarDealer) ctx.getBean("cardealer");
		System.out.println(cardealer.getName());
		System.out.println(cardealer.getModels());
	}

}
