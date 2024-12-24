import java.util.Scanner;

public class SumNaturalNumber{
    public static void main(String args[]){
        try (Scanner obj = new Scanner(System.in)) {
            System.out.print("Enter any number...");
            int num=obj.nextInt();
            int sum=0;
            for(int i=1;i<=num;i++){
                sum += i;
            }
            System.out.println(sum);
        }
    }
}