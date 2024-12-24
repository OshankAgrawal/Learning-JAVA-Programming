import java.util.Scanner;
public class solidSquare {
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            System.out.print("Enter the side of square...");
            int side=obj.nextInt();
            for(int i=0;i<side;i++){
                for(int j=0;j<side;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
