package emp;

public class Emp  {
	int empId,empsalary;
	String empName,empLocation;
	public Emp(int empId, int empsalary, String empName, String empLocation, Address address) {
		super();
		this.empId = empId;
		this.empsalary = empsalary;
		this.empName = empName;
		this.empLocation = empLocation;
		this.address = address;
	}
	
	Address address;
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empsalary=" + empsalary + ", empName=" + empName + ", empLocation="
				+ empLocation + ", address=" + address + "]";
	}
	
	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public int getEmpsalary() {
		return empsalary;
	}
	public void setEmpsalary(int empsalary) {
		this.empsalary = empsalary;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpLocation() {
		return empLocation;
	}
	public void setEmpLocation(String empLocation) {
		this.empLocation = empLocation;
	}
	

}
