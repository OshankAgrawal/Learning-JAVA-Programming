class A{
    int x,y,z; String s;
    A(int a , int b){
        x=a; y=b;
    }
    A(int a, String b){
        z=a; s=b;
    }
    void show(){
        System.out.println(x+" "+y);
    }
    void b(){
        System.out.println(z+" "+s);
    }
}
public class ParameterizedConstructor {
    public static void main(String args[]){
        A r=new A(100,200);
        r.show();
        A ref=new A(1000,"Oshank");
        ref.b();
    }
}
