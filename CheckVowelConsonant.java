import java.util.Scanner;

public class CheckVowelConsonant {
    public static void main(String args[]){
        try (Scanner obj = new Scanner(System.in)) {
            System.out.print("Enter any one character...");
            char ch=obj.next().charAt(0);
            char a[]={'a','e','i','o','u','A','E','I','O','U'};
            for (char c : a) {
                if (c == ch){
                    System.out.println("Entered character is Vowel.");
                    System.exit(0);
                }
            }
            System.out.println("Entered character is consonant.");
        }
    }
}
