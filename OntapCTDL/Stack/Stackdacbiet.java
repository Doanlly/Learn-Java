package OntapCTDL.Stack;
import java.util.Stack;
public class Stackdacbiet extends Stack<Integer> {
    //Tất cả các hoạt động này của SpecialStack phải là O(1)
    //Giải pháp:
    //Sử dụng hai ngăn xếp: một để lưu trữ các phần tử ngăn xếp thực tế và ngăn xếp còn lại 
    //làm ngăn xếp phụ trợ để lưu trữ các giá trị tối thiểu. 
    //Ý tưởng là thực hiện các thao tác push() và pop() sao cho
    // đỉnh của ngăn xếp phụ trợ luôn là mức tối thiểu. 
    Stack<Integer> min = new Stack<Integer>();
    void push(int x){
        if(isEmpty() ==true){
            super.push(x);
            min.push(x);
        }
        else{
            super.push(x);
            int y = min.pop();
            min.push(y);
            if (x < y)
                min.push(x);
            else
                min.push(y);
        }
    } 
    public Integer pop()
    {
        int x = super.pop();
        min.pop();
        return x;
    }
  
    /* SpecialStack's member method to get 
minimum element from it. */
    int getMin()
    {
        int x = min.pop();
        min.push(x);
        return x;
    }

    public static void main(String[] args) {
        Stackdacbiet s = new Stackdacbiet();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.getMin());
        s.push(5);
        System.out.println(s.getMin());
    }
}
