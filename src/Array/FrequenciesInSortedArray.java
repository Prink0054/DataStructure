package Array;

public class FrequenciesInSortedArray {
public static void main(String[] args) {
	
	
	
	int a [] = {10,20,20,30,35,35,45,45,45,45,50};
	int freq = 1;
	int i = 1;
	
	while(i<a.length) {
		
		

		while(i<a.length && a[i]==a[i-1]) {
			
			i++;
			freq++;
		}
		
		
		System.out.println(a[i-1] + "freq" + freq);
		i++;
		freq = 1;
		
	}
	//i elemetn is 1 or last elemt has only 1 frequency
	if(a.length ==1 || a[a.length-1]!=a[a.length-2]) {
		System.out.println(a[a.length-1] + "freq" + 1);
	}
	
}
}
