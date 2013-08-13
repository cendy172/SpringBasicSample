package com.liqing;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * User: LiQing Date: 8/12/13 Time: 10:15 PM
 */
public class PersonTest
{
	private Person person;
	private Dog dog;
	private final String DOG_ID = "dog";
	private final String PERSON_ID = "person";

	@Test
	public void shouldReturnNameWhenInjectByType0()
	{
		dog = new Dog();
		person = new Person("monster", dog);
		shouldReturnName();
		shouldReturnVoiceWhenPlayDog();
	}

	@Test
	public void shouldReturnVoiceWhenInjectByType2()
	{
		String beansConfig = "/src/main/webapp/WEB-INF/applicationContext.xml";
		injectBySpring(beansConfig, DOG_ID, PERSON_ID);
		shouldReturnName();
		shouldReturnVoiceWhenPlayDog();
	}

	@Test
	public void shouldReturnVoiceWhenInjectByType3()
	{
		injectBySpring("/src/main/webapp/WEB-INF/applicationContextType3.xml", DOG_ID, PERSON_ID);
		shouldReturnName();
		shouldReturnVoiceWhenPlayDog();
	}

	private void injectBySpring(String beansConfig, String DOG_ID, String PERSON_ID)
	{
		ApplicationContext applicationContext = new FileSystemXmlApplicationContext(beansConfig);
		dog = (Dog) applicationContext.getBean(DOG_ID);
		person = (Person) applicationContext.getBean(PERSON_ID);
	}

	private void shouldReturnName()
	{
		assertThat(person.getName(), is("monster"));
	}

	private void shouldReturnVoiceWhenPlayDog()
	{
		assertThat(person.playDog(), is("wang wang monster"));
	}
}
