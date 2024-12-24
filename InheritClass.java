class A{
    void show(){
        System.out.println("This is the Super Class.");
    }
}
class B extends A{
    void display(){
        super.show();
        System.out.println("This is the Sub-Class.");
    }
}
class InheritClass{
    public static void main (String args[]){
        B obj=new B();
        obj.display();
    }
}