package questions;
//check no is prime or not
import java.util.Scanner;

public class primeNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		boolean isPrime = true;
		
		if(n==0 || n== 1) {
			isPrime =false;
		}
		
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				isPrime = false;
				break;
			}
		}
		
		if(isPrime) {
			System.out.println("Prime no");
		}else {
			System.out.println("composite");
		}

	}

}
