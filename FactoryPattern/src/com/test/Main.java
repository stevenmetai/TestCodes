package com.test;

public class Main {

	public static void main(String[] s)
	{
		PizzaStore nyStore = new NYStylePizzaStore();
		
		Pizza pizza = nyStore.orderPizza("cheese");
		
		System.out.println(""+pizza.getName());
		
	}
}
