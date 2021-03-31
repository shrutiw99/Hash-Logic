
public class sum 
{
	public static void main(String[] args) 
	{
		int sum =0;
		int a=12,b=14;
	System.out.println("enter the number");
	sum =a+b;
	System.out.print(sum);
	System.out.println();

	// average numbers 
	int n[] = new int[]{20, 30,40,50};
	for(int i=0; i < n.length ; i++)
        sum = sum + n[i];
       //calculate average value
        double average = sum / n.length;
        System.out.println("Average value of the array elements is : " + average); 
	}
	}

