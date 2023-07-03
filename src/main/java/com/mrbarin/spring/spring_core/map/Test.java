package com.mrbarin.spring.spring_core.map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/mrbarin/spring/spring_core/map/mapconfig.xml");
		Customer customer = (Customer) ctx.getBean("customer");
		System.out.println(customer.getName());
		System.out.println(customer.getProducts());
		System.out.println(customer.getProducts().getClass().getName());
		System.out.println(customer);
	}

}
