import java.util.Scanner;

public class DigitCount {
    public static void main (String args[]){
        System.out.print("Enter any one number...");
        try (Scanner obj = new Scanner(System.in)) {
            int num=obj.nextInt();
            int org_num=num;
            int count=0;
            while(num != 0){
                num /=10;
                count +=1;
            }
            System.out.println("Number of digits in "+org_num+" is "+count);
        }
    }
}
