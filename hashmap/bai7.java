import java.util.*;

public class bai7 {
    public static void main(String[] args) {
        int N = 5;
        int K = 2;
        //Ví dụ, nếu ta có mảng arr = {1, 1, 2, 5, 1} và K = 2, thì ta có thể chia mảng thành hai nhóm (1, 1, 2, 5) và (1), và mỗi nhóm đều chứa các phần tử xuất hiện cùng số lượng lần, do đó hàm trả về giá trị 1.
        int[] arr = {1, 1, 2, 5, 1};
        int result = isPossible(N, arr, K);
        System.out.println(result);
    }
    //Hàm nhận vào ba tham số: N là kích thước của mảng arr, arr là mảng các số nguyên và K là số lượng nhóm mà ta cần chia mảng arr thành.
    public static int isPossible(int N, int[] arr, int K) {
        HashMap<Integer,Integer> mp = new HashMap<Integer,Integer>();
        for(int i=0;i<N;i++) {
            if (mp.containsKey(arr[i])) {
                mp.put(arr[i], mp.get(arr[i])+1);
            } else {
                mp.put(arr[i], 1);
            }
        }
        for(Map.Entry<Integer,Integer> entry : mp.entrySet()) {
            int count = entry.getValue();
            if (count%2 == 0 && count/2 > K) {
                return 0;
            } else if (count%2 != 0 && (count/2)+1 > K) {
                return 0;
            }
        }
        return 1;
    }
}
