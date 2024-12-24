import java.util.Scanner;
public class FibonacciSeries {
    public static int FibonacciRecursive(int n){
        if(n<=1){
            return n;
        } else{
            return FibonacciRecursive(n-1) + FibonacciRecursive(n-2);
        }
    }
    public static int FibonacciIteration(int n){
        int first=0;
        int second=1;
        int fibo=0;
        if(n==0){
            return first;
        } else if(n==1){
            return second;
        } else{
            for(int i=2; i<=n; i++){
                fibo=first+second;
                first=second;
                second=fibo;
            }
        }
        return fibo;
    }
    public static void main(String[] args) {
        System.out.print("Enter any number...");
        try (Scanner obj = new Scanner(System.in)) {
            int n=obj.nextInt();
            System.out.println("Fibonacci Series Using Recurssion: ");
            for(int i=0; i<n; i++){
                System.out.print(FibonacciRecursive(i)+"\t");
            }
            System.out.println("\nFobonacci Series using itration: ");
            for(int i=0; i<n; i++){
                System.out.print(FibonacciIteration(i)+"\t");
            }
        }
    }
}