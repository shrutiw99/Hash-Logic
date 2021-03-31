//import java.util.Arrays;
public class specifiede
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int arr[]= {10,20,30,40,65,77,55,65,77};
		int i, num=65;
		int num2 =77;
		for (i=0;i<=arr.length ; i++)
		{
			if (num ==arr[i] && num2==arr[i])
			{ 
				System.out.println("  wrong elements");
			}
				else
				{
					System.out.println(" elements found");
					
				}
				System.out.println(arr[i]);
			}
	}

}
