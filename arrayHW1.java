import java.util.Scanner;
public class arrayHW1 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the size of array....");
        int size=obj.nextInt();
        // Consume the leftover newline OR This reads the leftover \n from the input buffer
        obj.nextLine();
        // Creating the array
        String names[]=new String[size];
        // taking the input from the user
        for(int i=0;i<size;i++){
            System.out.print("Enter the "+(i+1)+" name....");
            names[i]=obj.nextLine();
        }
        // Printing the output 
        for(int i=0;i<size;i++){
            System.out.println((i+1)+" name in the array is "+names[i]);
        }
        obj.close();
    }
}