package com.example.servlet.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DependencyInjectionType {

	
	// field injection
		@Autowired
		SingletoneModel model;

		// Constructor injection
		// its final because modelConstuctor bean is mandatory to inject(final need be
		// initialize ) ensures immutability and thread safe
		private final SingletoneModel modelConstuctor;

		// Constructor injection
		private SingletoneModel modelSetter;

		

		DependencyInjectionType(SingletoneModel modelConstuctor) {
			this.modelConstuctor = modelConstuctor;
		}

		//setter injection is used when the bean in not optional to inject
		@Autowired
		public void setModelSetter(SingletoneModel modelSet) {
			this.modelSetter = modelSet;
		}
}
