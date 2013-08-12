package com.liqing;

/**
 * User: LiQing Date: 8/12/13 Time: 10:15 PM
 */
public class Person
{

	private String name;
	private Dog dog;

	public Person(final String name)
	{
		this.name = name;
		dog = new Dog();
	}

	public String getName()
	{
		return name;
	}

	public String playDog()
	{
		return dog.bark(name);
	}
}
