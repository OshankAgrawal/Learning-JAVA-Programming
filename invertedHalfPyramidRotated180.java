import java.util.Scanner;
public class invertedHalfPyramidRotated180 {
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            System.out.print("Enter the depth of the pyramid...");
            int depth=obj.nextInt();
            // Outer Loop
            for(int i=0;i<depth;i++){
                // Inner Loop => used for printing the spaces
                for(int j=0;j<=i;j++){
                    System.out.print("  ");
                }
                // Inner Loop => used for printing the pyramid
                for(int j=depth;j>i;j--){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
