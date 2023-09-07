import java.util.HashMap;

public class bai10 {
        public static void main(String[] args) {
            String S = "nguyenvandoanddd";
            Solution sol = new Solution();
            char firstRepChar = sol.firstRep(S);
            System.out.println(firstRepChar);
        }
        static class Solution
        {
        char firstRep(String S)
        {
            int n = S.length();
            HashMap<Character,Integer> hm = new HashMap<>();
            for (int i = 0; i < n; i++) {
                char c = S.charAt(i);
                if (!hm.containsKey(c)) {
                    hm.put(c, 1);
                } else {
                    hm.put(c, hm.get(c) + 1);
                }
            }
            for (int i = 0; i < n; i++) {
                char c = S.charAt(i);
                if (hm.get(c) > 1) {
                    return c;
                }
            }
            return '#';
        }
        }
}
