import java.util.Scanner;
public class gcd {
    public static int greatestCommonDivisor(int num1,int num2){
        int dividend,divisor,remainder;
        if(num1>num2){
            divisor=num2;
            dividend=num1;
        } else{
            divisor=num1;
            dividend=num2;
        }
        while(true){
            remainder=dividend%divisor;
            if(remainder!=0){
                dividend=divisor;
                divisor=remainder;
            } else{
                break;
            }
        }
        return divisor;
    }
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            System.out.println("Enter the two number to find the greatest common divisor of them...");
            System.out.print("Enter the first number...");
            int num1=obj.nextInt();
            System.out.print("Enter the second number...");
            int num2=obj.nextInt();
            System.out.println("Greatest common divisor of "+num1+" & "+num2+" is "+greatestCommonDivisor(num1, num2));
        }
    }
}
