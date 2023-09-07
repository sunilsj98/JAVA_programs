package arryss;

public class LinerClassusingReturn {

	public static void main(String[] args) 
	{
	
		int[] a= {40,60,50,60,80,30};
        
		int key=40;
        
        for(int i=0;i<a.length;i++)
        {
        	if(key==a[i]) 
        	{
        		System.out.println(key+"  is precent");
        		return;
        	}
        }
        System.out.println(key+" not precent ");
	}
	

}
