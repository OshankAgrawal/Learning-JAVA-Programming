import java.util.Scanner;

public class WhileLoop{
    public static void main (String args[]){
        int n;
        System.out.print("Enter the number of iteration....");
        try (Scanner r = new Scanner(System.in)) {
            n=r.nextInt();
        }
        int i=1;
        while(i<=n){
            System.out.println(i+". Hello i am Oshank Agrawal.");
            i++;
        }
        System.out.println("Thank you.");
    }
}
