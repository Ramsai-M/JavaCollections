package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declare ArrayList
		//ArrayList al=new ArrayList();
		//ArrayList<Integer> a2=new ArrayList<Integer>();
		//ArrayList<String> a3=new ArrayList<String>();
		//List a4=new ArrayList();
		ArrayList al=new ArrayList();
		al.add(200);
		al.add("Welcome");
		al.add(15.5);
		al.add('A');
		al.add(true);
		
		System.out.println(al);
		
		//Size
		System.out.println("Number of elements in array list is: "+al.size());
		
		/*----------------------------------------------------------------------------*/
		//remove
		ArrayList al1=new ArrayList();
		al1.add(1);
		al1.add(2);
		al1.add(3);
		al1.add(4);
		al1.add(5);
		al1.add(3);
		al1.add(3);
		System.out.println(al1);
		al1.remove(3);//it will remove value 4
		System.out.println(al1);
		al1.remove((Integer)3);// it will remove value 3 that is after 2
		System.out.println(al1);
		al1.removeIf(((Integer)3)::equals);//it will remove all the values is equal to 3
		System.out.println(al1);
		System.out.println("Number of elements in array list is: "+al.size());
		
		/*----------------------------------------------------------------------------*/
		al.remove(1);
		//al.remove("Welcome"); -- Anything can either we can pass index or object directly
		System.out.println("Number of elements in arrayList is: "+al.size());
		/*----------------------------------------------------------------------------*/
		
		//insert a new element
		//add(index, object)
		al.add(2,"Java");
		System.out.println("After insertion: "+al);
		
		/*----------------------------------------------------------------------------*/
		//retrive specific element
		System.out.println(al.get(2));
		
		/*----------------------------------------------------------------------------*/
		//change element/replace
		al.set(2, "Python");
		System.out.println("Updated Array List: "+al);
		
		/*----------------------------------------------------------------------------*/
		//Search Contains
		System.out.println(al.contains("Python"));//true
		System.out.println(al.contains("Java"));//false
		
		/*----------------------------------------------------------------------------*/
		//isEmpty
		System.out.println(al.isEmpty());//false
		
		/*----------------------------------------------------------------------------*/
		//for loop
		System.out.println("Reading elements using for loop: ");
		for(int i=0;i<al.size();i++) {
			System.out.print(al.get(i)+" ");
		}
		
		/*----------------------------------------------------------------------------*/
		//For Each Loop
		System.out.println("\nReading elements using for each loop: ");
		for(Object j:al) {
			System.out.print(j+" ");
		}
		/*----------------------------------------------------------------------------*/
		//iterator
		System.out.println("\nReading elements using Iterator: ");
		Iterator it =al.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		
		
	}

}
