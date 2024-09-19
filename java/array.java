import java.lang.Math;

public class array {
    public static void main(String[] args) {
        int num[][] = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                num[i][j] = (int) (Math.random() * 100);
                System.out.print(num[i][j] + "\t");
            }
            System.out.print("\n");
        }

        int a = num.length;// lenght of array
        System.out.println("Size of array:\t" + a);
    }
}
