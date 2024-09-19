/**
 * methodo
 */
public class methodo {

    public int add(int a, int b, int c) {
        return (a + b + c);
    }

    public int add(int a, int b) {
        return (a + b);
    }

    public static void main(String[] args) {

        methodo m = new methodo();
        int r2 = m.add(6, 4);
        int r3 = m.add(3, 5, 8);
        // in this we are using the same method with different parameters..
        System.out.println("the sum of two numbers" + r2);
        System.out.println("the sum of three numbers" + r3);

    }
}