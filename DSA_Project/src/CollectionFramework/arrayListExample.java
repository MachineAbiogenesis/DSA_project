package CollectionFramework;

import java.util.*;

public class arrayListExample {
	public static void main (String args[])
	{
		List<Integer> myArrayList=new ArrayList<>(1000);// initial capacity is 1000 its not represent size 

		myArrayList.add(1);
		myArrayList.add(2);
		myArrayList.add(3);
		myArrayList.add(1,3);// at index 1 add 3
		myArrayList.size();
		myArrayList.remove(1);// remove at index 
		myArrayList.set(1, 4);// replace at index 
		myArrayList.get(1);// get at index 1
		
		myArrayList.remove(1);// will remove value at index 1
		myArrayList.remove(Integer.valueOf(1));// now it will remove value 1 not index 1 
		

		List<Integer> myList2=List.of(4,5,6,7);// immutable list cannot add 
//		myList2.add(1);//exception
//		myList2.set(0, 1);//exception
		
		String[] arr= {"APPLE","BANANA"};
		List<String> myList3=Arrays.asList(arr);// cannot add new element but can replace 
		//myList3.add("m");// excepetion 
		myList3.set(0, "m");// can modify 
		
		myArrayList.addAll(myList2);// merge two list
		
		
		//convert list to array 
		Integer [] myArray=myArrayList.toArray(new Integer[0]);//new Integer[0 will create array of integer 
		//if nothing is passed it will return array of objects
		
		
		//sorting 
		Collections.sort(myArrayList);
		myArrayList.sort(null);// null will sort in ascending order 
		myArrayList.sort((a,b)->a-b);
		System.out.println(myArrayList);
		myArrayList.sort((a,b)->b-a);// for reverse order sorting
		System.out.println(myArrayList);
		
		
		
		
		
		for(int i : myArrayList)
		{
			
		}
	}

}
