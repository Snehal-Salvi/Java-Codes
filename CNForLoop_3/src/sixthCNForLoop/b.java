package sixthCNForLoop;
/*
 Nth Fibonacci Number
Send Feedback
Nth term of Fibonacci series F(n), where F(n) is a function, is calculated using the following formula -
    F(n) = F(n-1) + F(n-2), 
    Where, F(1) =  1, 
           F(2) = 1
Provided N you have to find out the Nth Fibonacci Number. 
Handle edges cases like when n=1 or n=2 by using conditionals like if else and return what's exprected.
Input Format :
The first line of each test case contains a real number ‘N’.
Output Format :
For each test case, print its equivalent Fibonacci number.
Constraints:
1 <= N <= 10000     
Where ‘N’ represents the number for which we have to find its equivalent Fibonacci number.

Time Limit: 1 second
Sample Input 1:
6
Sample Output 1:
8
Explanation
Now the number is ‘6’ so we have to find the “6th” Fibonacci number
So by using the property of the Fibonacci series i.e 

[ 1, 1, 2, 3, 5, 8, 13, 21]
So the “6th” element is “8” hence we get the output.
 */

import java.util.Scanner;
public class b {
	
	
	 public static void main (String args[]) 
	    { 
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         
         int a=0,b=1,c;
         c=a+b;
         for(int i=0;i<n;i++) {
        	
        	 a=b;
        	 b=c;
        	 c=a+b;
        	 }
         System.out.println(a);
         
	    }


	
//		static int fib(int n) 
//	    { 
//	    if (n <= 1) 
//	       return n; 
//	    return fib(n-1) + fib(n-2); 
//	    } 
//	       
//	    public static void main (String args[]) 
//	    { 
//	         Scanner sc=new Scanner(System.in);
//	          int n=sc.nextInt();
//	    System.out.println(fib(n)); 
	    
	    
	   
	    
	}


