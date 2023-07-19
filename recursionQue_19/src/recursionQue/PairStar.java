package recursionQue;
/*Pair Star
Send Feedback
Given a string S, compute recursively a new string where identical chars that are adjacent in the original string are separated from each other by a "*".
Input format :
String S
Output format :
Modified string
Constraints :
0 <= |S| <= 1000
where |S| represents length of string S.
Sample Input 1 :
hello
Sample Output 1:
hel*lo
Sample Input 2 :
aaaa
Sample Output 2 :
a*a*a*a*/

import java.util.*;

public class PairStar {

	 public static String addStars(String str) {

	        if (str.length()<=1) return str;

	        if (str.charAt(0) == str.charAt(1))
	            return str.charAt(0) + "*" + addStars(str.substring(1));


	        return str.charAt(0) + addStars(str.substring(1));
	    }

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(addStars(input));
	}
}