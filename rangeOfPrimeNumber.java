import java.util.Scanner;
public class rangeOfPrimeNumber {
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            System.out.print("Enter any one number...");
            int num=obj.nextInt();
            for(int k=2;k<=num;k++){
                int i;
                for(i=2;i<k;i++){
                    if (k%i==0) {
                        break;
                    }
                }
                if(i==k){
                    System.out.print(k+"\t");
                }
            }
            System.out.println("\nThese are the prime numbers upto "+num);
        }
    }
}
