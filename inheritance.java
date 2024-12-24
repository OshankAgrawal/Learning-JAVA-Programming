class superclass{
    int num=20;
    public void display(){
        System.out.println("Display SuperClass");
    }
}
class subclass extends superclass{
    int num=10;
    public void display(){
        System.out.println("Display SubClass");
    }
    public void mymethod(){
        subclass sub=new subclass();
        sub.display();
        System.out.println("Value of variable of SubClass: "+sub.num);
        System.out.println("Value of variable of SuperClass: "+super.num);
    }
}
public class inheritance{
    public static void main(String args[]){
        subclass obj=new subclass();
        obj.mymethod();
    }
}