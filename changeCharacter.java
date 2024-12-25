import java.util.Scanner;

public class changeCharacter {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter any one string..  ");
        String str=obj.nextLine();
        String resultString="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='e'){
                resultString += 'i';
            } else{
                resultString += str.charAt(i);
            }
        }
        System.out.println("Result is "+resultString);
        obj.close();
    }
}
