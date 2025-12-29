package com.example.servlet.java.design.patter.creational;

public class BreakSingletoneUsingCloneable {
	public static void main(String args[]) throws CloneNotSupportedException {
		
		
		EgarSingletone sing = EgarSingletone.getInstance();
		EgarSingletone sing2 = (EgarSingletone) sing.clone();
		
		System.out.println(sing == sing2);
	}
}
