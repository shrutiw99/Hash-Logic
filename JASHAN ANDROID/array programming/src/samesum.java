
public class samesum 
{
public static void main(String[] args)
	{
		int array[]=  {2,2,3,1,4,0};
		int size = array.length;
		for ( int i=0;i< size ; i++)
		{
			for (int j= i+1; j<size; j++)
			{ 
				int output=4;
				if (array[i]+array[j] == output)
					System.out.println(array[i]+" +" +array[j]+" +  =  "+output);
			}
		}
			
	}

}