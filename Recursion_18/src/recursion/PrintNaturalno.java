package recursion;

import java.util.Scanner;

public class PrintNaturalno {
	
	public static void print(int n) {
		
		if(n==0) {
			return;
		}
		
		print(n-1);
		System.out.print(n+" ");
		
		
//		to print reverse
//		System.out.print(n+" ");
//		print(n-1);
	}

	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		print(n);
		

	}
}
