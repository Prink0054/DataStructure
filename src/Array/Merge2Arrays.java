package Array;

public class Merge2Arrays {
public static void main(String[] args) {
	
	int a[] = {3,1,2,6,4,9,6};
	int b[] =  {4,1,7,4,9,0};
	
	int a1 = a.length;
	int b1 = b.length;
	int c1 = a1+b1;
	
	int c[] = new int [c1];
	
	for (int i = 0; i < a1; i++) {
		c[i] = a[i];
	}
	for (int i = 0; i < b.length; i++) {
		c[a.length + i] = b[i];
	}
	for (int i = 0; i < c.length; i++) {
		System.out.println(c[i] + "c");
	}
	
}
}
