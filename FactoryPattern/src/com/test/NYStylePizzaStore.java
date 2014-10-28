package com.test;


public class NYStylePizzaStore extends PizzaStore
{

	public NYStylePizzaStore() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	Pizza createPizza(String type)
    {
		Pizza pizza = null;
		
		if(type.equals("cheese"))
		{
			pizza = new NYStyleCheesePizza();
		}
		return pizza;
	}

}
