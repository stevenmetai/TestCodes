package com.test;

public class SimplePizzaFactory {

	public Pizza createPizza(String type)
	{
		Pizza pizza = null;
		if(type.equals("Cheese"))
		{
			pizza = new CheesePizza();
		}
		return pizza;
	}
}
