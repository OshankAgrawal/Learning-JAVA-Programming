import java.util.Scanner;
class Solution{
    void arrayprint(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}
public class printingArray {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int size=obj.nextInt();
        int array[]=new int[size];
        for(int i=0;i<size;i++){
            array[i]=obj.nextInt();
        }
        Solution sc=new Solution();
        sc.arrayprint(array);
        obj.close();
    }
}
