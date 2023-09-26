package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declare LinkedList
		//LinkedList l=new LinkedList();
		//LinkedList<String> l1=new LinkedList<String>();
		//LinkedList<Integer> l2=new LinkedList<Integer>();
		
		LinkedList l=new LinkedList();
		
		//add new elements into linkedlist
		l.add(100);
		l.add("Welcome");
		l.add(15.5);
		l.add('A');
		l.add(true);
		l.add(null);
		System.out.println(l);
		System.out.println("Size of this linkedlist is: "+l.size());
	   /*----------------------------------------------------------------------------*/
		//removing
		l.remove(3);
		//l.remove((Integer)100);
		//l.remove((Character)'A');
		//l.remove(15.5);
		//l.remove("Welcome");
		//l.remove((boolean)true);
		System.out.println("After removing: "+l);
		
		/*----------------------------------------------------------------------------*/
		//inserting/adding an element middle of the linkedlist
		l.add(3,"Java");
		System.out.println("After adding: "+l);
		
		/*----------------------------------------------------------------------------*/
		//retriving the value/object
		System.out.println(l.get(3));
		/*----------------------------------------------------------------------------*/
		//Update the value
		l.set(5, "X");
		System.out.println("Updated Linked list is: "+l);
		/*----------------------------------------------------------------------------*/
		//Contains
		System.out.println(l.contains("Java"));//true
		System.out.println(l.contains("Python"));//false
		/*----------------------------------------------------------------------------*/
		//isEmpty
		System.out.println(l.isEmpty());//false
		/*----------------------------------------------------------------------------*/
		//Reading elements using for loop
		System.out.println("Using For Loop: ");
		for(int i=0;i<l.size();i++) {
			System.out.print(l.get(i)+" ");
		}
		/*----------------------------------------------------------------------------*/
		//Reading elements using for each loop
		System.out.println("\nUsing For Each Loop: ");
		for(Object e:l) {
			System.out.print(e+" ");
		}
		/*----------------------------------------------------------------------------*/
		//Reading elements using iterator method
		System.out.println("\nUsing Iterator method: ");
		Iterator it=l.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		
	}

}
