
public class exactly
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]=  {10,20,15,15,14,16};
		int size = array.length;
		for ( int i=0;i< size ; i++)
		{
			for (int j= i+1; j<size; j++)
			{ 
				int output=30;
				if (array[i]+array[j] == output)
			System.out.println(array[i]+" +" +array[j]+" +  =  "+output);
	}

}
	}
}