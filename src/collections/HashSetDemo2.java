package collections;

import java.util.HashSet;

public class HashSetDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Integer> hs1=new HashSet<Integer>();
		hs1.add(2);
		hs1.add(4);
		hs1.add(6);
		
		System.out.println("HashSet Values are: "+hs1);
		/*----------------------------------------------------------------------------*/
		HashSet<Integer> dup_hs1=new HashSet<Integer>();
		//addAll
		dup_hs1.addAll(hs1);
		dup_hs1.add(10);
		System.out.println("After Adding All: "+dup_hs1);
		/*----------------------------------------------------------------------------*/
		//removeAll
		dup_hs1.removeAll(hs1);
		System.out.println("After removing all: "+dup_hs1);
		
	}

}
