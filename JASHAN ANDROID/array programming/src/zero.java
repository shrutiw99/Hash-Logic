//import java.util.Arrays;
public class zero
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

        int[] arr = {5, 1, 6, 0, 0, 3, 9, 0, 6, 7, 8, 12, 10, 0, 2};  
	      
	    
	     System.out.print("Array  moving zeros to end : ");  
	  
	     for (int i = 0, size = arr.length; i < size; i++)  
	     System.out.print(arr[i] + " "); 
	     int size = arr.length;  
	     int count = 0;  
	  
	     // access all array elements.
	     for (int i = 0; i < size; i++)
	     {  
	    	 if (arr[i] != 0)
	    	 {  
	             arr[count++] = arr[i];  
	         }  
	     }  
	  
	     while (count < size)  
	     arr[count++] = 0;  
	 }  
	}


