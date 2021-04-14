package Array;


//O(n)
//O(1)
public class Maximumconsecutive1s {
public static void main(String[] args) {
	
	int a [] =  {0,1,1,1,0,1,1};
	
	int res = 0;
	int cout = 0;
	for (int i = 0; i < a.length; i++) {
		
		if(a[i] == 0) {
			cout = 0;
		}
		else {
			cout++;
			res = Math.max(res, cout);
			
		}
		
	}
	
	System.out.println(res);
}
}
