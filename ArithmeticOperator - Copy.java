import java.util.Scanner;
class ArithmeticOperator{
    public static void main (String args[]){
        System.out.println("Enter the first number....");
        try (Scanner obj = new Scanner (System.in)) {
            int num1=obj.nextInt();
            System.out.println("Enter the second number....");
            int num2=obj.nextInt();
            System.out.println("Addition "+(num1+num2));
            System.out.println("Substraction "+(num1-num2));
            System.out.println("Multiplication "+(num1*num2));
            System.out.println("Division "+(num1/num2));
            System.out.println("Remainder "+(num1%num2));
        }
    }
}