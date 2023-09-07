import java.util.*;

class driverclass
{
    // Driver Code
    static class FastReader{ 
        Scanner sc; 
  
        public FastReader(){ 
            sc = new Scanner(System.in); 
        } 
  
        String next(){ 
            return sc.next(); 
        } 
  
        String nextLine(){ 
            return sc.nextLine(); 
        } 

        Integer nextInt(){
            return sc.nextInt();
        }
        
        Long nextLong(){
            return sc.nextLong();
        }
    }
    
	public static void main(String args[])
	{
		FastReader sc = new FastReader();
		int t = sc.nextInt();
		
		while(t>0)
		{
			int n = sc.nextInt();
			long arr[] = new long[n];	
			for(int i=0; i<n; i++)
				arr[i] = sc.nextLong();
		    System.out.println(minCost(arr, n));
		    t--;
		}}
        public static long minCost(long arr[], int n) {
          PriorityQueue<Long> pq = new PriorityQueue<>();
            for(long x:arr) pq.add(x);
            long res = 0;
            while (pq.size() > 1) {
                // Extract shortest two ropes from pq
                long first = pq.poll();
                long second = pq.poll();
                res +=(long)(first + second);
                pq.add(first + second);
            }
            return res; }
    
}
// } Driver Code Ends



