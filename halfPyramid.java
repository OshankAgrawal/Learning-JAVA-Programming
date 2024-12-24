import java.util.Scanner;
public class halfPyramid {
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            System.out.print("Enter the height of the pyramid...");
            int height=obj.nextInt();
            // Outer Loop
            for(int i=0;i<height;i++){
                // Inner Loop
                for(int j=0;j<=i;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
