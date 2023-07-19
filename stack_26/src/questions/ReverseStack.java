package questions;
import java.util.*;
/*Reverse Stack
Send Feedback
You have been given two stacks that can store integers as the data. Out of the two given stacks, one is populated and the other one is empty. You are required to write a function that reverses the populated stack using the one which is empty.
For Example:
Alt txt

Input Format :
The first line of input contains an integer N, denoting the total number of elements in the stack.

The second line of input contains N integers separated by a single space, representing the order in which the elements are pushed into the stack.
Output Format:
The only line of output prints the order in which the stack elements are popped, all of them separated by a single space. 
Note:
You are not required to print the expected output explicitly, it has already been taken care of. Just make the changes in the input stack itself.
Constraints:
1 <= N <= 10^3
-2^31 <= data <= 2^31 - 1

Time Limit: 1sec 
Sample Input 1:
6
1 2 3 4 5 10
Note:
Here, 10 is at the top of the stack.
Sample Output 1:
1 2 3 4 5 10
Note:
Here, 1 is at the top of the stack.
Sample Input 2:
5
2 8 15 1 10
Sample Output 2:
2 8 15 1 10*/
public class ReverseStack {
	
	public static void reverseStack(Stack<Integer> input, Stack<Integer> extra) {
		 if (input.size()==0 || input.size()==1)
		        {
		            return;
		        }
		        
		        int top=input.pop();
		        reverseStack(input,extra);
		        
		        while(!input.isEmpty())
		        {
		            extra.push(input.pop());
		        }
		        input.push(top);
		        
		        while(!extra.isEmpty())
		        {
		            input.push(extra.pop());
		        }
			}
		

	
    public static Stack<Integer> takeInput() 
    {
        Scanner sr = new Scanner(System.in);
        
    	int size = sr.nextInt();
    	Stack<Integer> input = new Stack<>();

    	if (size == 0) 
    	{
    		return input;
    	}

    	for(int i = 0; i < size; i++) 
    	{
    	    int var = sr.nextInt();
    		input.push(var);
    	}

    	return input;
    }

    public static void main(String[] args) 
    {
    	Stack<Integer> input = takeInput();
    	Stack<Integer> empty = new Stack<>();

    	reverseStack(input, empty);

    	while(!input.isEmpty()) 
    	{
    		System.out.print(input.pop() + " ");
    	}

    }
}