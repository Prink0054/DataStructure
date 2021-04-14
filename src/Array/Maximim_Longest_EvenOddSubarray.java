package Array;

public class Maximim_Longest_EvenOddSubarray {
public static void main(String[] args) {
	
	int a[] = {5,10,20,6,3,8};
	
	int res = 1;
	int curr = 1;
	for (int i = 1; i < a.length; i++) {
		
		if((a[i]%2==0 && a[i-1]%2!=0)|| (a[i]%2!=0 &&a[i-1]%2==0)) {
			curr ++ ;
			res = Math.max(res	, curr);
		}
		else {
			curr = 1;
		}
	}
	System.out.println(curr);
} 
}
