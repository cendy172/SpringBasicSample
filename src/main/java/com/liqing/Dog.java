package com.liqing;

import org.springframework.stereotype.Component;

/**
 * User: LiQing Date: 8/12/13 Time: 10:09 PM
 */
@Component
public class Dog
{

	public String bark(String name)
	{
		return new StringBuffer().append("wang wang ").append(name).toString();
	}
}
