package arryss;

public class FindMaxElemens {

	public static void main(String[] args) {
		int[] b= {20,50,40,109,259,309,500,300,599,67};
		int max=b[0];
	

		for(int i=0;i<b.length;i++) 
		{
			if(b[i]>max) 
			{
				max=b[i];	
			}
			
		}
		System.out.println("max elements is = "+max);
	}

}

 