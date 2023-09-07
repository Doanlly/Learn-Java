

public class a {
    public static void printMessage() {
        System.out.println("Hello!");
    }

    public static int printMessage(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        printMessage();
        System.out.println(printMessage(2,3));
    }
}
