import java.io.*;
import java.util.*;
import java.lang.*;

class minHeapNode {
    char data;
    int freq;
    minHeapNode left, right;
    minHeapNode(char data, int freq){
        left = right = null;
        this.data = data;
        this.freq = freq;
    }
}

class heapComparator implements Comparator<minHeapNode> {
    public int compare(minHeapNode h1, minHeapNode h2) { 
        if (h1.freq < h2.freq) {
            return 1;
        } else if (h1.freq > h2.freq) {
            return -1;
        }
        return 0; 
    } 
} 

class humman {
    
    static PriorityQueue<minHeapNode> heapq;
    
    static HashMap<Character, Integer> freqMap = new HashMap<>();
    static HashMap<Character, String> codes = new HashMap<>();
    
    static void storeCodes(minHeapNode root, String str) {
        if(root==null)return;
        if(root.data != '$')codes.put(root.data, str);
        storeCodes(root.left, str + "0");
        storeCodes(root.right, str + "1");
    }
    
    static void encodeString(String str){
        freqMap = new HashMap<>();
        codes = new HashMap<>();
        heapq = new PriorityQueue<>(new heapComparator());
        for (int i=0; i<str.length(); i++) { 
            Integer j = freqMap.get(str.charAt(i)); 
            freqMap.put(str.charAt(i), (j == null) ? 1 : j + 1); 
        } 
        minHeapNode left, right, top;
        for (Map.Entry<Character, Integer> val:freqMap.entrySet()) {
            heapq.add(new minHeapNode(val.getKey(), val.getValue()));
        }
        while (heapq.size() != 1) {
            left = heapq.poll();
            right = heapq.poll();
            top = new minHeapNode('$', left.freq + right.freq);
            top.left = left;
            top.right = right;
            heapq.add(top);
        }
        storeCodes(heapq.peek(), "");
        System.out.println("Character\tFrequency\tHuffman Code");
        for (Map.Entry<Character, String> val:codes.entrySet()) {
            System.out.println(val.getKey() + "\t\t" + freqMap.get(val.getKey()) + "\t\t" + val.getValue());
        }
    }
    static void calcFreq(String str) {
        for (int i=0; i<str.length(); i++) { 
            Integer j = freqMap.get(str.charAt(i)); 
            freqMap.put(str.charAt(i), (j == null) ? 1 : j + 1); 
        } 
    }
    static String decodeString(minHeapNode r, String e){
        // Code here
         String s= "";
        minHeapNode k=r;
        for(int i=0; i< e.length(); i++){
            if(e.charAt(i)=='0') k=k.left;
            if(e.charAt(i)=='1') k=k.right;
            if(k.data!='$'){
                s=s+k.data;
                k=r;
            }
        }
        return s;
}
    public static void main(String[] args) throws IOException{
        // String str = "abcabc";
        // encodeString(str);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc=new Scanner(System.in);
    System.out.print("Enter encoded string: ");
    String encodedStringg = sc.next();
    encodeString(encodedStringg);
    String str = br.readLine().trim();
    for(int i=0; i<str.length(); i++){
        encodedStringg+=codes.get(str.charAt(i));
    }
    String decodedString = decodeString(heapq.peek(), encodedStringg);
    System.out.println("Decoded string: " + decodedString);

        }
    
     // see the main function for the minHeapNode reference
    
}