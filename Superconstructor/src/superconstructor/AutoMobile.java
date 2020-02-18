package superconstructor;

class Car

{
	int carNo;
	int run()
	{
		return 60;
	}
	
}
class FordCar extends Car
{
	int run()
	{
		return super.run()+40;
	}
	
}





public class AutoMobile {
	public static void main(String[] args)
	{
		FordCar f=new FordCar();
		f.run();
	}

}
