package collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue pq=new PriorityQueue();
		/*----------------------------------------------------------------------------*/
		//Adding Elements using add() and offer() methods
		pq.add('A');
		pq.add('B');
		pq.add('C');
		pq.offer('C');
		System.out.println(pq); //[A, B, C, C] --> Allow duplicates and order is preserved
		/*----------------------------------------------------------------------------*/
		//get head element using element() and peak() methods
		System.out.println(pq.element());//A -- Return Head element, if it is empty means returns NoSuchElementException
		System.out.println(pq.peek());//A -- Return Head element, if it is empty means return null
		
		/*----------------------------------------------------------------------------*/
		//Return and remove the element remove() and poll() methods
		//System.out.println(pq.remove()); //A, if it is empty means returns NoSuchElementException
		//System.out.println(pq);//[B, C, C]
		//System.out.println(pq.poll()); //A, if it is empty means return null
		//System.out.println(pq); //[B, C, C]
		/*----------------------------------------------------------------------------*/
		//Print the elements using Iterator
		Iterator it=pq.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" "); // A B C C
		}
		System.out.println(" ");
		/*----------------------------------------------------------------------------*/
		//Print using for each loop
		for(Object e: pq) {
			System.out.print(e+" "); //A B C C 
		}
		/*----------------------------------------------------------------------------*/
		
	}

}
