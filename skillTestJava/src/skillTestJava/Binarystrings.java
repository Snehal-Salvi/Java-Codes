package skillTestJava;
/*Binary strings with no consecutive 1s.
You have been given an integer K.
Your task is to generate all binary strings of length K such that there are no consecutive 1s in the string. This means that the binary string should not contain any instance of 1’s coming one after another.
A binary string is that string which contains only ‘0’ and ‘1’.
For Example:
Let ‘K=3’, hence the length of the binary string would be 3. We can have the following binary strings with no consecutive 1s:
000 001 010 100 101 
Note
1. Each string must be a binary string.
2. There should be no consecutive ‘1’ in the string.
3. Return an array/sequence of all the strings in an array in a lexicographically increasing order.
Input format:
The first line of input contains ‘T’ the number of test cases.

The first and only line of each test case contains a single integer K denoting the length of the binary string to be generated.
Output Format
For each test case, print all possible binary strings without consecutive ‘1’ of the length K in lexicographically increasing order. 
Note:
You don't need to print anything; it has already been taken care of. Just implement the given function.
Constraints:
1 <= T <= 10
0 <= K <= 22

Time limit: 1 second
Sample Input 1:
2
4
3
Sample Output 1:
0000 0001 0010 0100 0101 1000 1001 1010 
000 001 010 100 101 
Explanation of sample input 1:
Test case 1:

For K = 4 we get the following Strings:

0000 0001 0010 0100 0101 1000 1001 1010 

Note that none of the strings has consecutive 1s. Also, note that they are in a lexicographically increasing order.

Test case 2:

We can see that for K = 3 we get the following Strings:

000 001 010 100 101

Note that none of the strings has consecutive 1s. Also, note that they are in a lexicographically increasing order.
Sample Input 2:
2
2
5
Sample Output 2:
00 01 10
00000 00001 00010 00100 00101 01000 01001 01010 10000 10001 10010 10100 10101 */
import java.util.*;

public class Binarystrings {
	
	 public static ArrayList<String> generateString(int k) {
	        ArrayList<String> result = new ArrayList<>();
	        generate("", k, result);
	        return result;
	    }

	    private static void generate(String current, int remaining, ArrayList<String> result) {
	        if (remaining == 0) {
	            result.add(current);
	            return;
	        }

	        generate(current + "0", remaining - 1, result);
	        if (current.isEmpty() || current.charAt(current.length() - 1) == '0') {
	            generate(current + "1", remaining - 1, result);
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int t = scanner.nextInt();
	        
	        while (t-- > 0) {
	            int k = scanner.nextInt();
	            ArrayList<String> res = generateString(k);
	            
	            for (String str : res) {
	                System.out.print(str + " ");
	            }
	            
	            System.out.println();
	        }
	        
	        scanner.close();
	    }
	    
}
