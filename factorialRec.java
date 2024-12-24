import java.util.Scanner;
// Recursion Question to calculate the factorial of a number
public class factorialRec {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        int fact=1;
        printFactorial(num,fact);
        obj.close();
    }
    public static void printFactorial(int num,int fact){
        if(num==0){
            System.out.println(fact);
        }else if(num==1){
            System.out.println(fact);
            return;
        }else{
            fact=fact*num;
            printFactorial(num-1, fact);
        }
    }
}
