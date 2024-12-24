import java.util.Scanner;

class Addition{
    int num1,num2,ans;
    void Add(int x, int y){
        num1=x; num2=y; ans=num1+num2;
        System.out.println("Addition of two number is "+ans);
    }
}
class Subtraction extends Addition{
    void Sub(int x, int y){
        num1=x; num2=y; ans=num1-num2;
        System.out.println("Difference between two number is "+ans);
    }
}
class Multiplication extends Subtraction{
    void mult(int x, int y){
        num1=x; num2=y; ans=num1*num2;
        System.out.println("Difference between two number is "+ans);
    }
}
class Division extends Multiplication{
    void Div(int x, int y){
        num1=x; num2=y; ans=num1/num2;
        System.out.println("Difference between two number is "+ans);
    }
}
class Remainder extends Division{
    void Rem(int x, int y){
        num1=x; num2=y; ans=num1%num2;
        System.out.println("Difference between two number is "+ans);
    }
}
public class MultiLavelInheritance {
    public static void main (String args[]){
        try (Scanner obj = new Scanner(System.in)) {
            // input first number
            System.out.print("Enter the first number...");
            int num1=obj.nextInt();
            // input second number
            System.out.print("Enter the second number...");
            int num2=obj.nextInt();
            // input operator choice
            System.out.println("Enter your choice....\n1. For Addition\n2. For Substraction\n3. For Multiplication\n4. For Division\n5. For Remainder");
            int choice=obj.nextInt();
            // call the respected method using switch case
            Remainder ref=new Remainder();
            switch (choice) {
                case 1:{
                    ref.Add(num1,num2);
                    break;
                }
                case 2:{
                    ref.Sub(num1,num2);
                    break;
                }
                case 3:{
                    ref.mult(num1,num2);
                    break;
                }
                case 4:{
                    ref.Div(num1,num2);
                    break;
                }
                case 5:{
                    ref.Rem(num1,num2);
                    break;
                }
                default:{
                    System.out.println("Enter the right choice\n\nThankyou.....");
                    break;
                }
            }
        }
    }
}
