import java.util.Scanner;
public class butterflyPattern {
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            System.out.print("Enter the number of rows...");
            int rows=obj.nextInt();
            // Outer Loop => print upper part of the pattern
            for(int i=1;i<=rows;i++){
                // Inner Loop => print first triangle
                for(int j=1;j<=i;j++){
                    System.out.print("* ");
                }
                // Inner Loop => print first gap
                for(int j=rows;j>i;j--){
                    System.out.print("    ");
                }
                // Inner Loop => print second gap
                // for(int j=rows;j>i;j--){
                //     System.out.print("  ");
                // }
                // Inner Loop => print second triangle
                for(int j=1;j<=i;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
            // Outer Loop => print thelower part of the pattern
            for(int i=2;i<=rows;i++){
                // Inner Loop => print third triangle
                for(int j=rows;j>=i;j--){
                    System.out.print("* ");
                }
                // Inner Loop => print the third gap
                for(int j=1;j<i;j++){
                    System.out.print("    ");
                }
                // Inner Loop => print the fourth gap
                // for(int j=1;j<i;j++){
                //     System.out.print("  ");
                // }
                // Inner Loop => print the fourth triangle
                for(int j=rows;j>=i;j--){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
