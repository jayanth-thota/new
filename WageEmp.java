package emp;

public class WageEmp extends Emp{
	int hours,numbers;
	@Override
	public String toString() {
		return "WageEmp [hours=" + hours + ", numbers=" + numbers + ", address=" + address + ", empId=" + empId
				+ ", empsalary=" + empsalary + ", empName=" + empName + ", empLocation=" + empLocation + "]";
	}




	Address address;
	public WageEmp(int empId, int empsalary, String empName, String empLocation, int hours,
			int numbers, Address address) {
		super(empId, empsalary, empName, empLocation, address);
		this.hours = hours;
		this.numbers = numbers;
	}


	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public int getNumbers() {
		return numbers;
	}

	public void setNumbers(int numbers) {
		this.numbers = numbers;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}


	

	int calculateSalary()
	{
		return empsalary*hours*numbers;
	}
	
	
	

}
