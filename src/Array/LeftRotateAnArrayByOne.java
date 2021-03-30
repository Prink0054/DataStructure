package Array;
//0(n)time
//0(1) auxilary space contstant space
//
public class LeftRotateAnArrayByOne {
	
	
	static void leftone(int a[],int d) {
		
		int temp = a[0];
		for(int i =1;i<a.length;i++) {
			//moving all emements to left by 1
			a[i-1] = a[i];
		}
		//saving integer value in last of array after roattaing
		a[a.length-1] =  temp;	
	}
	
	static void leftd(int a[],int d) {
		for (int i = 0; i < d; i++) {		
			leftone(a, a.length);
		}
	}
	
	
	
public static void main(String[] args) {
	int d = 2;
	int a [] =  {1,2,3,4,5};
	//storing first elemet in integer
	
	leftd(a,d);
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
	
}
}
