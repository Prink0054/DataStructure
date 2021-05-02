package Array;

public class SecondLargestElementArray {
public static void main(String[] args) {
	int a[] =  {5,20,12,8};
	
	int res = -1;
	int largest = 0;
	for (int i = 1; i < args.length; i++) {
		
		if(a[i]>a[largest]) {
		res = largest;
		largest = i;
		}
		else if(a[i] != a[largest]) {
			
			if(res == -1 || a[i] > a[res]) {
				res = i;
			}
		}
		System.out.println(largest);
		System.out.println(res);
	}
	
}
}
