import java.util.Scanner;
public class diamondPattern {
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            System.out.print("Enter the number of rows in the diamond...");
            int rows=obj.nextInt();
            // Upper half
            for(int i=rows;i>=1;i--){
                for(int j=i-1;j>=1;j--){
                    System.out.print("  ");
                }
                for(int j=1;j<=rows-i+1;j++){
                    System.out.print("* ");
                }
                for(int j=1;j<=rows-i;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
            // Lower Half
            for(int i=1;i<rows;i++){
                for(int j=0;j<i;j++){
                    System.out.print("  ");
                }
                for(int j=rows;j>i;j--){
                    System.out.print("* ");
                }
                for(int j=rows-1;j>i;j--){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
