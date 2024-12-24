import java.util.Scanner;
// Recursion Question to print the FIBONACCI SEQUENCE
public class fibonacciSequenceRec {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        int num1=1,num2=1;
        System.out.print(num1+" "+num2+" ");
        fibonacci(num1,num2,num-2);
        obj.close();
    }
    public static void fibonacci(int a,int b,int num){
        if(num==0){
            return;
        }else{
            int c=a+b;
            System.out.print(c+" ");
            fibonacci(b, c, num-1);
        }
    }
}