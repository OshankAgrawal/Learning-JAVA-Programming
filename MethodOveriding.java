class shape{
    void draw(){
        System.out.println("can't say shape type");
    }
}
class square extends shape{
    @Override
    void draw(){
        System.out.println("Square shape.");
    }
}
public class MethodOveriding {
    public static void main(String[] args) {
        shape r=new square();
        r.draw();
    }
}
