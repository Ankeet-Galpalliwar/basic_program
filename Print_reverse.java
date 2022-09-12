package Recursion_programs;
                                                                                                                           
public class Print_reverse {
	public static void main(String[] args) {
		m1(5);
	}
	static void m1(int x) {
		if(x<0) {
			return;
		}
		System.out.print(x+" ");
		
		m1(x-1);
			      		
	}

}
    /*
    note:=5,4,3,2,1,*0
      
    */
