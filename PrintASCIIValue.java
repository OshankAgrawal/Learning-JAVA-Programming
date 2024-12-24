import java.util.Scanner;

public class PrintASCIIValue {
    public static void main (String aegs[]){
        System.out.print("Enter any character...");
        try (Scanner obj = new Scanner(System.in)) {
            char ch=obj.next().charAt(0);
            int num=ch;
            System.out.println("ASCII value of "+ch+" is "+num);
        }
    }
}
