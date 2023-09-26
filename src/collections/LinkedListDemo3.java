package collections;

import java.util.LinkedList;

public class LinkedListDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList l2=new LinkedList();
		l2.add("dog");
		l2.add("dog");
		l2.add("cat");
		l2.add("horse");
		System.out.println(l2);
		/*----------------------------------------------------------------------------*/
		//addFirst()
		l2.addFirst("Tiger");
		System.out.println("After adding addFirst: "+l2);
		/*----------------------------------------------------------------------------*/
		//addLast()
		l2.addLast("Elephant");
		System.out.println("After adding addLast: "+l2);
		/*----------------------------------------------------------------------------*/
		//getFirst()
		System.out.println("Get First: "+l2.getFirst());
		/*----------------------------------------------------------------------------*/
		//getLast()
		System.out.println("Get Last: "+l2.getLast());
		/*----------------------------------------------------------------------------*/
		//removeFirst & removeLast
		l2.removeFirst();
		l2.removeLast();
		System.out.println("After removing first and Last elements from linked List: "+l2);
	}

}
