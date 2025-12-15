package com.example.servlet.java.design.patter;

public class ThreadSafeSingletone {

	private static ThreadSafeSingletone instance;

	public synchronized ThreadSafeSingletone getInstace() {
		if (instance == null) {
			instance = new ThreadSafeSingletone();
		}
		return instance;
	}
}
