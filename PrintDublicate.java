package arryss;

public class PrintDublicate {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3,2, 5, 4 ,6,6,4 };
		boolean[] visited=new boolean[a.length];
		for (int i = 0; i < visited.length; i++) 
		{
			if(visited[i]==false)
			{
				int count=1;
				for (int j = i+1; j < visited.length; j++) 
				{
					if(a[i]==a[j])
					{
						count++;
						visited[j]=true;
					}
				}
				if(count>1) 
				{
					System.out.println(a[i]+" - "+count);
				}
			}
		}
	}
}
