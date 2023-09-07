
import java.util.*;
public class encodeStack {
	public static void main(String[] args){
        Stack<Character> code = new Stack<>();
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        int count = 1;
        String s2 = "";
        for (int idx = 1; idx < s1.length(); idx++ ){
            if (s1.charAt(idx) == s1.charAt(idx-1)){
                code.push(s1.charAt(idx));
                count++;
            }else{
                s2 += s1.charAt(idx-1);
                s2 += count;
                count = 1;
                code.push(s1.charAt(idx));
                if (idx + 1 == s1.length() ){
                    s2 += s1.charAt(idx);
                    s2 += count;
                }
            }
        }   
        System.out.print(s2); 
        sc.close();
    }    
}
