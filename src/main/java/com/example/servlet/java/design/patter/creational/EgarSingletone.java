package com.example.servlet.java.design.patter.creational;

import java.io.Serializable;

public class EgarSingletone implements  Serializable, Cloneable {
	
	private static final EgarSingletone instance = new EgarSingletone();


	
	
	
	private EgarSingletone() {
		
	}
	
	public static EgarSingletone getInstance() {
        return instance;
    }
	
	 @Override
	    protected Object clone() throws CloneNotSupportedException {
	        return super.clone(); //  breaks singleton
	    }
		
	
}
