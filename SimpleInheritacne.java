class Student{
    int roll_no,marks; String name;
    void input(){
        System.out.println("Enter the Roll number Name and Marks of Students");
    }
}
public class SimpleInheritacne extends Student{
    void display(){
        roll_no=36; name="Oshank"; marks=86;
        System.out.println(roll_no+" "+name+" "+marks);
    }
    public static void main (String args[]){
        SimpleInheritacne r=new SimpleInheritacne();
        r.input();
        r.display();
    }
}
