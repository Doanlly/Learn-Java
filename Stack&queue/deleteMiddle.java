//{ Driver Code Starts
//Initial template for Java

import java.io.*;
import java.util.*;

class deleteMidle {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        
        while(t-->0)
        {
            int sizeOfStack =sc.nextInt();
            Stack <Integer> myStack=new Stack<>();
            
            //adding elements to the stack
            for(int i=0;i<sizeOfStack;i++)
            {
                int x=sc.nextInt();
                myStack.push(x);
                
            }
                Solution obj=new Solution();
                obj.deleteMid(myStack,sizeOfStack);
                
                while(!myStack.isEmpty())
                {
                    System.out.print(myStack.peek()+" ");
                    myStack.pop();
                }
                System.out.println();
        }
        
        
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution

{

    //Function to delete middle element of a stack.

    public void deleteMid(Stack<Integer>s,int sizeOfStack){

        Stack<Integer>st=new Stack<>();

        if(sizeOfStack%2==0){

            for(int i=0;i<sizeOfStack/2;i++){

                st.push(s.pop());

            }

        }

        else{

            for(int i=0;i<(sizeOfStack-1)/2;i++){

                st.push(s.pop());

            }

        }

        s.pop();

        while(!st.isEmpty()){

            s.push(st.pop());

        }

    } 
}