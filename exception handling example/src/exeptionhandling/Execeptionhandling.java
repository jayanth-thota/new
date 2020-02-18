package exeptionhandling;

import java.io.IOException;

public class Execeptionhandling {
	public static void main(String args[])
	{
		int a=5,b=0;
		try
		
		{
			
		
		System.out.println(a/b);//unchecked exception
		
		
		
		
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("always execute");
		}
		System.out.println("my prgm is executed");
	}

}
