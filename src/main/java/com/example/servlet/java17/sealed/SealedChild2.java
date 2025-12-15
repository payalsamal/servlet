package com.example.servlet.java17.sealed;

public final class SealedChild2 extends SealedChild {

	int data;

	@Override
	public void parentDisplay() {

	}

	SealedChild2(int d) {
		data = d;
	}
}
