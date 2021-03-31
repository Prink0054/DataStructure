package Array;

//Time Complexity: O(n)

public class LeadersInArrayNaiveApproach {
public static void main(String[] args) {
	
	int a[] = {7,10,4,10,6,5,2};
	
	int currentLeader = a[a.length-1];
	System.out.println(currentLeader);

	for (int i=a.length-2; i>=0; i--) {
		
		if(currentLeader<a[i]) {
			currentLeader = a[i];
			System.out.println(currentLeader);
		}
		
	}
	
	
}
}
