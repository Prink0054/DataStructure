package Array;

public class Test {

	public static void main(String[] args) {
		
		int a[] =  {5,12,78,3,2,9};
		int first = a[0];
		//int last = a[a.length-1];
		
		for (int i = 1; i < a.length; i++) {
			
			
			a[i-1] = a[i];

		}
		a[a.length-1] = first;
		
	
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
	}
}
