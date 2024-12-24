import java.util.Scanner;

public class AddTwoNumber {
    public static void main (String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the first number..");
        int num1=obj.nextInt();
        System.out.print("Enter the second number..");
        int num2=obj.nextInt();
        System.out.println("Addition of two number is "+(num1+num2));
        obj.close();
    }
}
