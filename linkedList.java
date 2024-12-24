public class linkedList {
    public static class Node{
        int data;
        Node next;
        Node(){
            // Default Constructor
        }
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static void display(Node head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
    static void displayRecursively(Node head){
        if(head==null){
            return;
        }
        System.out.print(head.data+" ");
        displayRecursively(head.next);
    }
    static void reverseDisplay(Node head){
        if(head==null){
            return;
        }
        reverseDisplay(head.next);
        System.out.print(head.data+" ");
    }
    static int size(Node head){
        int count=0;
        while(head!=null){
            count++;
            head=head.next;
        }
        return count;
    }
    static int sizeRecursively(Node head){
        if(head==null){
            return 0;
        }
        return 1+sizeRecursively(head.next);
    }
    public static void main(String args[]){
        Node a=new Node(100);
        Node b=new Node(200);
        Node c=new Node(300);
        Node d=new Node(400);
        Node e=new Node(500);
        Node f=new Node(600);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;

        display(a);
        System.out.println();
        displayRecursively(a);
        System.out.println();
        reverseDisplay(a);
        System.out.println();
        System.out.println("Size of List is: - "+size(a));
        System.out.println("Size of List is: - "+sizeRecursively(a));
    }
}
