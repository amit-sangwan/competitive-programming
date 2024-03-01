package easy;

public class Swap {
    public static void main(String[] args) {

        int x = 5;
        int y = 15;

        y = y - x;
        x = x + y;
        y = x - y;

        System.out.println("x after swap: " + x); // Should print 15
        System.out.println("y after swap: " + y); // Should print 5
    }
}
