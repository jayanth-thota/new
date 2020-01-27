//static method

  class StaticMethodExample
  {
     static int num;  //static variable
     int a; //non static variable and instance variable
     static void setStatic(int a)

   {
   num=a;

   System.out.println(num);
}
 void setB()
{  
System.out.println(num);

}
public static void main(String ar[])
{
 setStatic(10);
 StaticMethodExample c=new StaticMethodExample();
  c.setB();
}
}
