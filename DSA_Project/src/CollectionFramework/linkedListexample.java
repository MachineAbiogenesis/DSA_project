package CollectionFramework;

import java.util.LinkedList;

public class linkedListexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> mylinkedList=new LinkedList<Integer>();
		mylinkedList.add(null);// just add 
		mylinkedList.add(0, null);// add at index 
		mylinkedList.addFirst(null);/// add at start 
		mylinkedList.addLast(null); // ad at last 
		mylinkedList.addAll(0, mylinkedList);// add all from specified index 
		
		mylinkedList.get(0);// get data from index
		mylinkedList.getFirst();
		mylinkedList.getLast();
		
		mylinkedList.remove();// removes first element 
		mylinkedList.remove(0); // remove at index
		mylinkedList.removeFirst();// remove and return first element 
		mylinkedList.removeLast();// remove and return last 
		mylinkedList.removeFirstOccurrence(mylinkedList);
		mylinkedList.removeIf(a-> a%2==0);// give condition to remove 
		
	
	        
	        
	        
	}

}


class Node {
	
	int value;
	Node next;
}
