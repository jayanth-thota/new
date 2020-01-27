package exeptionhandling;
class InvalidException extends Exception
{
	InvalidException(String s)
	{
		super(s);
	}
}

class Test{
	static void validate(int n)throws InvalidException
	{
		if(n<18)
		{
			throw new InvalidException("not valid");
			
				
		}
		else
			System.out.println("valid");
	}



	public static void main(String args[])
	{
	try
	{
		validate(1);
	}catch(Exception m)
	{
		System.out.println("error occured");
	}


}
}
