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
class Main
{
    public static void main(String args[])
   {
      Emp e=new Emp(1,'j',1);
      //e.setEmp(7,"jayanth",10);
      e.getEmp();
    }
}
  

}


