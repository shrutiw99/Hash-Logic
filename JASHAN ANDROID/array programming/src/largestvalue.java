import java.util.Arrays;
public class largestvalue 
{
public static void main(String[] args) 
{
		// TODO Auto-generated method stub
	int a[] = {1,2,3,4,5,6};
	System.out.println("Original Array: "+Arrays.toString(a)); 
	int max = a[0];
	int min = a[0];
	for(int i = 1; i < a.length; i++)
	{
		if(max < a[i])
        {
            max = a[i];
            
        }
		else if(min < a[i])
        { 
            min = a[i];
           
        }
	}
	
	int c= max-min;
	System.out.println("Difference: "+(c));
	}

}
