class Node{
    int data;
    Node next;
    Node(){
        // default constructor
    }
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class ascLinkedList{
    Node head;
    Node tail;
    void add(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
        }else{
            if(data<head.data){
                newNode.next=head;
                head=newNode;
            }else if(tail.data<data){
                tail.next=newNode;
                tail=newNode;
            }else{
                Node temp=head.next;
                Node temp2=head;
                while(!(temp.data>=data && temp2.data<data)){
                    temp=temp.next;
                    temp2=temp2.next;
                }
                newNode.next=temp;
                temp2.next=newNode;
            }
        }
    }
    void display(){
        Node temp=head;
        if(head==null){
            System.out.println("Empty List.");
            return;
        }
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}
public class implementAscendingLL {
    public static void main(String[] args) {
        ascLinkedList ll=new ascLinkedList();
        ll.display();
        ll.add(100);
        ll.display();
        ll.add(200);
        ll.display();
        ll.add(300);
        ll.display();
        ll.add(50);
        ll.display();
        ll.add(40);
        ll.display();
        ll.add(45);
        ll.display();
        ll.add(200);
        ll.display();
        ll.add(150);
        ll.display();
        ll.add(300);
        ll.display();
    }
}
