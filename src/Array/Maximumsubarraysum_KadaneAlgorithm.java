package Array;

public class Maximumsubarraysum_KadaneAlgorithm {
public static void main(String[] args) {
	
	int a[] = {-3,8,-2,4,-5,6};
	int res = a[0];
	int maxEnding = a[0];
	for (int i = 1; i < a.length; i++) {
		
		
		maxEnding = Math.max(maxEnding + a[i], a[i]);
		res = Math.max(res, maxEnding);
		
	}
	System.out.println(res);
}
}
