package arryss;

public class StrongNumber {

	public static void main(String[] args) {
	System.out.println(isStrong(145));	
	}
	public static boolean isStrong(int num) {
		int no=num,temp=no,sum=0;
		while(num>0) {
			int last=no%10;
			int fact=1;
			while(last>0) {
				fact=fact*last--;
			}
			sum=sum+last;
			no=no/10;
		}
		if(sum==temp) {
			return true;
		}
		return false;
	}

}
