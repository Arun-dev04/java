import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        int i,j,k;
        int a[][] =new int[3][3];
        int b[][] =new int[3][3];
        int c[][] =new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element of matrix 1");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                a[i][j]= sc.nextInt();
            }
        }
        System.out.println("Enter the element of matrix 2");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                b[i][j]= sc.nextInt();
            }
        }
        System.out.println("Matrix 1");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
            System.out.print(" "+a[i][j]);
        }
        System.out.println("");
    }
    System.out.println("Matrix 2");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
            System.out.print(" "+b[i][j]);
        }
        System.out.println("");
    }
    System.out.println("multiplication of matrix");
    for(i=0;i<3;i++){
        for(j=0;j<3;j++){
            c[i][j]=0;
            for(k=0;k<3;k++){
                c[i][j]=c[i][j]+a[i][k]*b[k][j];
                
            }
            System.out.print(" "+ c[i][j]);
        }
        System.out.println("");
    }
    }
}
