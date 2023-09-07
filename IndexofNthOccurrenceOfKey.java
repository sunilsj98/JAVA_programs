package arryss;

public class IndexofNthOccurrenceOfKey {

	public static void main(String[] args) {
		int[] a= {40,60,50,60,80,60,20};
		
		int key=60;
		int occurrence=3;
		int count=0;
		
		for(int i=0;i<a.length;i++) {
			if(key==a[i]) 
			{
				count++;
			}
			if(count==occurrence)
			{
			System.out.println(key +" is reapeted for "+occurrence+" time at index "+i);
			return;
			}
		}
		System.out.println(key);
	}

}
