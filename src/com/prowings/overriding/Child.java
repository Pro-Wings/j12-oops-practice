package com.prowings.overriding;

import java.io.IOException;
import java.sql.SQLException;

public class Child extends Parent{
	
	
	public void m1() //throws Exception
	{
		System.out.println("inside Child's - m1()");

	}

}
