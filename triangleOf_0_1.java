import java.util.Scanner;
public class triangleOf_0_1 {
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            System.out.print("Enter the number of row...");
            int rows=obj.nextInt();
            for(int i=1;i<=rows;i++){
                for(int j=1;j<=i;j++){
                    if((i+j)%2==0){
                        System.out.print(1+" ");
                    } else{
                        System.out.print(0+" ");
                    }
                }
                System.out.println();
            }
        }
    }    
}
