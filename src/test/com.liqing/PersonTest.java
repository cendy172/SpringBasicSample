package com.liqing;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

/**
 * User: LiQing Date: 8/12/13 Time: 10:15 PM
 */
public class PersonTest
{

	private Person person;
	private Dog dog;

	@Before
	public void setUp()
	{
		dog = new Dog();
		person = new Person("monster", dog);
	}

	@Test
	public void shouldReturnName()
	{
		assertThat(person.getName(), is("monster"));
	}

	@Test
	public void shouldReturnVoiceWhenPlayDog()
	{
		assertThat(person.playDog(), is("wang wang monster"));
	}
}
