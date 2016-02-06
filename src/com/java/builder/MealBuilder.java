package com.java.builder;

public class MealBuilder {

	public Meal orderVegMeal(){
		Meal meal1=new Meal();
		meal1.addMeal(new VegBurger());
		meal1.addMeal(new Pepsi());
		return meal1;
	}
	
	public Meal orderNonVegMeal(){
		Meal meal1=new Meal();
		meal1.addMeal(new ChickenBurger());
		meal1.addMeal(new Coke());
		return meal1;
	}
}