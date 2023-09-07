package arryss;

import java.util.Arrays;

public class LefeRorateArrays {

	public static void main(String[] args) {
		int[] a= {10,30,40,50};
		int rotate=4;
		
		for (int i = 0; i < rotate; i++) 
		{
			int temp=a[0];
			
			int j=0;
			while(j<a.length-1)
			{
				a[j]=a[j+1];
				j++;
			}
			a[j]=temp;
			System.out.println(Arrays.toString(a));
		}
		
		
	}

}
