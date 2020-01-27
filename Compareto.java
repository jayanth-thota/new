package emp;

import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee>{
	
	public int eid;
	public String ename;
	public int esalary;
	public Employee(int eid,String ename,int esalary)
	{
		this.eid=eid;
		this.ename=ename;
		this.esalary=esalary;
		
	}
	public int compareTo(Employee e)
	{
		//return ename.compareTo(e.ename);//for string
		return this.eid-e.eid;//for int
	}
	
}
public class Compareto {
	public static void main(String[] args)
	{
		ArrayList<Employee> a1=new ArrayList<Employee>();
		a1.add(new Employee(1, "jay", 01));
		a1.add(new Employee(2, "ram", 02));
		a1.add(new Employee(3, "sam", 32));
		
		Collections.sort(a1);
		for (Employee s:a1)
		{
			System.out.println(s.eid);
		}
		
		
	}

}
