import java.util.Scanner;

public class condition {

    public static void main(String[] args) {
        try (Scanner Sc = new Scanner(System.in)) {
            System.out.println("Enter the marks of Student");
            int a = Sc.nextInt();
            if (a < 40)
                System.out.println("Fail");
            else if (a < 50)
                System.out.println("3rd division");
            else if (a < 60)
                System.out.println("2nd division");
            else
                System.out.println("1st division");
        }

    }
}
