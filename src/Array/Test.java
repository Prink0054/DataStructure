package Array;



public class Test {

	public static void main(String[] args) {
				int a[] = {8,5,0,10,0,20,9,0,6,5};

    	
    	for (int i = 0; i < a.length; i++) {
			
    	if(a[i] == 0) {
    		
    		//System.out.println(a[i]);
    		
    		for (int j = i+1; j < a.length; j++) {
    			
    			if(a[j] != 0) {
    				int temp = a[i];
    				a[i] = a[j];
    				a[j] = temp; 
    			}
			}
    		
    	}

    	
    			
    		}
    		
    	for (int j = 0; j < a.length; j++) {
			System.out.println(a[j]);
		}
    	
    	
    	
    	
	}
}
