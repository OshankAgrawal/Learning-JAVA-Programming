import java.util.Scanner;
public class greaterNumber {
    public static void findgreater(int num1,int num2){
        if(num1>num2){
            System.out.println("First number "+num1+" is greater than the second number "+num2);
        } else if(num2>num1){
            System.out.println("Second number "+num2+" is greater than the first number "+num1);
        } else{
            System.out.println("Both the entetred number is equal to each other.");
        }
    }
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            System.out.println("Enter the two number to check which one is greater...");
            System.out.print("Enter the first number...");
            int num1=obj.nextInt();
            System.out.print("Enter the socond number....");
            int num2=obj.nextInt();
            findgreater(num1,num2);
        }
    }
}
