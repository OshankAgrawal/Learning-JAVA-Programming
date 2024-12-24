import java.util.Scanner;

public class N_Natural_Number {
    public static void main (String args[]){
        try (Scanner obj = new Scanner(System.in)) {
            System.out.print("Enter any one number...");
            int num=obj.nextInt();
            for(int i=1;i<=num;i++){
                System.out.print((i)+"\t");
            }
        }
    }
}
