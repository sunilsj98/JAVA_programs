package arryss;

//WJPT STORE EMPLOYEE DETAILS IN THE ARRAY AND PRINT THE EMP DETAILS WHOS SALARY IS MORETHEN 150000

public class EmpDetails {

	public static void main(String[] args) {
		
		int[] id= {1,2,3,4,5,6,7,8,9};
		
		String[] name = {"viki","sathish","dani","nani","vani","sunil","sam","vasa","rohit"};
		
		double[] salary= {10000,11000,15000,12000,17000,16000,20000,25000,30000};
		
		double n=15000;
		
		
		for (int i=0;i<salary.length;i++)
		{
			if (salary[i]>n)
			{
				System.out.println(salary[i]);
			}
		}
			}

}
