/*  

Problem :

Given a string expression which consists only ‘}’ and ‘{‘. The expression may not be balanced. You need to find the minimum number of bracket reversals which are required to make the expression balanced.
Return -1 if the given expression can't be balanced.

*/

import java.util.Stack;
public class Solution {

	
	// Function returns -1 if brackets can't be balanced
	public static int countBracketReversals(String input){
		
		    Stack<Character> s1=new Stack<Character>();
      
             if ((input.length())%2!=0){
               return -1;
             }
		 for (int i=0;i<input.length();i++){
      
                 
                 if (input.charAt(i)=='{'){
                   
                   s1.push(input.charAt(i));
                 }
                
               else if (!s1.isEmpty() && s1.peek()=='{'){
                 s1.pop();
                     }    
       
               else  {
                 s1.push(input.charAt(i));
               }
             }
	 int count=0;
      while (!s1.isEmpty()){
        char c1=s1.pop();
       char c2=s1.pop();
        
        if (c1!=c2 ){
          
       
          count=count+2;
        }


