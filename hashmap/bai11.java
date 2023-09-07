import java.util.HashMap;

public class CountChar{
    public static int countCharsWithNOccurrences(String s, int N) {
        HashMap<Character, Integer> countMap = new HashMap<>();
        int consecutiveCount = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
    
            if (i == 0 || c != s.charAt(i - 1)) {
                consecutiveCount = 1;
            } else {
                consecutiveCount++;
            }
    
            if (consecutiveCount == N) {
                countMap.put(c, countMap.getOrDefault(c, 0) + 1);
            }
        }
        return countMap.size();
    }
    
    public static void main(String[] args) {
        String s = "doan";
        int N = 1;
        int count = countCharsWithNOccurrences(s, N);
        System.out.println(count);  
    }
}