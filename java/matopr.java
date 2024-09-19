
import java.util.Scanner;

/**
 * matopr
 */
public class matopr {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter value of a");
        int a = s.nextInt();
        System.out.println("Enter Value of b");
        int b = s.nextInt();
        // int a = 60;
        // int b = 20;
        System.out.println("***Results***");
        System.out.println("value of a+b");
        int c = a + b;
        System.out.println(c);
        System.out.println("value of a-b");
        int d = a - b;
        System.out.println(d);
        System.out.println("value of a*b");
        int e = a * b;
        System.out.println(e);
        System.out.println("value of a/b");
        int f = a / b;
        System.out.println(f);
        System.out.println("value of a%b");
        int g = a % b;
        System.out.println(g);

    }
}