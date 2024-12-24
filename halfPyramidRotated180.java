import java.util.Scanner;
public class halfPyramidRotated180 {
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            System.out.print("Enter the height of the pyramid...");
            int height=obj.nextInt();
            // Using the matrix index
            System.out.println("Method 1");
            // Outer Loop
            for(int i=1;i<=height;i++){
                // Inner Loop
                for(int j=1;j<=height;j++){
                    // Sum of index is greater than or equal to one more then height
                    if(j+i>=height+1){
                        System.out.print("* ");
                    } else{
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
            System.out.println("Method 2");
            for(int i=1;i<=height;i++){
                for(int j=height-1;j>=i;j--){
                    System.out.print("  ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
