import java.util.HashMap;

public class bai6 {
    public static void main(String[] args) {
        //Lớp Solution chứa phương thức findDiff nhận đầu vào là một mảng số nguyên và độ dài của mảng và trả về hiệu số giữa số lượng lần xuất hiện nhiều nhất và ít nhất của các phần tử trong mảng đầu vào.
        long arr[] = {7, 8, 4, 5, 4, 1, 1, 7, 7, 2, 5};
        Solution sol = new Solution();
        long diff = sol.findDiff(arr, arr.length);
        System.out.println(diff);
    }
    public static class Solution {
    // Lớp Solution chứa phương thức findDiff nhận đầu vào là một mảng số nguyên và độ dài của mảng và trả về hiệu số giữa số lượng lần xuất hiện nhiều nhất và ít nhất của các phần tử trong mảng đầu vào.
        public long findDiff(long arr[], long n)
        {
            HashMap<Long,Integer> hm = new HashMap<>();
            for(long i:arr){
                hm.put(i,hm.getOrDefault(i,0)+1);
            }
            long mini=hm.get(arr[0]);
            long maxi=0;
            for(Integer i:hm.values()){
                mini=Math.min(mini,i);
                maxi=Math.max(maxi,i);
            }
            return maxi-mini;
        }
    
    }
}
