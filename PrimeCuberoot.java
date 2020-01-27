import java.util.Scanner;
class PrimeCuberoot
{
   public static void main (String[] args)
   {		
       int i =0;
       int num =0;
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       //Empty String
       String  primeNumbers = "";
       String  cuberoot = "";


       for (i = 1; i <= n; i++)         
       { 		  	  
          int counter=0; 	  
          for(num =i; num>=1; num--)
	  {
             if(i%num==0)
	     {
 		counter = counter + 1;
                
	     }
	  }
	  if (counter ==2)
	  {
	     //Appended the Prime number to the String
	     primeNumbers = primeNumbers + i + " ";
             cuberoot= cuberoot+i*i*i+"   ";
	  }	
       }	
       System.out.println("Prime numbers from 1 to n are :");
       System.out.println(primeNumbers);
       System.out.println("cube root from 1 to n in prime");
       System.out.println(cuberoot);
   }
}


