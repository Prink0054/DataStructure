package Array;

public class MoveZeroesToEnd {
public static void main(String[] args) {
	
	int nums[] = {2,1,0,2,0,0,1,0};
	
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