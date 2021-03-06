package findname;

/*
 * Search.java
 */
 
 public class Search {

	/**
	 * Returns the index of the element numToFind in array array.
	 * -1 returned if element not found.
	 * pre: none
	 * post: index of numToFind has been returned. -1 has been
	 * returned if element not found.
	 */
	 
	public static int linear(int[] array, int numToFind) {
		
		int index = 0;
		
		while ((array[index] != numToFind) && (index < array.length - 1)) {
			index += 1;
		}
		
		if (array[index] == numToFind) {
			return(index);
		} else {
			return(-1);
		}
	}
	
	public int linear(String[] array1, String nametoFind) {
		
		int index1 = -1;

		for (int i=0;i<array1.length;i++) {
			
		    if (array1[i].equals(nametoFind)) {
		        index1 = i + 1;
		 
		    }
		}
		
		return index1;
	}
}

