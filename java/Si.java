import java.util.Scanner;

/**
 * Si
 */
class Si {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principal amount");
        int a = sc.nextInt();
        System.out.println("Enter Rate");
        int r = sc.nextInt();
        System.out.println("Enter time period");
        int t = sc.nextInt();
        int si;
        si = a * r * t;
        si = si / 100;
        System.out.println("The Simpl;e intersest is");
        System.out.println(si);

    }
}