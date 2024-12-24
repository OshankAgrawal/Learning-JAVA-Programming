import java.util.Scanner;

public class SumOddNumber {
    public static void main(String args[]){
        try (Scanner obj = new Scanner(System.in)) {
            System.out.print("Enter any number...");
            int num=obj.nextInt();
            int sum=0;
            for (int i=1;i<=num;i += 2){
                sum += i;
            }
            System.out.println("Sum of all odd natural number till "+(num)+" is "+(sum));
        }
    }
}    

