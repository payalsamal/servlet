package com.example.servlet.java17.records;

public record UserRecord(String name, int age) {
	/**
	 * A compact constructor:
	 * 
	 * Has no parameter list
	 * 
	 * Java auto-assigns fields
	 * 
	 * Used mainly for validation
	 * 
	 */

	public UserRecord {
		if (age < 0) {
			throw new IllegalArgumentException("Age cannot be negative");
		}

	}
//	final class Person extends java.lang.Record {
//	    private final String name;
//	    private final int age;
//
//	    public Person(String name, int age) { ... }
//	    public String name() { return name; }
//	    public int age() { return age; }
//
//	    public boolean equals(Object o) { ... }
//	    public int hashCode() { ... }
//	    public String toString() { ... }
//	}

}
