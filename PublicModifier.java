class animal{
    public int legCount;
    public void display(){
        System.out.println("This is an animal.");
        System.out.println("This animal have "+legCount+" legs.");
    }
}
public class PublicModifier {
    public static void main(String[] args) {
        animal an=new animal();
        an.legCount=4;
        an.display();
    }
}
