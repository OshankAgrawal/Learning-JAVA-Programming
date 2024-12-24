class SimpleObject {
    SimpleObject(){
        System.out.println("Default Constructor....");
    }
    SimpleObject(int a){
        System.out.println("One Argument Constructor....");
    }
}
public class Constructor{
    public static void main(String[] args) {
        new SimpleObject();
        new SimpleObject(100);
    }
}