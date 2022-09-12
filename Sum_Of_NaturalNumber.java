package Recursion_programs;

public class Sum_Of_NaturalNumber {
	public static void main(String[] args) {
	
		System.out.println(m1(5));
	}
	static int m1(int num) {
		if(num==0)
			return 0;
		return num+m1(num-1);
			
	}

}
