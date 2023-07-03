package com.mrbarin.spring.spring_core.properties;

import java.util.Properties;

public class CountryAndLanguage {
	private Properties countryAndLangs;

	public Properties getCountryAndLangs() {
		return countryAndLangs;
	}

	public void setCountryAndLangs(Properties contryAndLangs) {
		this.countryAndLangs = contryAndLangs;
	}

	@Override
	public String toString() {
		return "CountryAndLanguage [contryAndLangs=" + countryAndLangs + "]";
	}

}
