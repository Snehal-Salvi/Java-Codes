package recursionQue;
/*Check AB
Send Feedback
Suppose you have a string, S, made up of only 'a's and 'b's. Write a recursive function that checks if the string was generated using the following rules:
a. The string begins with an 'a'
b. Each 'a' is followed by nothing or an 'a' or "bb"
c. Each "bb" is followed by nothing or an 'a'
If all the rules are followed by the given string, return true otherwise return false.
Input format :
String S
Output format :
'true' or 'false'
Constraints :
1 <= |S| <= 1000
where |S| represents length of string S.
Sample Input 1 :
abb
Sample Output 1 :
true
Sample Input 2 :
abababa
Sample Output 2 :
false
Explanation for Sample Input 2
In the above example, a is not followed by either "a" or "bb", instead it's followed by "b" which results in false to be returned.*/
import java.util.*;

public class CheckAB {

	public static boolean checkAB(String str) {
		if(str.length()==0) {
			return true;
		}
		
		if(str.charAt(0)=='a') {
			if(str.substring(1).length()>1 && str.substring(1, 3).equals("bb")) {
				return checkAB(str.substring(3));
			}else {
				return checkAB(str.substring(1));
			}
		}
		
		return false;

	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		System.out.println(checkAB(input));
	}
}
