import java.util.Scanner;
public class findMaxMinArray {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        // Input the size of array
        System.out.print("Enter the size of array...");
        int size=obj.nextInt();
        // Creating the array
        int number[]=new int[size];
        // Input the values
        for(int i=0;i<size;i++){
            System.out.print("Enter the "+(i+1)+" number...");
            number[i]=obj.nextInt();
        }
        // Initilized the variable by the boundary values 
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        // Checking the minimum and maximum values
        for(int i=0;i<size;i++){
            if(number[i]<min){
                min=number[i];
            }
            if(number[i]>max){
                max=number[i];
            }
        }
        // Output OR Printing the maximum and minimum values
        System.out.println("Maximum number inside the array is "+max);
        System.out.println("Minimum number inside the array is "+min);
        // close the object instant
        obj.close();
    }
}
