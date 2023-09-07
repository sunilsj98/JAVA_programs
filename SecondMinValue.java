package arryss;

public class SecondMinValue {

	public static void main(String[] args) {
		int[] a= {30,40,20,100,50};
		
		int min=Integer.MAX_VALUE;
		int smin=Integer.MAX_VALUE;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min) 
			{
				smin=min;
				min=a[i];
			}
			else if(a[i]<smin && smin!=min) 
			{
				smin=a[i];
			}
		}
		System.out.println("Minimum value will be "+min);
		System.out.println("Second minimum value :: "+smin);

	}

}
