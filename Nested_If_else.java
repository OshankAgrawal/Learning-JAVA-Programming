import java.util.Scanner;

public class Nested_If_else {
    public static void main (String args[]){
        int num1,num2,num3;
        try (Scanner r = new Scanner(System.in)) {
            System.out.print("Enter the first number....");
            num1=r.nextInt();
            System.out.print("Enter the second number....");
            num2=r.nextInt();
            System.out.print("Enter the third number....");
            num3=r.nextInt();
        }
        if (num1>num2){
            if(num1>num3){
                System.out.println(num1+" is the Greatest number among all the entered number.");
            }
            else{
                System.out.println(num3+" is the Greatest number among all the enterd number.");
            }
        }
        else{
            if(num2>num3){
                System.out.println(num2+" is the Greatest number among all the entered number.");
            }
            else{
                System.out.println(num3+" is the Greatest number among all the enterd number.");
            }
        }
    }
}