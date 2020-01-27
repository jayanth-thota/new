class B
{
 static int count=0;
 B()
 {
  count++;
 }
 public static void main(String args[])
{
 B b=new B();
 B b1=new B();
 System.out.println(count);
}
}