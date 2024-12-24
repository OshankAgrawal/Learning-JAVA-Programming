import java.util.Scanner;
public class solidRectangle {
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            System.out.print("Enter the length of the rectangle...");
            int length=obj.nextInt();
            System.out.print("Enter the width of the rectangle...");
            int width=obj.nextInt();
            for(int i=0;i<width;i++){
                for(int j=0;j<length;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
