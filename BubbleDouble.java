package arryss;

import java.util.Arrays;

public class BubbleDouble {

	public static void main(String[] args) {
		double[] a= {70,50,80,100,40};

		for(int i=0; i<a.length-1;i++)
		{
			for(int j=0; j<a.length-1;j++)
			{
				if(a[j]>a[j+1]) {
					double temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
