package com.example.servlet.java.design.patter;

public class EgarSingletone {
	
	private static final EgarSingletone instance = new EgarSingletone();


	
	
	
	private EgarSingletone() {
		
	}
	
	public static EgarSingletone getInstance() {
        return instance;
    }
	
	
		
	
}
