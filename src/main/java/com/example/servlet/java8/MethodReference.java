package com.example.servlet.java8;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Lazy;

@ConditionalOnBean
@Lazy
public class MethodReference {

	public void display() {
		System.out.println("inside method reference display method");
	}

	public static void main(String[] args) {

		//MethodReference ob = MethodReference::new;

	}

}
