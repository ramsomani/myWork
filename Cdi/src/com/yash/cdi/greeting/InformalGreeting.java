package com.yash.cdi.greeting;

import com.yash.cdi.greeting.Informal.type;


public class InformalGreeting implements Greeting {
	@Informal(season = type.summer)
	@Override
	public String greeting1(String name) {
		return "Hello, " + name + "!";

	}
}
