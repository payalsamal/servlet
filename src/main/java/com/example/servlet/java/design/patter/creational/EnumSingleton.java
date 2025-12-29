package com.example.servlet.java.design.patter.creational;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import javax.sql.DataSource;
/**
 * Enum singlton can't be break
 * @author payals
 *
 */
public enum EnumSingleton {

	INSTANCE ;
	
	 private final DataSource dataSource;

	    // Enum constructor (called once by JVM)
	 EnumSingleton() {
	        BasicDataSource ds = new BasicDataSource();
	        ds.setUrl("jdbc:mysql://localhost:3306/testdb");
	        ds.setUsername("root");
	        ds.setPassword("password");
	        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");

	        ds.setInitialSize(5);
	        ds.setMaxTotal(20);

	        this.dataSource = ds;
	    }

	    public DataSource getDataSource() {
	        return dataSource;
	    }

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		EnumSingleton ob = EnumSingleton.INSTANCE;

		Constructor<EnumSingleton> conster = EnumSingleton.class.getDeclaredConstructor(String.class, int.class);
		conster.setAccessible(true);
		EnumSingleton ob2 = conster.newInstance(INSTANCE); // throw new IllegalArgumentException("Cannot reflectively
															// create enum objects");
		System.out.println(ob == ob2);
	}

}
