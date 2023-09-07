package arryss;

public class PalindromNum1_500 {

	public static void main(String[] args) {
		int num=500;
		
		for(int i=1;i<num;i++) 
		{
			if(isPalindrom(i))
			{
				System.out.print(i+",");
			}
		}

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
