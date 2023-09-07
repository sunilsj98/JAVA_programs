package arryss;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDublicate 
{

	public static void main(String[] args) 
	{
		int[] a= {1,2,1,3,4,2,5,4,4,5};
		
		Set<Integer> lhs= new LinkedHashSet<>();
		
		for(int num : a)
		{
			lhs.add(num);
		}
		int[] res= new int[lhs.size()];
		int index=0;
		for(int num : lhs)
		{
			res[index++] = num;
		}
		System.out.println(Arrays.toString(res));
 
	}

}
