package Array;

public class MajorityElement_Boyer_MooreVotingAlgorithm {

	
	public static void main(String[] args) {
		//finds the candidate by using Boyer moore algo
		int a[] = {8,8,6,6,6,4,6};
		int res = 0;
		int count = 1;
		for (int i = 1; i < a.length; i++) {
			
			if(a[res] == a[i]) {
				count++;
			}
			else {
				count--;
			}
			if(count == 0) {
				res = i;
				count = 1;
			}
			
		}
		System.out.println(res);
		
		//
		for (int i = 0; i < a.length; i++) {
			
			if(a[res] == a[i]) {
				count++;
			}
			
			
		}
		if(count > a.length/2) {
			System.out.println(res);
		}
	}
	
}
