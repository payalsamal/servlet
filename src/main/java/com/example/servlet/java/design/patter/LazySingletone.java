package com.example.servlet.java.design.patter;

public class LazySingletone {

	private static LazySingletone instance;

	private LazySingletone() {

	}

	public static LazySingletone getInstance() {
		if (instance == null) {
			instance = new LazySingletone();
		}
		return instance;
	}

}
