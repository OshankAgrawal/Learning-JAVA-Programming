import java.util.Scanner;
public class input {
    public static void main (String args[]){
        System.out.print("Enter the value ");
        try (Scanner obj = new Scanner(System.in)) {
            int a=obj.nextInt();
            int b=obj.nextInt();
            System.out.println("Sum is "+(a+b));
            System.out.print(a+" "+b);
        }
    }

}
