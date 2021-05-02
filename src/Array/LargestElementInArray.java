package Array;
//Time COMPLEXITY IS THETA(N)
public class LargestElementInArray {
	public static void main(String[] args) {
		
		int a[] = {4,1,5,2,8,9,10,8,34,23};
		int l = a[0];
		
		for (int i = 0; i < a.length; i++) {
			
			if(l<a[i]) {
				l = a[i];
			}
		}
		System.out.println(l);
		
		
		
		}
}
