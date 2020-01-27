class Emp
{
     int empId;
     String empName;
     int empSal;


public Emp()
{
  int empID=1;
  String empName="0";
  int empSal=1;
}
     
  



      
void setEmp(int id,String name,int salary)  
{  
      empId=id;
      empName=name;
      empSal=salary;
}
void getEmp()
{
     System.out.println(""+empID+""+empName+""+empSal);
}

}


