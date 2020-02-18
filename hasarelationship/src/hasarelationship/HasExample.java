package hasarelationship;

class Engine
{
	int enginenumber,age;
	String fueltank;
	
	@Override
	public String toString() {
		return "Engine [enginenumber=" + enginenumber + ", age=" + age + ", fueltank=" + fueltank + "]";
	}
	
	public Engine(int enginenumber, int age, String fueltank) {
		super();
		this.enginenumber = enginenumber;
		this.age = age;
		this.fueltank = fueltank;
	}
	
	public int getEnginenumber() {
		return enginenumber;
	}
	public void setEnginenumber(int enginenumber) {
		this.enginenumber = enginenumber;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFueltank() {
		return fueltank;
	}
	public void setFueltank(String fueltank) {
		this.fueltank = fueltank;
	}
	
}



class Car
{
	Engine e;
	int carnumber;
	String model;
	
	
	@Override
	public String toString() {
		return "Car [e=" + e + ", carnumber=" + carnumber + ", model=" + model + "]";
	}
	
	public Car(Engine e, int carnumber,String model )  {
		super();
		this.e = e;
		this.carnumber = carnumber;
		this.model = model;
	}
	
	public Engine getE() {
		return e;
	}
	public void setE(Engine e) {
		this.e = e;
	}
	public int getCarnumber() {
		return carnumber;
	}
	public void setCarnumber(int carnumber) {
		this.carnumber = carnumber;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
}




public class HasExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c=new Car(new Engine(100,100,"sr"),1234,"benz");
		System.out.println(c);

	}

}
