import java.util.Scanner;
public class reverseString {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter a string... ");
        String str=obj.nextLine();
        String revString="";
        for(int i=str.length()-1;i>=0;i--){
            revString=revString+str.charAt(i);
        }
        System.out.print("Reverse string is  "+revString);
        obj.close();
    }
}
