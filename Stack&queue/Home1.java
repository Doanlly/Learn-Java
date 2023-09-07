
import java.util.*;
public class Home1 {
	
	public static void main(String[] args) {
		Stack<Character> stack = new Stack<Character>();
		Scanner sc = new Scanner(System.in);
		System.out.print("Hay nhap ket qua dau vao: ");
		String s_1 = sc.nextLine();
		
		for(int i =0; i < s_1.length(); i++) {
			char c = s_1.charAt(i);
			stack.push(c);
		}
		String s_2 = "";
		for (int i =0; i< s_1.length(); i++) {
			s_2 = s_2 + stack.pop();
		}

		System.out.print("ket qua: " + s_2);
		sc.close();

		 
	}
	
	
}
