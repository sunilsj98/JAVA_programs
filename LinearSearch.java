package arryss;

public class LinearSearch 
{

	public static void main(String[] args) 
	{
		int[] a= {40,60,50,60,80,30};
		
		int key=30;
		
		boolean flag=true; 

		for(int i=0;i<a.length;i++)
		{
			if(key==a[i]) 
			{
				flag=false;
				System.out.println("The value "+key+" is precent ");
				System.out.println("The value precent in:: "+i+"th place");
				break;	
			}
		}
		if(flag) 
		{
			System.out.println(key+" is not precent");
		}
		
	}

}
