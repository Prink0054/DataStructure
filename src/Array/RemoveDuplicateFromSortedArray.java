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
    		if(arr[res - 1] != arr[i])
    		{
    			arr[res] = arr[i];
    			res++;
    		}
    	}
    	
    	
    	for (int i = 0; i < n; i++) {
		System.out.println(arr[i]);	
		}
    	
	}
	



}