
public class linearsearch 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
int arr[]= {10,20,30,40};
int i, num=40;
for (i=0;i<=arr.length ; i++)
{
	if (num ==arr[i])
	{ 
		System.out.println("  Elements is found");
	}
		else
		{
			System.out.println("wrong elements");
			
		}
		System.out.println(arr[i]);
	}
}
	
}


