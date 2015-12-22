package com.yash.cdi.greeting;

import javax.enterprise.inject.Default;

import com.yash.cdi.greeting.Informal.type;


public class FormalGreeting implements Greeting {

	@Informal(season = type.winter)
	@Override
	public String greeting1(String name) {
		// TODO Auto-generated method stub
		return "Hi, " + name + "!";

	}
}
