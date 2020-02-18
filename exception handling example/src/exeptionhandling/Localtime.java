package exeptionhandling;

import java.time.LocalDate;
public class Example {
   public static void main(String[] args) {
	/* This is how we can display the current date using now()
	 * method
	 */
	LocalDate currentDate = LocalDate.now();
	System.out.println("Current Date is: "+currentDate);
		
	/* We can convert a date to local date instance by using
	 * of() method of the LocalDate
	 */
	LocalDate pastDate = LocalDate.of(2016, 01, 23);
	System.out.println("Given Date is: "+pastDate);
   }
}