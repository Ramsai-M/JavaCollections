package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ar[]= {"Car","Bus","Bike","Lorry","Ship","Aeroplane"};
		System.out.println("Array Length is: "+ar.length);
		for(String ae:ar) {
			System.out.print(ae+" ");
		}
		
		/*----------------------------------------------------------------------------*/
		//Convert Arrays to ArrayList
		ArrayList an=new ArrayList(Arrays.asList(ar));
		System.out.println("\nAfter Conversation to ArrayList: "+an);
		System.out.println("ArrayList Size is: "+an.size());
	}

}
