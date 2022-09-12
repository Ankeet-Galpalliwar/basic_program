package Recursion_programs;
import java.util.Scanner;
public class Array_index_no {
	public static void main(String[] args) {
		int[] arr={89,99,52,65,45,52};
		System.out.print("array :=");
		for(int num:arr) {
			System.out.print(num+" ");
		}
		System.out.println();
		System.out.println("enter the number");
		Scanner in=new Scanner(System.in);
		int no=in.nextInt();
		int cheak=search(arr, no);
		
		if(cheak==-1)
			System.out.println(no+" not preseant in Array....!");
		else
		    System.out.println(no+" preseant in "+cheak+" index.....!");  
		
		
	}
	
	static int search(int arr[],int no) {
		int index=(arr.length)-1;
		return search(arr, no, index);
		
		
	}
	static int search(int arr[],int no,int index) {
	
		if ((arr[index])==no) {
			return index;
		}
		else if( index<=0)		   
			 return -1;
		
		return search(arr, no, index-1);
		
	}

}
