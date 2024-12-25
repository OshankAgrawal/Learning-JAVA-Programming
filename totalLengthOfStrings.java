import java.util.Scanner;
public class totalLengthOfStrings {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        // Input the number of strings
        System.out.print("Enter the number of strings...");
        int size=obj.nextInt();
        // Creating the array to store all the strings
        String str[]=new String[size];
        // Consume the leftover newline character after nextInt()
        obj.nextLine();
        // Taking input all the strings
        for(int i=0;i<size;i++){
            System.out.print("Enter the "+(i+1)+" string...");
            str[i]=obj.nextLine();
        }
        // Calculate the total length & print it
        int length=0;
        for(int i=0;i<size;i++){
            length += str[i].length();
        }
        System.out.print("Cumulative length of all the string is...."+length);
        // Close the object instance
        obj.close();
    }
}
