package com.example.servlet.java.design.patter.creational;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class BreakSingletoneUsingReflection {

	
	public static void main(String args[]) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		// Normal singleton instance
		EgarSingletone ob1 = EgarSingletone.getInstance();

        // Reflection
        Constructor<EgarSingletone> constructor =
        		EgarSingletone.class.getDeclaredConstructor();

        constructor.setAccessible(true);

        EgarSingletone ob2 = constructor.newInstance();
        System.out.println(ob1==ob2);

	}
}
