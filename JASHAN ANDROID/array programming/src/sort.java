import java. util.Arrays;


public class sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {12,13,14,15,16,17}; 
	      String[] arr2 = {"h","e ", "l ","l","o","a"};
	    System.out.println("Original numeric array : "+Arrays.toString(arr1));
	    Arrays.sort(arr1);
	    System.out.println("Sorted numeric array : "+Arrays.toString(arr1));
	    System.out.println("Original string array : "+Arrays.toString(arr2));
	    Arrays.sort(arr2);
	    System.out.println("Sorted string array : "+Arrays.toString(arr2));
	}

}
