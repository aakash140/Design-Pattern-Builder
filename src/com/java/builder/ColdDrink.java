package com.java.builder;

public abstract class ColdDrink implements Item {

	@Override
	public Package pack() {
		// TODO Auto-generated method stub
		return new Bottle();
	}
}