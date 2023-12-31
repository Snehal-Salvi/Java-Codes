package recursion;
/*Check Number in Array
Send Feedback
Given an array of length N and an integer x, you need to find if x is present in the array or not. Return true or false.
Do this recursively.
Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Line 3 : Integer x
Output Format :
'true' or 'false'
Constraints :
1 <= N <= 10^3
Sample Input 1 :
3
9 8 10
8
Sample Output 1 :
true
Sample Input 2 :
3
9 8 10
2
Sample Output 2 :
false*/
import java.util.*;

public class CheckNumberinArray {

	public static boolean checkNumber(int[] arr, int x) {
	    return checkNumber(arr, x, 0);
	}

	private static boolean checkNumber(int[] arr, int x, int index) {
	    if (index == arr.length) {
	        return false;
	    }
	    if (arr[index] == x) {
	        return true;
	    }
	    return checkNumber(arr, x, index + 1);
	}
static Scanner s = new Scanner(System.in);

public static void main(String[] args) {
	int n = s.nextInt();
	int input[] = new int[n];
	for(int i = 0; i < n; i++) {
		input[i] = s.nextInt();
	}
	int x = s.nextInt();
	System.out.println(checkNumber(input, x));
}
}


