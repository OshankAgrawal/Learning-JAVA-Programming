import java.util.Scanner;
public class voting {
    public static void checkEligibility(int age){
        if(age>=18){
            System.out.println("Person is eligible to vote.");
        } else{
            System.err.println("Person is not eligible to vote.");
        }
    }
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            System.out.print("Enter the age of person to check the eligiblity to vote...");
            int age=obj.nextInt();
            checkEligibility(age);
        }
    }
}
