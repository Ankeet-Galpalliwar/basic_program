package Recursion_programs;

public class Digits_preseant {
     public static void main(String[] args) {
		System.out.println(m1(1112)); 
	}
     static int m1(int num) {
    	    	 if(num>=-9&&num<=9) {
    		 return num;
    	 }
    	 return (num%10)+m1(num/10);
     }
}

