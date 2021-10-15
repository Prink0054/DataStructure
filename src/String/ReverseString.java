import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;


public class Programs {

	
	
	void reverse(String s) {
		
		
		if((s == null) ||(s.length()<=1)) {
			System.out.println(s);
		}else {
			
            System.out.print(s.charAt(s.length()-1));

			reverse(s.substring(0, s.length()-1));
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		String s = "Geeeks for geeks";
Programs programs = new Programs();
programs.reverse(s);
		
		String s = "";
		
		for(int i=0;i<m.length();i++ ) {
			
			s = m.charAt(i)+s;
			
		}
	
        System.out.println(s);
       
				
		String m = "hello";

		char [] temp = m.toCharArray();
		
		int start = 0;
		int end = temp.length-1;
		
		while(start<end) {
			
			char s = temp[start];
			temp[start] = temp[end];
			temp[end] = s;
			start++;
			end--;
			
		}
		
		System.out.println(temp);
//		
		
	}
}

