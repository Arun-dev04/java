//wap to print all even numbers from 1 to 20 and their squares.
/**
 * loops
 */
public class loops {

    public static void main(String[] args) {
        int i, j;
        for (i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println("the number is  " + i);
                j = i * i;
                System.out.println("the square of the number is  " + j);

            } else {
            }
        }
    }
}