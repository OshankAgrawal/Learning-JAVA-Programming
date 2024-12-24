class pen{
    String color;
    String type;
    public void write(){
        System.out.println("Write something.");
    }
    public void printColor(){
        System.out.println(this.color);
    }
    public void printType(){
        System.out.println(this.type);
    }
}
class Student{
    String name;
    int age;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
public class OOPs {
    public static void main(String[] args) {
        pen pen1=new pen();
        pen pen2=new pen();
        pen1.color="Black";
        pen1.type="gel pen";
        pen1.printColor();
        pen1.printType();;
        pen1.write();
        pen2.color="Blue";
        pen2.type="ball point pen";
        pen2.printColor();
        pen2.printType();;
        pen2.write();
        Student s1=new Student();
        s1.name="Oshank Agrawal.";
        s1.age=22;
        s1.printInfo();
    }
}
