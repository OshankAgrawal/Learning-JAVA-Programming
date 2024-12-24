import java.util.Scanner;
public class checkingArraySortOrNot {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        // Inpyt the size of array
        System.out.print("Enter the size of array....");
        int size=obj.nextInt();
        // Creating the array
        int array[]=new int[size];
        // Input the values 
        for(int i=0;i<size;i++){
            System.out.print("Enter the "+(i+1)+" element of the array...");
            array[i]=obj.nextInt();
        }
        // Initilized the variable by the boundary values 
        int number=Integer.MIN_VALUE;
        boolean flag=true;
        // Checking the array is sorted in ascending order or not
        for(int i=0;i<size;i++){
            if(number<array[i]){
                number=array[i];
                flag=true;
            } else{
                flag = false;
                break;
            }
        }
        // Printing the output
        if(flag){
            System.out.println("Array is sorted in ascending order.");
        } else{
            System.out.println("Array is not sorted in ascending order.");
        }
        // close the object instant
        obj.close();
    }
}
