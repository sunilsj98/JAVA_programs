package arryss;

import java.util.Scanner;

public class AddingArrys {

	public static void main(String[] args) {
		String[] b=new String[5];
		int[] a= new int[5];
		
		
		Scanner sc =new Scanner(System.in);
		
		for(int i=0; i<a.length;i++)
		{
			System.out.println("ENTER NAME");
			b[i]=sc.next();
			System.out.println("ENTER MARKS");
			
			a[i]=sc.nextInt();
		}
		for(int i=0; i<a.length;i++)
		{
			System.out.print(a[i]+ ",");
		}
		

}
}