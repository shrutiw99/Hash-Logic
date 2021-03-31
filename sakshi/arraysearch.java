   package practice;

public class arraysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {10,20,30,40,50,60,70};
		int num=70,flag=0;
		for(int i=0;i<arr.length;i++)
		{
			if(num==arr[i])
			{
				System.out.println(num+" is found at "+ ++i);
				flag=1;
				break;
			}
			
		}
		
		if(flag==0)
		{
			
				System.out.println("number is not found");	
		}
	
		
		int	s=0,e=arr.length-1,m=0;
	m=(s+e)/2;
	while(s<=e)
	{
		 
		
		 
		 if(arr[m]==num)
		 {
			 System.out.println("element is found at"+m+1); 
			 break;
		 }
		 else if( arr[m] >=num) 
		{
			e=m+1;
			
			
		}
		
		else 
		{
			s=m-1;
		
			
		}
		 m=(s+e)/2;
	}
		if(s>e)
			System.out.println("element is not found "); 	
		
	}

}
