import java.util.Scanner;

public class PrinttheTable {
    public static void main(String args[]){
        System.out.print("Enter any one number...");
        try (Scanner obj = new Scanner(System.in)) {
            int num=obj.nextInt();
            System.out.println("Multiplication Table of "+num+" is:");
            for(int i=1; i<=10; i++){
                System.out.println(num+" * "+i+" = "+num*i);
            }
        }
    }
}
