package com.test;

public abstract class PizzaStore
{

	SimplePizzaFactory factory;
	
	public PizzaStore()
	{
		
	}
	
	final Pizza orderPizza(String type)
	{
		Pizza pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		return pizza;
	}
	
	abstract Pizza createPizza(String type);


}
