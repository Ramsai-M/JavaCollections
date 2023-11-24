package collections;

import java.util.HashSet;

public class HashSetDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Integer> hs1=new HashSet<Integer>();
		hs1.add(2);
		hs1.add(4);
		hs1.add(6);
		hs1.add(8);
		hs1.add(10);
		
		System.out.println("HashSet Values are: "+hs1); //[2, 4, 6, 8, 10]
		/*----------------------------------------------------------------------------*/
		HashSet<Integer> dup_hs1=new HashSet<Integer>();
		//addAll
		dup_hs1.addAll(hs1);
		dup_hs1.add(12);
		System.out.println("After adding all: "+dup_hs1); //[2, 4, 6, 8, 10, 12]
		/*----------------------------------------------------------------------------*/
		//removeAll
		dup_hs1.removeAll(hs1);
		System.out.println("After removing all: "+dup_hs1); //[12]
		
	}

}
