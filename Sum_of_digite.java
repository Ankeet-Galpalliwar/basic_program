package Recursion_programs;

public class Sum_of_digite {
	static int m1(int num) {
		if(-9<=num && 9>=num) {
			return num;
		}
		return (num%10)+m1(num/10);
	}
	public static void main(String[] args) {
	
		System.out.println(m1(23));
	}

}

