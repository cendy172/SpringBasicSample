package com.liqing;

/**
 * User: LiQing Date: 8/12/13 Time: 10:15 PM
 */
public class Person
{
	private String name;
	private Dog dog;

	public Person()
	{
		this.name = "";
		this.dog = null;
	}

	public Person(String name, Dog dog)
	{
		this.name = name;
		this.dog = dog;
	}

	public void setDog(Dog dog)
	{
		this.dog = dog;
	}

	public void setName(final String name)
	{
		this.name = name;
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
