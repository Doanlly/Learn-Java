package Home11;

public class Bai5 {
	int[] map;
    public int get(int key) {
        return map[key]-1;
    }
    public void remove(int key) {
        map[key] = 0;
    }
    public Bai5() {
        map = new int[1000000+1];
    }
    
    public void put(int key, int value) {
        map[key] = value+1;
    }
    

    public static void main(String[] args) {
		Bai5 map = new Bai5();
		map.put(1, 0);
	    map.put(2, 10);
	    map.put(3, 30);
	    map.put(4, 40);
	    System.out.println("Value  1: " + map.get(1));
	    System.out.println("Value  2: " + map.get(2));
	    System.out.println("Value 3: " + map.get(3));
	    System.out.println("Value  4: " + map.get(4));
	    map.remove(2);
	    map.remove(4);
	    System.out.println("Value  2 after removing: " + map.get(2));
	    System.out.println("Value  4 after removing: " + map.get(4));
	}
	
}
