import java.util.Scanner;

public class calculator {
    public static void main (String arg []){
        try (Scanner obj = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num1 = obj.nextInt();
            
            System.out.print("Enter second number: ");
            int num2 = obj.nextInt();

            System.out.print("Enter the sign of operator which you want to perform: ");
            String opr = obj.next();

            switch(opr){
                case "+":{
                    System.out.println("sum of entered number is "+(num1+num2));
                    break;
                }
                case "-":{
                    System.out.println("Difference of entered number is "+(num1-num2));
                    break;
                }
                case "*":{
                    System.out.println("Difference of entered number is "+(num1*num2));
                    break;
                }
                case "/":{
                    System.out.println("We get Quotient  "+(num1/num2)+" when number one is divided by number two");
                    break;
                }
                default:{
                    System.out.println("Choose the correct operator.");
                }
            }
        }
        System.out.println("Thankyou...");
    }
}
