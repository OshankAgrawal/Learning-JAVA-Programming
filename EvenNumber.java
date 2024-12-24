import java.util.Scanner;

public class EvenNumber {
    public static void main(String args[]){
        try (Scanner obj = new Scanner(System.in)) {
            System.out.print("Enter any number...");
            int num=obj.nextInt();
            System.out.println("METHOD 1");
            for (int i=0;i<=num;i += 2){
                System.out.print((i)+"\t");
            }
            System.out.println("\nMETHOD 2");
            for (int i=0;i<=num;i++){
                if(i%2 == 0){
                    System.out.print((i)+"\t");
                }
            }
        }
    }    
}
