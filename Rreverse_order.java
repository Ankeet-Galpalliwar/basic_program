package Recursion_programs;

//import java.awt.desktop.AboutHandler;

public class Rreverse_order {
	static int n=1;
	public static void main(String[] args) {
		//m1(5);
		System.out.println(m1(5));
	}
	static int m1(int x) {
		if(x>=n) {
			//m1(x-1);
			return 0;
		}
		
		//System.out.println(x);
		return x+m1(x-1);
	}

}
/* note := 5,4,3,2,1
 * auto return
     1 
     2
     3
     4
     5
     
     
       
       
       
        */
 