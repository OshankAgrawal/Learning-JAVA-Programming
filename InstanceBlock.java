class A{
    {
        int a=10, b=56;
        System.out.println(a+" "+b);
    }
    A(){
        int a=326, b=3546;
        System.out.println(a+" "+b);
    }
    String a;
    void Show(String x){
        a=x;
        System.out.println(a);
    }
}
public class InstanceBlock {
    public static void main (String args[]){
        A r=new A();
        r.Show("Thankyou...");
    }
}
