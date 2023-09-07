package arryss;

public class AvgofArry {

	public static void main(String[] args) {
   double[] a=	{75,69,77,95,88};
   double sum=0;
   for(int i=0;i<a.length;i++)
   {
	   sum=sum+a[i];
   }
   System.out.println("Avg of 25 number is = "+sum/a.length);
   }

}
