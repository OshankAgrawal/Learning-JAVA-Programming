import java.util.Scanner;
public class arraySearch {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the size of array....");
        int size=obj.nextInt();
        // Create array
        int array[]=new int[size];
        // Input
        for(int i=0;i<size;i++){
            System.out.print("Enter the "+(i+1)+" element of the array...");
            array[i]=obj.nextInt();
        }
        System.out.print("Enter the element which you want to search inside the array....");
        int ele=obj.nextInt();
        boolean flag=false;
        for(int i=0;i<size;i++){
            if(ele==array[i]){
                System.out.println("Seach element found inside the array at the "+i+" index.");
                flag=true;
                break;
            }
        }
        if(!flag){
            System.out.println("Seach element is not found inside the array.");
        }
        obj.close();
    }
}
