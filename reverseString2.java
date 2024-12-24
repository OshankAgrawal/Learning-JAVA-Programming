import java.util.Scanner;
public class reverseString2 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter any one string... ");
        String str=obj.nextLine();
        StringBuilder sb=new StringBuilder(str);
        for(int i=0;i<sb.length()/2;i++){
            int front=i;
            int back=sb.length()-1-i;
            char frontChar=sb.charAt(front);
            char backChar=sb.charAt(back);
            sb.setCharAt(back, frontChar);
            sb.setCharAt(front, backChar);
        }
        System.out.print("Reverse string is  "+sb);
        obj.close();
    }
}
