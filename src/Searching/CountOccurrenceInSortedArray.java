package Searching;

public class CountOccurrenceInSortedArray {

	
public static void main(String[] args) {
	int a[] = {5, 10, 10,15, 20};
	int x = 10;

	int low = 0;
	int high = a.length-1;
	
	CountOccurrenceInSortedArray array = new CountOccurrenceInSortedArray();
	int first = array.firstocurrence(a,x);
	int second = array.secondOcurrence(a,x); 
System.out.println(first);
System.out.println(second);
}

 
public int secondOcurrence(int a[],int x) {
	int low = 0;
	int high = a.length-1;
	int res = -1;
	
	while (low<=high) {
		int mid = (low+high)/2;

		if(a[mid] == x) {
			res = mid;
			low = mid+1;
		}
		else if(a[mid] > x){
			high = mid-1;
		}
		else {
			low = mid+1;
		}
		
	}
	

	return res;
}

 public int firstocurrence(int a[],int x) {
	
	 int low = 0;
	int high = a.length-1;
	int res = -1;
	
	while (low<=high) {
		int mid = (low+high)/2;

		if(a[mid] == x) {
			res = mid;
			high = mid-1;

		}
		else if(a[mid] > x){
			high = mid-1;
		}
		else {
			low = mid+1;
		}
		
	}	
	return res;
}
}
