import java.util.Scanner;
// Recursionb Question
public class sumofNnumberRec {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        int sum=0;
        printsum(num,sum);
        obj.close();
    }
    public static void printsum(int num,int sum){
        if(num==0){
            sum=sum+num;
            System.out.println(sum);
            return;
        }else{
            sum = sum+num;
            printsum(num-1,sum);
        }
    }
}
