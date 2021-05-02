package Array;


//O(n)Time
//O(1)Space


public class RemoveDuplicateFromSortedArray {
	
	public static void main(String[] args) {
		int res = 1;
		int n = 7;
		int arr[] = {10,20,20,30,30,40,40};

    	for(int i = 1; i < n; i++)
    	{
    		//Comapare the element with the previous(r)index
    		if(arr[res - 1] != arr[i])
    		{
    			//This 
    			//copy the element if not same
    			arr[res] = arr[i];
    			res++;
    		}
    	}
    	
    	
    	for (int i = 0; i < n; i++) {
		System.out.println(arr[i]);	
		}
    	
	}
	

//80. Remove Duplicates from Sorted Array II

	class Solution {
	    public int removeDuplicates(int[] nums) {
	        
	        int res = 2;
	for(int  i = 2;i<nums.length;i++){
	    
	    if(nums[res-2] != nums[i]){
	        nums[res] = nums[i];
	        res++;
	    }
	    
	}
	     return res;   
	    }
	}
	
	

}