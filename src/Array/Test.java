package Array;



public class Test {

	public static void main(String[] args) {
				int a[] = {3,4,1,6,4};
				int first = a[0];
    	
    	for (int i = 1; i < a.length; i++) {
			
    		a[i-1] = a[i];
    	
    		
    	}
    	a[a.length-1] = first;
    	

    	for (int i = 0; i < a.length; i++) {
			
		}
    	
}
	

}
