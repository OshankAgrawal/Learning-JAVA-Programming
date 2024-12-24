import java.util.Scanner;
public class print1toNwithoutLoopRec {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int N=obj.nextInt();
        Solution sc=new Solution();
        sc.answer(N);
        obj.close();
    }
}
class Solution{
    void answer(int N){
        if(N==1){
            System.out.print(1+" ");
        } else{
            answer(N-1);
            System.out.print(N+" ");
        }
    }
}