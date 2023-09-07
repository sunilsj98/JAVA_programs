package arryss;

public class CountOfKey {

	public static void main(String[] args) 
	{
		int[] a= {40,60,50,60,80,30,60};

		int key=600;
		int count=0;
		boolean flag=true;

		for(int i=0; i<a.length;i++) 
		{
			if(key==a[i]) 
			{
				count++;
				flag=true;
			}

		}
		if(flag)
		{
			System.out.println(count+" time "+ key +" is precent");
		}
		else 
		{
			System.out.println(count+" time "+key+" is precent");
		}
	}
}
