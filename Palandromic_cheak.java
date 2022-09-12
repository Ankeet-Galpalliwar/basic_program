 package Recursion_programs;

public class Palandromic_cheak {
	public static void main(String[] args) {
		String str="mom";		
		System.out.println(ispalandrom(str));	
	}
	static boolean ispalandrom(String str,int f,int l) {
		if(l<=f)
			return true;
		if(str.charAt(f)!=str.charAt(l))
			return false;
		
		
		return ispalandrom(str,f+1,l-1);
	}
	static boolean ispalandrom(String str) {
		int f=0;
		int l=str.length()-1;
		return ispalandrom(str,f,l);
	}

}
