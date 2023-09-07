import java.util.*;
public class FormulaEval {

	public double eval(String formula)
	{
		
	    String[] tokens = formula.split(" ");
        
       Stack<Double> sh = new Stack<Double>();
        Stack<String> os = new Stack<String>();
        //duyệt các phần tử trong biểu thức
        if(tokens.length == 1) {
            return Double.parseDouble(tokens[0]);
        }
        for (int i = 0; i < tokens.length; i++) {
            //nếu là toán hạng thì đẩy vào stack toán hạng
            if (tokens[i].equals("(")) {
                continue;
            }
            if (tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")) {
                os.push(tokens[i]);
            } else if (tokens[i].equals(")")) {
                double y = sh.pop();
                double x = sh.pop();
                String o = os.pop();
                double r = 0;
                if (o.equals("+")) {
                    r = x + y;
                } else if (o.equals("-")) {
                    r = x - y;
                } else if (o.equals("*")) {
                    r = x * y;
                } else if (o.equals("/")) {
                    r = x / y;
                }
                sh.push(r);
            } else {
                sh.push(Double.parseDouble(tokens[i]));
            }
        }
        return sh.pop();
	}

	
}