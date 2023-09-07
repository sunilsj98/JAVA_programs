package arryss;

public class NewOp1 {

	public static void main(String[] args) {
		int[] num=new int[4];
		
		num[0]=20;
		num[1]=30;
		num[2]=40;
		num[3]=50;
		
		System.out.println("----------------------");
		
		for(int i=0; i<num.length;i++) {
			System.out.println(num[i]+ ".");			
			
		}
		System.out.println("--------------------------");
		System.out.println(num.length);

	}

}
