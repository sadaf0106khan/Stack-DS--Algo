package stack;

import java.util.Scanner;
import java.util.Stack;

public class BracketsMatchingProblem {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Brackets String");
		String str=sc.next();
		System.out.println(bracketMatching(str));
	}
		
		   public boolean isValid(String str) {
        Stack<Character> stack=new Stack<Character>();
		char c;
		boolean res=false;
		for(int i=0;i<str.length();i++) {
			c=str.charAt(i);
			if(c=='{' || c=='['||c=='(') {
				stack.push(c);
			}
			else if(c=='}' || c==']'||c==')')  {
				if(stack.isEmpty()) {
					
					return res=false;
				}
				else{
					  if(stack.peek()=='['&&c==']')
				      		 stack.pop();
					
                 			  else if(stack.peek()=='{'&&c=='}')
                      			 	 stack.pop();
					
                			  else if(stack.peek()=='('&&c==')')
                    			   	 stack.pop();
                    
                   			  else if(stack.peek()=='{'&&c!='}')
                     				  return false;
                    
                   			  else if(stack.peek()=='('&&c!=')')
                     			 	 return false;
                    	
                    			 else if(stack.peek()=='['&&c!=']')
                     			 	 return false;
				}
                    
                
			}
		}
		if(!stack.isEmpty()) {
			return false;
		}
		return true;
    }

	
}

