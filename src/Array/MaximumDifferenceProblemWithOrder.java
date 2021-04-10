package Array;

public class MaximumDifferenceProblemWithOrder {

public static void main(String[] args) {
	
	int a [] =  {2,3,10,6,4,8,1};
	int res = a[1] - a[0];

	for(int i =0;i<a.length;i++) {
		
		for(int j = i+1;j<a.length;j++) {
			
			res = Math.max(res, a[j] - a[i]);
			
		}
	}
	

	
	System.out.println(res);

	
}
	
	
}
