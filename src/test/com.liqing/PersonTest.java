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

	@Before
	public void setUp()
	{
		person = new Person("monster");
	}

	@Test
	public void shouldReturnName()
	{
		String name = person.getName();
		assertThat(name, is("monster"));
	}
}
