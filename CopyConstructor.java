class A{
    int a; String b;
    A(){
        a=100; b="Oshank";
        System.out.println(a+" "+b);
    }
    A(A ref){
        a=ref.a;
        b=ref.b;
        System.out.println(a+" "+b);
    }
    void Show(){
        System.out.println("thank you...");
    }
}
public class CopyConstructor {
    public static void main(String[] args) {
        A r=new A();
        A r2=new A(r);
        r2.Show();
    }
}
