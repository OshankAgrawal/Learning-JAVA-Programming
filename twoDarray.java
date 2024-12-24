import java.util.Scanner;
public class twoDarray {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        // Take the input of size of 2D array
        System.out.print("Enter the number of rows of the array...");
        int rows=obj.nextInt();
        System.out.print("Enter the number of column of the array...");
        int column=obj.nextInt();
        // Creating the array
        int twoDarray[][]=new int[rows][column];
        // Taking the input of the values of the element
        for(int i=0;i<rows;i++){
            for(int j=0;j<column;j++){
                System.out.print("Enter the value of the "+(i+1)+" row "+(j+1)+" column...");
                twoDarray[i][j]=obj.nextInt();
            }
        }
        // Printing the array as output
        for(int i=0;i<rows;i++){
            for(int j=0;j<column;j++){
                System.out.print(twoDarray[i][j]+"\t");
            }
            System.out.println();
        }
        // Close the instance of the object
        obj.close();
    }
}
