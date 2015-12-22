package com.user;

import java.io.Console;

public class GettingPassword {
	public String gettingpassword() {
		Console console = System.console();
		/*
		 * if (console == null) {
		 * System.out.println("Couldn't get Console instance"); System.exit(0);
		 * }
		 */
		char passwordArray[] = console.readPassword("Enter your password: ");

		return new String(passwordArray);

	}
}
