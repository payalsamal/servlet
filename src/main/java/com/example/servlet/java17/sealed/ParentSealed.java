package com.example.servlet.java17.sealed;

public sealed class  ParentSealed permits FinalSealed, SealedChild,NonSealedChild {

	public void parentDisplay() {
		
	}
}
