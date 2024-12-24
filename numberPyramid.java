import java.util.Scanner;
public class numberPyramid {
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            System.out.print("Enter the number of rows...");
            int rows=obj.nextInt();
            int number=1;
            for(int i=rows;i>=1;i--){
                for(int j=i;j>1;j--){
                    System.out.print(" ");
                }
                for(int j=1;j<=rows-i+1;j++){
                    System.out.print(number+" ");
                }
                number++;
                System.out.println();
            }
        }
    }
}
