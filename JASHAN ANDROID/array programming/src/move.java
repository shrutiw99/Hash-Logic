
public class move
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		int A [] = { 6, 0, 8, 2, 3, 0, 4, 0, 1 };
	int j = 0;
		for (int i = 0; i < A.length; i++)
		{
			if (A[i] != 0)
			{
				
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	}
				j++;
			}
		}
	}
