import java.util.Scanner;
public class hollowRhombus {
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            System.out.print("Enter the side of the rhombus...");
            int side=obj.nextInt();
            for(int i=0;i<side;i++){
                for(int j=side-1;j>i;j--){
                    System.out.print("  ");
                }
                for(int j=0;j<side;j++){
                    if(i==0 || j==0 || i==side-1 || j==side-1)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }
                System.out.println();
            }
        }
    }
}
