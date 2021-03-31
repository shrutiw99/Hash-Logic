
public class sorting 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	
		int arr[]= {10,20,30,40,50};
		int a,size;
		
		size = arr.length-1;
		for (int i=0;i<size;i++)
		{
			int s=i;
			for (int j=i+1;j< size ;j++ )
			{
				if (arr[s]> arr[j])
				{  
					s=j;
				}
				}
		
		       int temp= arr[s];
				arr[s]= arr[i];
				arr[i]=temp;
			}
			System.out.println(temp);
	}
}

	



