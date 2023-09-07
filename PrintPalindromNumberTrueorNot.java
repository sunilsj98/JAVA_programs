package arryss;

public class PrintPalindromNumberTrueorNot {

	public static void main(String[] args) {
		System.out.println(isPalindrom(13));

	}
	
	public static boolean isPalindrom(int num) 
	{
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
