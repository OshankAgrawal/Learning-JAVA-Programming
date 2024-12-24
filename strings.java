import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        // Declaration
        String name="Oshank agrawal";
        System.out.println(name);
        // Taking input
        System.out.print("Enter any one string.....");
        String str=obj.nextLine();
        System.out.println("Entered string is "+str);
        // Concatenation of two string
        String con=name+" "+str;
        System.out.println("Concatenation of name and str is...."+con);
        // Print the length of concatenated string
        System.out.println("Length of concatenated string is..."+con.length());
        // Access character of the string
        System.out.println("Character of the string...");
        for(int i=0;i<con.length();i++){
            System.out.print(con.charAt(i)+"  ");
        }
        System.out.println();
        // Compare two strings
        System.out.print("Enter first string.....");
        String str1=obj.nextLine();
        System.out.print("Enter second string.....");
        String str2=obj.nextLine();
        if(str1.compareTo(str2)==0){
            System.out.println("Both the strings are equal.");
        } else{
            System.out.println("Both the strings are not equal.");
        }
        // Sub-string
        System.out.print("Enter the starting index....");
        int idx1=obj.nextInt();
        System.out.print("Enter the last index....");
        int idx2=obj.nextInt();
        if(idx1>0 && idx2<con.length()){
            System.out.print("Sub-string is  "+con.substring(idx1,idx2));
            System.out.println();
        }else{
            System.out.println("Invalid index.");
        }
        // parseInt Method of Integer class 
        String nam="123";
        int number=Integer.parseInt(nam);
        System.out.println(number);
        // toString Method of string class
        int num=123;
        String asd=Integer.toString(num);
        System.out.println(asd);
        System.out.println(asd.length());
        // Close the object instance
        obj.close();
    }
}
