class linkedlist{
    Node head=null;
    Node tail=null;
    void append(int data){
        Node temp=new Node(data);
        if(head==null){
            head=temp;
        }else{
            tail.next=temp;
        }
        tail=temp;
    }
    void display(){
        Node temp=head;
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
    void insertAtBeginning(int data){
        Node temp=new Node(data);
        if(head==null){
            head=tail=temp;
        }else{
            temp.next=head;
            head=temp;
        }
        
    }
    void insertAt(int index,int data){
        int n=size();
        Node newNode=new Node(data);
        if(index>n || index<0){
            System.out.println("Enter the correct index.");
            return;
        }else if(index==0){
            insertAtBeginning(data);
            return;
        }else if(index==n){
            append(data);
            return;
        }
        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    int get(int index){
        Node temp=head;
        if(index==size() || index<0){
            System.out.println("Enter the correct index.");
            return -1;
        }
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp.data;
    }
    void deleteBeginningNode(){
        head=head.next;
    }
    void deleteAt(int index){
        if(index==0){
            deleteBeginningNode();
            return;
        }else if(index==size() || index<0){
            System.out.println("Enter the correct index.");
            return;
        }else if(index+1 == size()){
            deleteLastNode();
            return;
        }
        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
    }
    void deleteLastNode(){
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        tail=temp;
    }
    void rotate(int k){
        if(k==0) return;
        Node temp=head;
        int n=size();
        while(temp.next!=null){
            temp=temp.next;
        }
        if(k>n){
            k=k%n;
        }
        int m=n-k;
        Node temp2=head;
        for(int i=0;i<m;i++){
            temp2=temp2.next;
        }
        Node temp3=head;
        for(int i=0;i<m-1;i++){
            temp3=temp3.next;
        }
        temp3.next=null;
        temp.next=head;
        head=temp2;
        tail=temp3;
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
public class implementationLL {
    public static void main(String[] args) {
        linkedlist ll=new linkedlist();
        ll.append(100); // 100
        ll.append(200); // 100 200
        ll.append(300); // 100 200 300
        ll.append(400); // 100 200 300 400
        ll.append(500); // 100 200 300 400 500
        ll.display();
        ll.insertAtBeginning(00); // 0 100 200 300 400 500
        ll.display();
        ll.insertAt(4,250); // 0 100 200 250 300 400 500
        ll.display();
        ll.insertAt(7,450); // 0 100 200 250 300 400 450 500
        ll.display();
        ll.deleteBeginningNode();
        ll.display();
        ll.deleteLastNode();
        ll.display();
        ll.deleteAt(4);
        ll.display();
        ll.insertAt(4, 400);
        ll.display();
        ll.deleteAt(5);
        ll.display();
        System.out.println("Size of Linked List is: "+ll.size());
        ll.rotate(2);
        ll.display();
        ll.removeData(400);
        ll.display();
        System.out.println("Size of Linked List is: "+ll.size());
        System.out.println("Head "+ll.head.data);
        System.out.println("Tail "+ll.tail.data);
        ll.display();
    }
}
