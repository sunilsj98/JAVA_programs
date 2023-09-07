package arryss;

public class MaxElements {

	public static void main(String[] args)
	{
		int[] a= {90,80,95,100,81};
	
		int max=Integer.MIN_VALUE;
		System.out.println(Integer.MIN_VALUE);
		
		for(int i=0; i<a.length;i++)
		{
			if(a[i]>max) 
			{
				max=a[i];
			}
		}
		System.out.println("max value will be "+max);

	}

}
