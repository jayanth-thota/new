class StaticBlock
{
  static int a;
  static
  {
   a=10;
   System.out.println(" "+a);
  }
  static void setA(int a)
{
   a=56;
  System.out.println("static method is going to call"+a);
}
public static void main(String ar[])
{ 
 //StaticBlock b=new StaticBlock(); 
 System.out.println("MAIN METHOD IS CALLING");
 setA(10);
}
}