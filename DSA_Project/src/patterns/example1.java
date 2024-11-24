package patterns;

import java.util.ArrayList;

public class example1 {
	public static void main (String args[])
	{
		 int n = 4; // Maximum value in the pattern
	    

		// Iterate over the rows
		 for (int i = -(n - 1); i <= n - 1; ++i) {
	            
	            // Temp array.
	            ArrayList < Integer > temp = new ArrayList<>();
	            for (int j = -(n - 1); j <= n - 1; ++j) {
	                temp.add(Math.min(Math.abs(i), Math.abs(j)) + 1);
	            }



			    System.out.println(temp);
			}

		
	}

}
