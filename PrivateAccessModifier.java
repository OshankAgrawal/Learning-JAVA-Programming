class data{
    void display(String name){
        System.out.println(name);
    }
}
public class PrivateAccessModifier {
    public static void main(String[] args) {
        data d=new data();
        d.display("AIADS Branch Batch 2022-26");
    }
}
