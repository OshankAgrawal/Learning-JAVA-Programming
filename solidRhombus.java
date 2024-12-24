import java.util.Scanner;
public class solidRhombus {
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            System.out.print("Enter the side of rhombus...");
            int side=obj.nextInt();
            for(int i=1;i<=side;i++){
                for(int j=side;j>i;j--){
                    System.out.print(" ");
                }
                for(int j=1;j<=side;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }    
}
