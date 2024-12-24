public class StaticBlock {
    public static void main (String args[]){
        StaticBlock r=new StaticBlock();
        r.Show("Thankyou...");
    }
    StaticBlock(){
        System.out.println("Hello everyone...");
    }{
        System.out.println("I am Oshank agrawal.");
    }
    static{
        System.out.println("I am from mathura.");
    }
    String a;
    void Show(String x){
        a=x;
        System.out.println(a);
    }
}
