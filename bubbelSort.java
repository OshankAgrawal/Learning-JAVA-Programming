import java.util.Scanner;
public class bubbelSort {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        // Input the size of array
        System.out.print("Enter the size of the array...");
        int size=obj.nextInt();
        // Creating the array
        int array[]=new int[size];
        System.out.println("Enter the element of the array...");
        // Input the array element
        for(int i=0;i<size;i++){
            System.out.print((i+1)+". Element of the array...");
            array[i]=obj.nextInt();
        }
        // Printing the Unsorted array
        System.out.println("Unsorted Array....");
        for(int i=0;i<size;i++){
            System.out.print(array[i]+"  ");
        }
        System.out.println();
        // Sort the array by using the Bubbel Sort
        // Time complexity of this sort is -> O(n^2)
        for(int i=0;i<size-1;i++){
            for(int j=0;j<size-1-i;j++){
                if(array[j]>array[j+1]){
                    array[j]=array[j]+array[j+1];
                    array[j+1]=array[j]-array[j+1];
                    array[j]=array[j]-array[j+1];
                }
            }
        }
        // Printing the Sorted array
        System.out.println("Sorted Array....");
        for(int i=0;i<size;i++){
            System.out.print(array[i]+"  ");
        }
        // Close the object instance
        obj.close();
    }
}
