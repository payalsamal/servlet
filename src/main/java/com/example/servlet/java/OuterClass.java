package com.example.servlet.java;

//this is a OuterClass
public class OuterClass {

	private String data;
	private static String data1;

	private final String data2 = "this is outer class final data";

	// this is a StaticInnerClass can only access outer class static member and
	// method
	// outer class object is not required to create its instance
	static class StaticInnerClass {
		private final String data2 = "this is outer class final data";

		public void display() {
			System.out.println("inside staticInnerClass" + data1);
			System.out.println("inside staticInnerClass" + data2);
		}

		public final void finalMethod() {
			System.out.println("inside staticInnerClass finalMethod");
		}

		public static void main(String args[]) {
			OuterClass.StaticInnerClass sob = new OuterClass.StaticInnerClass();
			sob.display();
			sob.finalMethod();

		}

	}

	// this is a InnerClass can access parent class members and
	// method final,static or private
	// but need outer class object to be created first then we can create its own
	// object
	class InnerClass {

		public void display() {
			System.out.println("inside staticInnerClass" + data2);
			System.out.println("inside staticInnerClass" + data1);
			System.out.println("inside staticInnerClass" + data);
		}

		public final void finalMethod() {
			System.out.println("inside staticInnerClass finalMethod");
		}

		public static void main(String args[]) {
			OuterClass ob = new OuterClass();
			OuterClass.InnerClass sob = ob.new InnerClass();
			sob.display();
			sob.finalMethod();

		}

	}

	public void display() {
		System.out.println("inside staticInnerClass");
		// this is a LocalInnerClass inside a method can access parent class members and
		// method final,static or private
		//Can access final or effectively final variables of method.
		String d;
		class LocalInnerClass {

			public void display() {
				System.out.println("inside staticInnerClass" + data2);
				System.out.println("inside staticInnerClass" + data1);
				System.out.println("inside staticInnerClass" + data);
				//System.out.println("inside staticInnerClass" + d);
			}

			public final void finalMethod() {
				System.out.println("insid.e staticInnerClass finalMethod");
			}

		}
	}
}
