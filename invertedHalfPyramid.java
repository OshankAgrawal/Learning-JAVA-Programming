import java.util.Scanner;
public class invertedHalfPyramid {
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            System.out.print("Enter the depth of the pyramid...");
            int depth=obj.nextInt();
            System.out.println("Method 1");
            // Outer Loop
            for(int i=depth;i>0;i--){
                // Inner Loop
                for(int j=i;j>0;j--){
                    System.out.print("* ");
                }
                System.out.println();
            }
            // Using the matrix index
            System.out.println("Method 2");
            // Outer Loop
            for(int i=1;i<=depth;i++){
                // Inner Loop
                for(int j=1;j<=depth;j++){
                    // Sum of index is less than or equal to one more then depth
                    if(i+j<=depth+1){
                        System.out.print("* ");
                    }
                }
                System.out.println();
            }
        }
    }
}
