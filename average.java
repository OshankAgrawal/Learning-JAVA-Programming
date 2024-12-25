import java.util.Scanner;
public class average {
    public static int findAverage(int num1,int num2,int num3){
        return (num1+num2+num3)/3;
    }
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            System.out.println("Enter the three number one by one to find the average...");
            System.out.print("Enter the first number...");
            int num1=obj.nextInt();
            System.out.print("Enter the second number...");
            int num2=obj.nextInt();
            System.out.print("Enter the third number...");
            int num3=obj.nextInt();
            System.out.println("Average of entered number is "+findAverage(num1,num2,num3));
        }
    }
}
