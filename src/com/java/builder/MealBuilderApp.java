package com.java.builder;

public class MealBuilderApp {

	public static void main(String[] args){
		MealBuilder mealBuilder=new MealBuilder();
		Meal meal1=mealBuilder.orderNonVegMeal();
		System.out.println("Non-Veg Meal Details:");
		meal1.getMealItems();
		System.out.println("Your Bill:"+meal1.getCost());
	}
}