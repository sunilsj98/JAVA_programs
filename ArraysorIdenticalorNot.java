package arryss;

// two arrays are identical/not

public class ArraysorIdenticalorNot 
{
	public static void main(String[] args) 
	{
		int[] a= {1,2,3,4,5};
		int[] b= {1,2,3,4,6};
		if(a.length!= b.length)
		{
			System.err.println("comparing length => Arrays are not idendical");
			return;
		}

		for (int i = 0; i < a.length; i++) 
		{ 
			if(a[i]!=b[i])
			{
				System.out.println("comparing elemant => Arrays are not Idendical");
				return;
			}
		}
		System.out.println("Arrays are identical");
	}
}
