
public class binarysearch 
{

	public static void main(String[] args)
{
		// TODO Auto-generated method stub

int k=20;
int arr[]= {10,20,30,40,50};
int mid=0,start=0,end= arr.length-1;
mid= start+end%2;;
 while( start<=end)
 {
	 if (arr[mid]<k)
		 start=mid+1;
		 
	 else if(arr[mid]==k)
		 {
		 System.out.println(" elements loctaion found " + (mid+1)+" .");
 break;
 }
 else
 {  
	 end= mid-1;
 }
 mid= (start+ end)/2;

	if(start>end)
	 System.out.println( "item found.\n");
}

}
}





