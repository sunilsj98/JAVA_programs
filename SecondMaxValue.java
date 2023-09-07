package arryss;

public class SecondMaxValue {

	public static void main(String[] args) 
	{
		int[] a= {30,60,70,50,20,100};
		
		int max=Integer.MIN_VALUE;
		int smax=Integer.MIN_VALUE;
		
		for(int i=0; i<a.length;i++) 
		{
			if(a[i]>max) {
				smax=max;
				max=a[i];
				
			}
			else if(a[i]>smax && a[i]!=max) {
				smax=a[i];
				
			}
		}
		System.out.println("**********************");
		System.out.println(smax);
		System.out.println(max);

	}

}
