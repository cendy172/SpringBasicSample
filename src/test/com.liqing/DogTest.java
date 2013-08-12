package com.liqing;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

/**
 * User: LiQing Date: 8/12/13 Time: 10:11 PM
 */
public class DogTest
{

	private Dog dog;

	@Before
	public void setUp()
	{
		dog = new Dog();
	}

	@Test
	public void shouldReturnVoiceWhenBark()
	{
		assertThat(dog.bark(""), is("wang wang"));
	}

	@Test
	public void shouldReturnVoiceWithNameWhenBark()
	{
		assertThat(dog.bark("monster"), is("wang wang monster"));

	}
}
