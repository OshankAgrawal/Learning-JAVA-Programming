import java.util.Scanner;
public class function {
    // Function 1 defination
    public static void printMyString(String str){
        System.out.println("Entered string is "+str);
    }

    //Function 2 defination
    public static int calculateSum(int num1, int num2){
        int sum=num1+num2;
        return sum;
    }

    //Function 3 defination
    public static int calculateProduct(int num3, int num4){
        return num3*num4;
    }

    // Function 4 defination
    public static int factorial(int num5){
        if(num5<0){
            System.out.println("Invalid number...");
            return -1;
        }
        int fact=1;
        for(int i=1;i<=num5;i++){
            fact=fact*i;
        }
        return fact;
    }

    //Function 5 defination
    public static void checkPrimeNumber(int num6){
        int i;
        if(num6<0){
            System.out.println("Entered number is invalid number\nEnter a valid number :)");
            return;
        }
        for(i=2;i<=num6;i++){
            if(num6%i==0){
                break;
            }
        }
        if(i==num6){
            System.out.println("Entered number is prime number.");
        } else{
            System.out.println("Entered number is not prime number.");
        }
        return;
    }

    // Function 6 defination
    public static void checkEvenOdd(int num7){
        if(num7%2==0){
            System.out.println("Entered number is even number.");
        } else{
            System.out.println("Entered number is odd number.");
        }
    }

    // Function 7 defination
    public static void printingTable(int num8){
        System.out.println("Table of entered number is");
        for(int i=1;i<=10;i++){
            System.out.println(num8+"*"+i+"="+num8*i);
        }
        return;
    }

    
    // Main Function
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            // Function 1 calling
            System.out.print("Enter any one string-> ");
            String name=obj.nextLine();
            printMyString(name);

            // Function 2 calling
            System.out.println("Enter the number for calculate the sum...");
            System.out.print("Enter the first number...");
            int num1=obj.nextInt();
            System.out.print("Enter the second number...");
            int num2=obj.nextInt();
            System.out.println("Sum of entered number is "+calculateSum(num1,num2));

            // Function 3 calling
            System.out.println("Enter the number for calculate the product...");
            System.out.print("Enter the first number...");
            int num3=obj.nextInt();
            System.out.print("Enter the second number...");
            int num4=obj.nextInt();
            System.out.println("Product of entered number is "+calculateProduct(num3,num4));

            // Function 4 calling
            System.out.println("Enter the number for calculate the factorial...");
            System.out.print("Enter the number...");
            int num5=obj.nextInt();
            System.out.println("Factorial of entered number is "+factorial(num5));

            // Function 5 calling
            System.out.println("Enter the number for checking that number is prime or not...");
            System.out.print("Enter the number...");
            int num6=obj.nextInt();
            checkPrimeNumber(num6);

            // Function 6 calling
            System.out.println("Enter a number to check the number is even or odd...");
            System.out.print("Enter a number....");
            int num7=obj.nextInt();
            checkEvenOdd(num7);

            //Function 7 calling
            System.out.println("Enter a number for printing the table...");
            System.out.print("Enter the number...");
            int num8=obj.nextInt();
            printingTable(num8);
        }
    }
}
