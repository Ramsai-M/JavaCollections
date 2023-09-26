package collections;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList l1=new LinkedList();
		l1.add('X');
		l1.add('Y');
		l1.add('Z');
		l1.add('A');
		l1.add('B');
		l1.add('C');
		/*----------------------------------------------------------------------------*/
		//addAll
		LinkedList dup_l1=new LinkedList();
		dup_l1.addAll(l1);
		System.out.println("Added elements using addAll: "+dup_l1);
		/*----------------------------------------------------------------------------*/
		//removeAll
		dup_l1.removeAll(l1);
		System.out.println("Removed element using removeAll: "+dup_l1);
		//isEmpty
		System.out.println("Is this LinkedList is null: "+dup_l1.isEmpty());//true
		/*----------------------------------------------------------------------------*/
		//Sorting
		System.out.println("Before Sorting: "+l1);
		Collections.sort(l1);
		System.out.println("After Sorting:  "+l1);
		/*----------------------------------------------------------------------------*/
		//reverse order
		Collections.sort(l1,Collections.reverseOrder());
		System.out.println("Reverse Order:  "+l1);
		/*----------------------------------------------------------------------------*/
		//Shuffling
		Collections.shuffle(l1);
		System.out.println("Shuffling Linked List: "+l1);
		
	}

}
