import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            System.out.print("Enter any one number...");
            int num=obj.nextInt();
            int i;
            for(i=2;i<num;i++){
                if (num%i==0) {
                    break;
                }
            }
            if(i==num){
                System.out.println("Number is prime.");
            } else{
                System.out.println("Number is not prime.");
            }
        }
    }
}
