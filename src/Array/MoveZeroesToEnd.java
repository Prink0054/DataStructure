package Array;
//O(n) time
//o(1) space
public class MoveZeroesToEnd {
public static void main(String[] args) {
	
	int nums[] = {8,5,0,10,0,20,9,0,6,5};
	
	//count for counting track of non 0 elements
    int count = 0;
    
    for(int i =0;i<nums.length;i++){
    
        if(nums[i] != 0){
            //swap the non 0 element with count
            int a = nums[i];
            nums[i] = nums[count];
            nums[count] = a;
            count++;
            
            
        }
        
  
	
}
    for (int i = 0; i < nums.length; i++) {
		System.out.println(nums[i]);
	}
}
}



//o(n)
//o(1)

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

