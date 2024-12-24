import java.util.Scanner;
public class search2Darray {
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
            System.out.println("Enter the values of the "+(i+1)+" row");
            for(int j=0;j<column;j++){
                System.out.print("Enter the value of the "+(j+1)+" column...");
                twoDarray[i][j]=obj.nextInt();
            }
        }
        // Taking the input of the search element
        System.out.print("Enter the number which you want to search in the 2D array...");
        int element=obj.nextInt();
        boolean flag=false;
        // Search the number in the array
        for(int i=0;i<rows;i++){
            for(int j=0;j<column;j++){
                if(element==twoDarray[i][j]){
                    System.out.println("Number is present in the 2D array at the index "+i+","+j+".");
                    flag=true;
                    break;
                }
            }
        }
        if(!flag){
            System.out.println("Number is not present in the array.");
        }
        // Close the instance of the object
        obj.close();
    }
}
