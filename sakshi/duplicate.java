package test;

import org.apache.commons.lang3.ArrayUtils;

public class duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ar[]= {'q','u','e','e','n'};
		char arr[]= {'t','h','e',' ','q','u','i','c','k',' ','b','r','o','w','n',' ','f','o','x'};
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(ar[i]==arr[j])
				{
					ArrayUtils.remove(arr,arr[i]);
					
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
