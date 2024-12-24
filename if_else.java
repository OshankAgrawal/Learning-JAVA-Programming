import java.util.Scanner;

public class if_else {
    public static void main(String args[]){
        int num;
        System.out.print("Enter a number......");
        try (Scanner r = new Scanner(System.in)) {
            num=r.nextInt();
        }
        if(num>0){
            System.out.println("Entered number is Positive number...");
        }
        else{
            System.out.println("Enterd number is a negative number...");
        }
        System.out.println("Thank you...");
    }
}
