package Searching;

//o(log n) if elemet i present 

//if not 0(log n)

public class BinarySearchIterativeSolution {
public static void main(String[] args) {
	
	
	int a[] = {3,1,67,23,7,9};
	int first = 0;
	int last = a.length-1;
	int key = 1;
	
	int mid = (first + last)/2;  
	
	   while( first <= last ){ 
		   
	      if ( a[mid] < key ){  
	        first = mid + 1;     
	      }else if ( a[mid] == key ){  
	        System.out.println("Element is found at index: " + mid+1);  
	        break;  
	      }else{  
	         last = mid - 1;  
	      }  
	      mid = (first + last)/2;  
	   }  

	
}
}
