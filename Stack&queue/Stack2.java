
import java.util.*;
//Binary
public class Stack2 {
	 public static void main(String[] args){
	        Stack<Integer> converter = new Stack<>();
	        Scanner sc = new Scanner(System.in);
	        int dec = sc.nextInt();
	        while ( dec != 0 ){
	            int Binaryvalue = dec % 2;
	            converter.push(Binaryvalue);
	            dec = dec/2;
	        }
	        String binary = new String();
	        while(converter.size()>0){
	            binary = binary + converter.pop().toString();
	        }
	        System.out.print(binary);
	        sc.close();
	    }
}
