package Recursion_programs;
import java.util.Scanner;

public class Sum_Of_Factorial_num {
	static int fact;
	public static void main(String[] args) {
		Sum_Of_Factorial_num obj=new Sum_Of_Factorial_num();
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number for factorial");
		System.out.println(obj.m1(input.nextInt()));
		//System.out.println("😂😂😂😂😂😂😂😂😂");
		
	}
	
	public int m1(int num) {
//        if(num==0) {   
//        	return 1;
//        	}
//        return num*m1(num-1);
		
	//===============================
		if(num==0) {
			return 1;
		}
		fact=fact*num;
		m1(num-1);
		
        return fact;
        
	}

}