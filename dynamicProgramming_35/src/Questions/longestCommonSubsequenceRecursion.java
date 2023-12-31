package Questions;
/*LCS - Problem
Send Feedback
Given two strings, 'S' and 'T' with lengths 'M' and 'N', find the length of the 'Longest Common Subsequence'.
For a string 'str'(per se) of length K, the subsequences are the strings containing characters in the same relative order as they are present in 'str,' but not necessarily contiguous. Subsequences contain all the strings of length varying from 0 to K.
Example :
Subsequences of string "abc" are:  ""(empty string), a, b, c, ab, bc, ac, abc.
Input format :
The first line of input contains the string 'S' of length 'M'.

The second line of the input contains the string 'T' of length 'N'.
Output format :
Return the length of the Longest Common Subsequence.
Constraints :
0 <= M <= 10 ^ 3
0 <= N <= 10 ^ 3

Time Limit: 1 sec
Sample Input 1 :
adebc
dcadb
Sample Output 1 :
3
Explanation of the Sample Output 1 :
Both the strings contain a common subsequence 'adb', which is the longest common subsequence with length 3. 
Sample Input 2 :
ab
defg
Sample Output 2 :
0
Explanation of the Sample Output 2 :
The only subsequence that is common to both the given strings is an empty string("") of length 0.*/
public class longestCommonSubsequenceRecursion {

	public static int lcs (String str1, String str2, int i, int j) {

		if(i==str1.length() ||  j==str2. length()) {
			return 0;
		}

		int myAns;
		if(str1.charAt(i) == str2.charAt(j)) {


			int smallAns = lcs(str1,str2, i+1, j+1);
			myAns = 1 + smallAns;

		}else{

			int ans1 = lcs(str1, str2, i+1,j);
			int ans2 = lcs(str1, str2, i, j+1);
			myAns = Math.max (ans1, ans2);

		}

		return myAns;
	}
	
	
	public static void main(String [] args) {

		String str1 = "bedgmc";
		String str2 = "abdfglc";

		int ans = lcs(str1, str2,0,0);
		System.out.println(ans);

	}

}
