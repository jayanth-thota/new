package exeptionhandling;
import java.util.*;

public class Collectionexample {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractList<String> e=new ArrayList<String>();
		e.add("a");
		e.add("d");
		System.out.println(e);
		
		
		
		ArrayList<String> e1=new ArrayList<String>();
		e1.add("c");
		e1.add("d");
		System.out.println(e1);
		e.addAll(e1);
		System.out.println(e);
		e.removeAll(e1);
		System.out.println(e);
		e.remove("a");
		System.out.println(e);
		System.out.println(e.retainAll(e));
		
		
		
		
		

	}

}
