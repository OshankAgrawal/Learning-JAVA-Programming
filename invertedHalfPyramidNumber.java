import java.util.Scanner;
public class invertedHalfPyramidNumber {
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            System.out.print("Enter the depth of the pyramid...");
            int depth=obj.nextInt();
            for(int i=depth;i>0;i--){
                for(int j=1;j<=i;j++){
                    System.out.print(j+" ");
                }
                System.out.println();
            }
        }
    }
}
