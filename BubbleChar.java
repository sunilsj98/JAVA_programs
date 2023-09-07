package arryss;

import java.util.Arrays;

public class BubbleChar {

	public static void main(String[] args) {
		char[] a= {'c','b','a','d','g','f','e'};
		
		for(int i=0; i<a.length-1;i++)
		{
			for(int j=0; j<a.length-1;j++)
			{
				if(a[j]>a[j+1]) {
					char temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));

	}

}
