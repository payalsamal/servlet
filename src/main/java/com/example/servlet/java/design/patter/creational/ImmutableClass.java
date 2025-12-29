package com.example.servlet.java.design.patter.creational;

import java.util.ArrayList;
import java.util.List;

public final class ImmutableClass {

	private final String data ;
	private final List<String> list ;
	
	public ImmutableClass(String data1,List<String> list1 ) {
		this.data = data1;
		this.list = List.copyOf(list1);
	}
	
	String getData(){
		return this.data;
	}
	List<String> getList(){
		return this.list;
	}
	
	public static void main(String args[]) {
		
		
		ImmutableClass obj = new ImmutableClass(" data ", new ArrayList<>());
		obj.getData().trim();
		obj.getList().add("data");
		System.out.println(obj.data);
		System.out.println(obj.getList().get(0));
	}
	
}
