import java.util.Scanner;
public class emailUsername {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the email address....");
        String Email=obj.nextLine();
        String userName="";
        for(int i=0;i<Email.length();i++){
            if(Email.charAt(i)=='@'){
                break;
            } else{
                userName += Email.charAt(i);
            }
        }
        System.out.println("Username is... "+userName);
        obj.close();
    }
}
