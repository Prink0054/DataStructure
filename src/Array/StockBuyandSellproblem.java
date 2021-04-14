package Array;

public class StockBuyandSellproblem {
public static void main(String[] args) {
	
	
	 int a[] = {1,5,3,8,12};
	 
	 int profit = 0;
	 for (int i = 1; i < a.length; i++) {
		//we will check when the bar goeas up and save the profit
		 if(a[i] > a[i-1]) {
			 
			 profit = profit + (a[i] - a[i-1]);
			 
		 }
		 
	}
	System.out.println(profit);
	
}
}
