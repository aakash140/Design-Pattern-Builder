package com.java.builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {

	List<Item> itemList=new ArrayList<Item>();
	
	public void addMeal(Item item){
		itemList.add(item);
	}
	
	public float getCost(){
		float cost=0.0f;
		for(Item item:itemList)
			cost+=item.getPrice();
		return cost;
	}
	
	public void getMealItems(){
		for(Item item:itemList)
			System.out.println("Item: "+item.getName()+
								"  Price: "+ item.getPrice()
								+" Packing Type: "+ item.pack().packType() );
	}
}