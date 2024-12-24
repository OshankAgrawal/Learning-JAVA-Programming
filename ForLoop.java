import java.util.Scanner;

public class ForLoop {
    public static void main (String args[]){
        int n;
        System.out.print("Enter the number of iterations..");
        try (Scanner r = new Scanner(System.in)) {
            n=r.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println(i+" Hello everyone i am Oshank Agrawal.");
        }
    }
}
