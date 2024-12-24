import java.util.Scanner;

public class Switch_Statements{
  public static void main (String args[]){
    int num1,num2,ch;
    try (Scanner r = new Scanner(System.in)) {
      System.out.print("Enter the first number....");
      num1=r.nextInt();
      System.out.print("Enter the second number....");
      num2=r.nextInt();
      System.out.println("Enter your choice:\n1. For Addition\n2. For Substraction\n3. For Multiplication\n4. For Division");
      ch=r.nextInt();
    }
    switch(ch){
      case 1: System.out.println("Addition is "+ (num1+num2));
      break;
      case 2: System.out.println("Subtraction is "+ (num1-num2));
      break;
      case 3: System.out.println("Multiplication is "+ (num1*num2));
      break;
      case 4: System.out.println("Division is "+ (num1/num2));
      break;
      default: System.out.println("Enter the right choice.");
    }
    System.out.println("Thank you.");
  }
}