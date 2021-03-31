package practice;

public class selectionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,40,30,80,50,60,70};
		for(int i=0;i<arr.length-1;i++) 
		{
		int s=i;
		  for(int j=i+1;j<arr.length;j++)
		  {
			  if(arr[s]>arr[j])
			  {
				  s=j;
			  }
		  }
		  int temp=arr[s];
		  arr[s]=arr[i];
		  arr[i]=temp;
		}
		System.out.println(arr[5]);
		
		int sum=0,avg=0;
		for(int i=0;i<arr.length;i++) 
		{
			System.out.println(arr[i]);
			
			sum=sum+arr[i];		
			avg=sum/2;
		}System.out.println(sum+" "+avg);
		
	}

}
