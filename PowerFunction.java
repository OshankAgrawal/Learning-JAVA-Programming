import java.util.Scanner;

public class PowerFunction{
    public static void main (String args[]){
        try (Scanner obj = new Scanner(System.in)) {
            System.out.print("Enter the base number...");
            int base=obj.nextInt();
            System.out.print("Enter the power of base...");
            int power=obj.nextInt();
            int ans = 1;
            for(int i=1; i<=power; i++){
                ans = ans * base;
            }
            System.out.println(base+" to the power "+power+" is equal to "+ans);
        }
    }
}