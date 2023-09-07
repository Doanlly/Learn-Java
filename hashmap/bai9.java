import java.util.HashMap;

public class bai9 {
   
        public static void main(String[] args) {
            String S = "NguyenVanDOan";
            char ch = Solution.nonrepeatingCharacter(S);
            System.out.println(ch);
        }
    static class Solution
{   
    //Function to find the first non-repeating character in a string.
        static char nonrepeatingCharacter(String S)
    {
        Character ch = Character.MIN_VALUE;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<S.length();i++)
        {
            if(map.containsKey(S.charAt(i)))
            {
                int of = map.get(S.charAt(i));
                int nf = of+1;
                map.put(S.charAt(i),nf);
            }
            else{
                map.put(S.charAt(i),1);
            } }
        //Vòng lặp thứ hai sẽ duyệt qua từng ký tự trong chuỗi, nếu số lần xuất hiện của ký tự đó trong HashMap là 1, ký tự đó sẽ được gán cho biến ch và trả về.
        for(int i =0;i<S.length();i++)
        {
            if(map.get(S.charAt(i))==1)
            {
                ch = S.charAt(i);
                return ch;
            }
        }
        //Nếu không tìm thấy ký tự nào không lặp lại trong chuỗi, hàm sẽ trả về '$'.
        return '$';
    }
}
    
}
