import java.util.Scanner;

public class else_if_Ladder {
    public static void main(String args[]){
        int marks;
        System.out.print("Enter the marks of student....");
        try (Scanner r = new Scanner(System.in)) {
            marks=r.nextInt();
        }
        if(marks>95){
            System.out.println("Student has grade A+");
        }
        else if(marks>90.0){
            System.out.println("Student has grade A");
        }
        else if(marks>80){
            System.out.println("Student has grade B");
        }
        else if(marks>70){
            System.out.println("Student has grade B+");
        }
        else if(marks>60){
            System.out.println("Student has grade C+");
        }
        else if(marks>50){
            System.out.println("Student has grade C");
        }
        else if(marks>40){
            System.out.println("Student has grade C#");
        }
        else{
            System.out.println("Student has failed.");
        }
        System.out.println("Thank you....");
    }
}
