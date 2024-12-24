public class practiceLL {
    public static void main(String[] args) {
        linkedlist ll=new linkedlist();
        ll.add(2);
        ll.add(11);
        ll.add(6);
        ll.add(8);
        ll.display();
        ll.rotate(6);
        ll.display();
        System.out.println("Second");
        linkedlist l=new linkedlist();
        for(int i=1;i<=6;i++){
            l.add(i);
        }
        l.display();
        l.rotate(2);
        l.display();
    }
}
