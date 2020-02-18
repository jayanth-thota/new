package exeptionhandling;

public class Variableexample {
	
	static void add(int... values)
	{
		int sum=0;
		System.out.println("add method");
		for(int s:values)
		{
			sum=sum+s;
		}
			System.out.println(sum);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(1,2);

	}

}
