package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al=new ArrayList();
		al.add(200);
		al.add("Welcome");
		al.add(15.5);
		al.add('A');
		al.add(true);
		System.out.println("Array List is: "+al);
		/*----------------------------------------------------------------------------*/
		//addAll
		ArrayList al_dup=new ArrayList();
		al_dup.add(al);
		System.out.println("After performing addAll method: "+al_dup);
		
		/*----------------------------------------------------------------------------*/
		//removeAll
		al_dup.removeAll(al);
		System.out.println("After performing removeAll method: "+al_dup);
		System.out.println("al_dup arrayList is empty?: "+al_dup.isEmpty());
		
		/*----------------------------------------------------------------------------*/
		ArrayList ap=new ArrayList();
		ap.add('X');
		ap.add('Y');
		ap.add('Z');
		ap.add('A');
		ap.add('B');
		ap.add('C');
		
		System.out.println("Before Sorting: "+ap);//[X, Y, Z, A, B, C]
		/*----------------------------------------------------------------------------*/
		//Sort
		Collections.sort(ap);
		System.out.println("After Soring: "+ap);//[A, B, C, X, Y, Z]
		
		/*----------------------------------------------------------------------------*/
		//reverse order
		Collections.sort(ap,Collections.reverseOrder());
		System.out.println("Reverse Sorting: "+ap);//[Z, Y, X, C, B, A]
		/*----------------------------------------------------------------------------*/
		//Shuffling
		Collections.shuffle(ap);
		System.out.println("Elements in arrayList after Shuffling: "+ap);
		
		
	}

}
