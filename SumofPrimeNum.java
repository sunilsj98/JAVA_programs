package arryss;

public class SumofPrimeNum 
{
	public static void main(String[] args) 
	{
		int[] a= {1,2,3,4,5,6};
		int sum=0;
		for(int i=0; i<a.length;i++) 
		{
			if( isPrime(a[i])) 
			{
				sum=sum+a[i];
			}
		}
		System.out.println(sum);
	}

	public static boolean isPrime(int num) {
		if(num==1)
		{
			return false;
		}
		for(int i=2; i<num ; i++) 
		{
			if( num%i ==0) 
			{
				return false;
			}
		}
		return true;
	}
}
