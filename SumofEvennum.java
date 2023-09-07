package arryss;

public class SumofEvennum {

	public static void main(String[] args) {
		int[] a= {10,121,304,404,55,64};
		int sum=0;
		
		for(int i=0; i<a.length;i++) 
		{
			
			if(isEven(a[i])) 
			{
			
				sum=sum+a[i];	
			}
		}
		System.out.println("sum of evem numbers is = "+sum);

	}
	public static boolean isEven(int num) 
	{
		if(num%2==0) 
		 {
			return true;
		}
		return false;
		
	}

}
