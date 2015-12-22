package com.connection;

public interface Connection {
	abstract void connect();
	abstract void disconnect();
	abstract void use();
}
