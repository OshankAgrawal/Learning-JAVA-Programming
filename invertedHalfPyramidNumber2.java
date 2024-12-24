import java.util.Scanner;
public class invertedHalfPyramidNumber2 {
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            System.out.print("Enter the number of rows...");
            int rows=obj.nextInt();
            for(int i=1;i<rows;i++){
                for(int j=rows-i;j>=1;j--){
                    System.out.print(i+" ");
                }
                System.out.println();
            }
        }
    }
}
