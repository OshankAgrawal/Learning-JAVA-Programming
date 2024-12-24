import java.util.Scanner;
public class Relation {
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            System.out.print("Enter the first number...");
            int num1 = obj.nextInt();
            System.out.print("Enter the second number...");
            int num2 = obj.nextInt();
            if(num1>num2){
                System.out.println("First number is greater than the second number.");
            } else if(num2>num1){
                System.out.println("Second number is  greater than the first number.");
            } else{
                System.out.println("Both the number is equal to each other.");
            }
        }
    }
}
