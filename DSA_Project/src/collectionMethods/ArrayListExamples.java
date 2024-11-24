package collectionMethods;

import java.util.*;

public class ArrayListExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ArrayListExample");
		
		List<Integer> myList=new ArrayList<>();
		
		// add element 
		myList.add(1);
		myList.add(2);
		myList.add(3);
		myList.add(4);
		myList.addAll(myList); 		// add all element from other list 
		
		//remove element 
		myList.remove(1);			// removes at index 
		myList.replaceAll(e -> e/2);	//replace based on condition
		myList.removeFirst();		// remove first  
		myList.removeLast();		// remove last 
		myList.clear();				// remove all
		myList.removeIf(n->n%2==0); // remove if condition matches 
		
		myList.set(0, 1);			// replace data at index
		
		myList.get(0);				// get value from index
		
		myList.size();				// get size of list
		
		myList.contains(1);		// return true or false 
		myList.indexOf(1);			// return index of value and return -1 if not found 
		myList.isEmpty();			// check is empty or not 
		myList.sort(Comparator.naturalOrder());				//Sort data
		
		
		myList.toArray();
		myList.toString();
		
		myList.forEach(null);
		
		
		for(int i : myList)
		{
			System.out.println(i);
		}
		
	    Iterator<Integer> iterate = myList.iterator();
	    
	    while(iterate.hasNext())
	    {
	    	System.out.print(iterate.next());
	    	
	    }
	}

}
