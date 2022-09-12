package Recursion_programs;
/*import javax.sound.midi.Soundbank;         non use part is not.
import org.w3c.dom.ls.LSOutput;*/

public class Factorial {
	static int fact=1;
//static int factnum=5;
	
	 int m1(int num) {
		
		//if(num<=num) {
			if(num==0) {
				 return 0;
			  }
		  fact=fact*num;
		  m1(num-1);
		 
		//}	
		return fact;
	}
	
	public static void main(String[] args) {
		Factorial obj=new Factorial();
		int num=5;
		System.out.println(" the factorial of "+num+" is " +obj.m1(num));			
	}
}
