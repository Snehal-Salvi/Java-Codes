package questions;

import java.util.Scanner;

public class leapYear {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int year;
		
		System.out.println("enter Year");
		year=sc.nextInt();


		if(year %400 == 0) {
			System.out.println("Leap Year ");
		}else if(year %100 == 0 ) {
			System.out.println("Not Leap Year");
		}else if(year % 4 == 0) {
			System.out.println("Leap Year ");
		}else {
			System.out.println(" Not Leap Year ");
		}
	}
}
