import java.util.Scanner;
import java.util.Stack;
                                                                                                                                                    //Cho một string, nhiệm vụ của bạn là in chuỗi đảo ngược của string đó ra màn hình bằng cách dùng stack.
public class stack1 {
    public static void main(String args[]) {    
        Scanner scan = new Scanner(System.in);

        String inp = scan.nextLine();
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < inp.length(); i++) {
            char c = inp.charAt(i);
            stack.push(c);
        }
        for (int i = stack.size(); i > 0; i--) {
            System.out.print(stack.pop());
        }
    }}
