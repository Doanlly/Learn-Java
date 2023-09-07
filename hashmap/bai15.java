public class NonRepeatingEle {
    public static int firstNonRepeatingElement(int[] arr) {
        int[] freq = new int[20001];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i] + 10000]++;
        }
    
        for (int i = 0; i < arr.length; i++) {
            if (freq[arr[i] + 10000] == 1) {
                return arr[i];
            }
        }
    
        return 0; 
    
    public static void main(String[]args){
        int[] arr = {-4, 2, -1, 3, 2};
        int result = firstNonRepeatingElement(arr);
        System.out.println(result); 

    }
}
