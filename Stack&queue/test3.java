import java.util.LinkedList;
import java.util.Queue;
public class test3 {
    static Queue<Integer> q;
    public test3() {
        Queue<Integer> a = new LinkedList<>();
        q = a;
    }
    public static int ping(int t) {
        q.add(t);
        while(q.peek()<t-3000){
            q.poll();
        }
        return q.size();
    }
    public static void main(String[] args) {
        test3 test = new test3();
        System.out.println(test.ping(1)); // output should be 1
        System.out.println(test.ping(100)); // output should be 2
        System.out.println(test.ping(3001)); // output should be 3
        System.out.println(test.ping(3002)); // output should be 3
    }
}