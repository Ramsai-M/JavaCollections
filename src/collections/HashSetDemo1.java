package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//HashSet hs=new HashSet();//default capacity is 16 Load factor 0.75
		//HashSet hs1=new HashSet(100);
		//HashSet hs2=new HashSet(100,(float)0.90); -- Capacity is 100 Load factor 0.90
		//HashSet<integer> hs3=new HashSet<Integer>();
		HashSet hs=new HashSet();
		
		//add objects/elements in hashset
		hs.add(100);
		hs.add("Welcome");
		hs.add(16.4);
		hs.add('A');
		hs.add(true);
		hs.add(null);
		
		System.out.println(hs);//[null, A, 100, 16.4, Welcome, true]
		/*----------------------------------------------------------------------------*/
		//remove
		hs.remove(16.4);
		System.out.println("After removing: "+hs);
		/*----------------------------------------------------------------------------*/
		//contains
		System.out.println(hs.contains("Welcome"));//true
		System.out.println(hs.contains("xyz"));//false
		/*----------------------------------------------------------------------------*/
		//isEmpty
		System.out.println("is this HashSet is empty?: "+hs.isEmpty());
		/*----------------------------------------------------------------------------*/
		//Reading elements using for each loop;
		System.out.println("Using For Each Loop: ");
		for(Object e: hs) {
			System.out.print(e+" ");
		}
		/*----------------------------------------------------------------------------*/
		//Reading elements using iterator method
		System.out.println("\nUsing Iterator method: ");
		Iterator it=hs.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		
	}

}
