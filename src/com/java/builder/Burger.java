package com.java.builder;

public abstract class Burger implements Item {

	@Override
	public Package pack() {
		// TODO Auto-generated method stub
		return new Wrapper();
	}
}