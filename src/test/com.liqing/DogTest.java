package com.liqing;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * User: LiQing Date: 8/12/13 Time: 10:11 PM
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:dog-bean.xml"})
public class DogTest
{
    @Autowired
	private Dog dog;

	@Before
	public void setUp()
	{
	}

	@Test
	public void shouldReturnVoiceWhenBark()
	{
		assertThat(dog.bark(""), is("wang wang "));
	}

	@Test
	public void shouldReturnVoiceWithNameWhenBark()
	{
		assertThat(dog.bark("monster"), is("wang wang monster"));
	}
}
