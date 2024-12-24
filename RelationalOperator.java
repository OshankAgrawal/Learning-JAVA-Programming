import java.util.Scanner;
public class RelationalOperator {
    public static void main(String args[]){
        System.out.print("Enter the first number....");
        try (Scanner obj = new Scanner (System.in)) {
            int a=obj.nextInt();
            System.out.print("Enter the second number....");
            int b=obj.nextInt();
            System.out.println("Is "+a+"<"+b+" ? true/false "+(a<b));
            System.out.println("Is "+a+"<="+b+" ? true/false "+(a<=b));
            System.out.println("Is "+a+">="+b+" ? true/false "+(a>=b));
            System.out.println("Is "+a+"=="+b+" ? true/false "+(a==b));
            System.out.print("Is "+a+"!="+b+" ? true/false "+(a!=b));
        }
    }
}
