package collectionMethods;

import java.util.*;

public class HashMapExample {

	public static void main (String args[])
	{
		Map<Integer,Integer> myMap=new HashMap<>();
		
		myMap.put(null, null);
		myMap.put(1, 1);
		myMap.put(2, 4);
		myMap.put(3, 9);
		
		System.out.print(myMap.get(2));
		
	}
	// on test 011
}
