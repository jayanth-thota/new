import java.util.Scanner;
class Leapyr
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int i=s.nextInt();
if((i % 4==0  ||  i % 400==0)  && (i % 100!=0))
{
System.out.println("leapyr");
}
else
{
System.out.println("nonleapyr");
}
}
}
