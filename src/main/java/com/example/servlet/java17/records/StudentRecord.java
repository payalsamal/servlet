package com.example.servlet.java17.records;

//record can implement but cant extend
//gives auto generated hashCode and equal method with constructor
public record StudentRecord(int studentId,String name,String phoneNo) implements TestIntfer{

	//custom cannonical constructor
	public  StudentRecord(int studentId,String name,String phoneNo){
		this.name = "";
		this.phoneNo = "";
		this.studentId = 0;
	}
	
}
