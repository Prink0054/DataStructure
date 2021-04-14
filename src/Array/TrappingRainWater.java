package Array;

public class TrappingRainWater {
public static void main(String[] args) {
	
	int a [] = {3,0,1,2,5};
	int res = 0;
	for (int i = 1; i < a.length-1; i++) {

		int lmax = a[i];
		for (int j = 0; j < i; j++) {
			
			lmax = Math.max(lmax, a[j]);
		}
	
		System.out.println(lmax);
		
	}
	
}
}
