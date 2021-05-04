package Searching;

public class IndexoffirstOccurrenceinSorted {
public static void main(String[] args) {
	
	int a[] = {5, 10, 10,15, 20};
	
	
	
	int x = 10;
	//o(n)
	//o(n)
//	for (int i = 0; i < a.length; i++) {
//		
//		if(a[i] == x) {
//			System.out.println(i);
//			break;
//		}
//	}
	
	
	
	int low = 0;
	   int high = a.length - 1;
	   int result = -1;
	   
	   //keep looking for all the elements in the array
	   while(low <= high){
	     //Get the mid
	     int mid = (low + high) / 2;
	     
	     //If element found
	     //Then store the index and look in the lower range for 1st occurrrence
	     if(a[mid] == x){
	       result = mid;
	       high = mid - 1;
	    	 
	     }
	     
	     //2nd occurence
//	     if(a[mid] == x){
//		       result = mid;
//		       low = mid + 1;
//		    	 
//		     }
	     
	     else if(x < a[mid]){
	       //If value is less than the mid element then looking the lower range
	       high = mid - 1;
	     }else{
	       //If value is greater than the mid element then look in the upper range
	       low = mid + 1;
	     }
	   }
	
	
	System.out.println(result);
	
}
}
