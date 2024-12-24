class sati{
    protected void display(){
        System.out.println("I am student.");
    }
}
public class ProtectedModifier extends sati{
    public static void main(String[] args) {
        ProtectedModifier stu=new ProtectedModifier();
        stu.display();
    }    
}
