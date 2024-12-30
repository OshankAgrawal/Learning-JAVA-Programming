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
    int size(){
        Node temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    void removeData(int data){
        Node temp=head;
        if(data==head.data){
            head=head.next;
            return;
        }
        while(!(temp.next.data==data)){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        if(data==tail.data){
            tail=temp;
        }
    }
}
public class implementAscendingLL {
    public static void main(String[] args) {
        ascLinkedList ll=new ascLinkedList();
        ll.add(100);
        ll.add(200);
        ll.add(300);
        ll.add(50);
        ll.add(40);
        ll.add(45);
        ll.add(200);
        ll.add(150);
        ll.add(300);
        ll.add(10);
        ll.add(500);
        ll.add(250);
        ll.add(-200);
        ll.display();
        ll.removeData(40);
        ll.removeData(200);
        ll.removeData(-200);
        ll.removeData(300);
        ll.removeData(500);
        ll.display();
        System.out.println("Size of Linked List is: "+ll.size());
        System.out.println("Head "+ll.head.data);
        System.out.println("Tail "+ll.tail.data);
    }
}
