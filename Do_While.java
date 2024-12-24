import java.util.Scanner;

public class Do_While {
    public static void main (String args[]){
        int n;
        try (Scanner r = new Scanner(System.in)) {
            System.out.print("Enter the number of iterations..");
            n=r.nextInt();
        }
        int i=1;
        do{
            System.out.println(i+". Hello everyone i am Oshank Agrawal.");
            i++;
        } while(i<=n);
    }
}
