import java.util.Scanner;
public class palindromicNumberPyramid {
    public static void main(String args []){
        try (Scanner obj = new Scanner(System.in)) {
            System.out.print("Enter the number of rows...");
            int row=obj.nextInt();
            for(int i=row;i>=1;i--){
                for(int j=i;j>1;j--){
                    System.out.print("  ");
                }
                for(int j=row-i+1;j>=1;j--){
                    System.out.print(j+" ");
                }
                for(int j=2;j<=row-i+1;j++){
                    System.out.print(j+" ");
                }
                System.out.println();
            }
        }
    }
}
