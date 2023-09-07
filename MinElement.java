package arryss;

public class MinElement {

	public static void main(String[] args) {
		int[] a= {20,30,15,60,80};
		
		int min=Integer.MAX_VALUE;
		System.out.println(Integer.MAX_VALUE);
		for(int i = 0; i < a.length; i++) 
		{
			if(a[i]<min) 
			{
				min=a[i];
			}
			
		}
		System.out.println(min);

	}

}
