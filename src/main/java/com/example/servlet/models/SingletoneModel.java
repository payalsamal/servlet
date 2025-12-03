package com.example.servlet.models;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class SingletoneModel {

	private final ObjectProvider<PrototypeModel> protoObj;
	@Autowired
	private ApplicationContext context;
	private PrototypeModel protoMode;

	/*
	 * this is called method injection and if we call this method via "this" keyword
	 * it wont work 1. Lookup method can be abstract or return null (here use return
	 * null) 2. This look up method will be overriden by CGLIB(code generation
	 * library) so the parent class cant be final (CGLIB will create subclass of
	 * SingletoneModel and then overide the protoBeanInitia with the bean creation logic.
	 */
	@Lookup
	public PrototypeModel protoBeanInitia()

	{
		// System.out.println("object of the prototype is"+model.hashCode());
		return null;
	}

	// prototype bean injected via ObjectProvider
	public SingletoneModel(ObjectProvider<PrototypeModel> protoObj1) {
		this.protoObj = protoObj1;

	}

	public void show()

	{
		PrototypeModel model = protoBeanInitia();
		System.out.println("1st object of the prototype is " + model.hashCode());
		// return null;
		PrototypeModel model2 = protoObj.getObject();
		System.out.println("2nd object of the prototype is " + model2.hashCode());
		// prototype bean injected via ApplicationContext
		protoMode = (PrototypeModel) context.getBean("prototypeModel");
		System.out.println("3rd object of the prototype is " + protoMode.hashCode());
	}

}
