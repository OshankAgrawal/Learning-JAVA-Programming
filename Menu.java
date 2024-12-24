import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            System.out.print("Enter 1 for input the marks and 0 for stop the program...");
            int choice=obj.nextInt();
            while(choice==1){
                System.out.print("Enter the marks of the student...");
                int marks=obj.nextInt();
                if(marks>=90){
                    System.out.println("This is good :)");
                } else if (marks>=60 && marks<=89) {
                    System.out.println("This is also good  :)");
                } else if (marks>=0 && marks<=59) {
                    System.out.println("This is good as well  :)");
                } else{
                    System.out.println("Invalid marks.");
                }
                System.out.print("Enter 1 for input the marks and 0 for stop the program...");
                choice=obj.nextInt();   
            }
        }
        System.out.println("Thank you :)");
    }
}
