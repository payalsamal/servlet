package com.example.servlet.java;

public class StaticDynamicBinding {

	public static void main(String args[]) {

		ParentClass ob1 = new ParentClass();
		ParentClass ob2 = new ChildClass();
		// static binding (which method to call is decided by compiler based on the
		// reference type rather than the actual type ex:- ob2 is a reference type of
		// ParentClass but actual type is ChildClass
		// The method call is resolved at compile time
		/**
		 * It happens when:
		 * 
		 * ✅ 1. Method is private ✅ 2. Method is static ✅ 3. Method is final
		 * if parent method can't be overriden the its static binding
		 */
		ob1.staticDisplay();
		ob2.staticDisplay();
		
		//this is dynamic binding, method call is resolved by actual object type during run time (after memory allocation)
		
		ob1.display();
		ob2.display();

	}
}
