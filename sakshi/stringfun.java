package practice;

import java.util.Arrays;

public class stringfun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr=
			{
					7,4,8,3,2,9,10
			};
		String[] ar=
			{
					"java","c","python",
			};
		
		System.out.println("original array:"+Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("after sorting array:"+Arrays.toString(arr));

		
		System.out.println("original array:"+Arrays.toString(ar));
		Arrays.sort(ar);
		System.out.println("after sorting array:"+Arrays.toString(ar));

	}

}
