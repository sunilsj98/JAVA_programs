package arryss;

public class SumofOddNum {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		int sum=0;
		

		for(int i=0; i<a.length;i++)
		{
			if(a[i]%2==1)
			{
				sum=sum+a[i];
				
			}
			
		}
		
		System.out.println(sum);
	}

}
