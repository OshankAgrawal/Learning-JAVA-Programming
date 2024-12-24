import java.util.Scanner;

public class FindingGrade {
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);
        
        //Initialize variables
        int totalMarks = 0;
        int totalSubjects;
        double averagePercentage;
        
        //Input the total number of totalSubjects
        System.out.println("Enter the total number of subjects:");
        totalSubjects = scanner.nextInt();
        
        //Input marks for each subject and calculate total marks
        for (int i = 1; i <= totalSubjects; i++) {
            System.out.print("Enter marks for subject " + i + ":");
            int marks = scanner.nextInt();
            totalMarks += marks;
        }
        
        //Calculate average averagePercentage
        averagePercentage = (double) totalMarks / totalSubjects;
        
        //Assign grades based on the average averagePercentage
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        
        //Display results
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);
        
        //Close the scanner
        scanner.close();
    }
}