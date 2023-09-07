package arryss;

public class SumofPalindrom {

	public static void main(String[] args) {
		int[] a= {10,121,303,404,55,606};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			if(isPalindrom(a[i])) {
				sum=sum+a[i];
			}
		}
		System.out.println(sum);
	}

	public static boolean isPalindrom(int num) {
		int rev=0,temp=num;
		while(num>0)
		{
			rev=(rev*10)+num%10;
			num=num/10;
		}
		if(temp==rev) 
		{
			return true;
		}
		return false;
	}
}

