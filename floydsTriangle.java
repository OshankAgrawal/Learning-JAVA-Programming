import java.util.Scanner;
public class floydsTriangle {
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            System.out.print("Enter the number of rows of triangle...");
            int rows=obj.nextInt();
            int number=1;
            for(int i=1;i<=rows;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(number+" ");
                    number++;
                }
                System.out.println();
            }
        }
    }
}
