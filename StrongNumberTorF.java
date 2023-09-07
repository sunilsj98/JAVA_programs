package arryss;

public class StrongNumberTorF {

	public static void main(String[] args) {
		int a=145;
		System.out.println(isStrong(a));

	}

	public static boolean isStrong(int num) 
	{
		int temp=num, sum=0;
		while(num>0)
		{
			int last=num%10;
			int fact=1;
			while(last>0)
			{
				fact=fact*last--;
			}
			sum=sum+last;
			num=num/10;
		}
		if(sum==temp) 
		{
			return true;
		}
		return false;
	}
}
