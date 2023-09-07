package arryss;

// Arrays are identical using break

public class ArraysorIdendicalUsingBrake {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		int[] b= {1,2,3,4,5};
		boolean isIdentical=true;
		
		if(a.length != b.length)
		{
			isIdentical=false;
		}
		else
		{
			for (int i = 0; i < b.length; i++) 
			{
				if(a[i] != b[i])
				{
					isIdentical=false;
					break;
				}
				
			}
		}
		if(isIdentical)
		{
			System.out.println("Arrays are identical");
		}
		else
		{
			System.out.println("Arrays are not identical");
		}
		
		
	}

}
