import java.util.Scanner;
public class computePower {
    public static long power(int base,int exponent){
        long ans=1;
        for(int i=1;i<=exponent;i++){
            ans=ans*base;
        }
        return ans;
    }
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            System.out.println("Enter the two number to find the power of one other...");
            System.out.print("Enter the base number....");
            int base=obj.nextInt();
            System.out.print("Enter the exponent...");
            int exponent=obj.nextInt();
            System.out.println(base+" to the power "+exponent+" is equal to "+power(base,exponent));
        }
    }
}
 // 2147483647