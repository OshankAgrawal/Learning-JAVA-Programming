import java.util.Scanner;
public class OddEven {
    public static void main(String args[]){
        try (Scanner obj = new Scanner(System.in)) {
            System.out.print("Enter any one number..");
            int num=obj.nextInt();
            if(num%2 == 0){
                System.out.println("Entered number is even number.");
            } else{
                System.out.println("Entered number is odd number.");
            }
        }
    }
}
