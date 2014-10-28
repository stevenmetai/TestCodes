package com.test;

import java.util.ArrayList;

public abstract class Pizza
{
	
	String name;
	String dough;
	String sauce;
	ArrayList<String> toppings = new ArrayList<String>();
	
	public void prepare()
	{
		System.out.print("Prepare pizza\n");
	}
	
	public void bake()
	{
		System.out.print("Bake pizza");
	}
	
	public String getName()
	{
		return name;
	}
	
}
