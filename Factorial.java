import java.util.Scanner;

public class Factorial {
    public static void main(String args[]){
        int fact=1;
        System.out.print("Enter any number...");
        try (Scanner obj = new Scanner(System.in)) {
            int num=obj.nextInt();
            for(int i=1; i<=num; i++){
                fact *= i;
            }
        }
        System.out.println("Factorial of entered number is "+fact);
    }
}
