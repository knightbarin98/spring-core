package com.mrbarin.spring.spring_core.properties;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/mrbarin/spring/spring_core/properties/propertiesconfig.xml");
		CountryAndLanguage cnl = (CountryAndLanguage) ctx.getBean("countriesAndLangs");
		System.out.println(cnl);
	}

}
