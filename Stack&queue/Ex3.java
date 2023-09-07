
public class Ex3 {

  int top;
	int arr[] = new int[1000];

	Ex3()
	{
		top = -1;
	}
	
	//Function to push an integer into the stack.
    void push(int a){

        if(top==arr.length-1){

            return;

   }

        top++;

           arr[top]=a;

    }

       //Function to remove an item from top of the stack.

    int pop()

    {

           // Your code here

           if(top==-1){

               return -1;

           }

          int a=arr[top];

           top--; //popping out the element

           return a;

    }
	
}

