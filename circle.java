import java.util.Scanner;

public class circle {
    public static void main (String agrs[]){
        try (Scanner sc = new Scanner (System.in)) {
            System.out.println("Enter the radius of circle: ");
            float rad = sc.nextFloat();
            System.out.println("Daimeter of circle is "+2*rad);
            System.out.println("Area of circle is "+3.14*rad*rad);
            System.out.println("Circumference of circle is "+6.28*rad);
        }
    }
}
