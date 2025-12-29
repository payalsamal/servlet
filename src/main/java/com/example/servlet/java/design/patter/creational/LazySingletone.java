package com.example.servlet.java.design.patter.creational;

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
