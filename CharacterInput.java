import java.util.Scanner;
public class CharacterInput {
    public static void main(String args[]){
        try (Scanner obj = new Scanner(System.in)) {
            System.out.print("Enter any one character...");
            char ch=obj.next().charAt(0);
            System.out.println(("Entered character is...")+ch);
        }
    }    
}
