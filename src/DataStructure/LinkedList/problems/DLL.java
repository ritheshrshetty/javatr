package DataStructure.LinkedList.problems;
class node {
    int data;
    node next;
    node previous;

    node(int data){
        this.data=data;
        this.next=null;
        this.previous=null;
    }
}
public class DLL { node head;

    DLL(){
        head=null;
    }

    void insertathead(char val){
        node n=new node(val);
        if(head!=null){
            n.next=head;
            head.previous=n;
        }
        head=n;
    }
    void rotateby(char N){
        node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=head;
        head.previous=temp;
        while (N-->0){
            temp=head.next;
            temp=temp.next;
        }
        temp.next=null;
    }
    void display(){
        node temp=head;
        while (temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
    }
}
class driver{
    static void main(String[] args) {
        DLL dll=new DLL();
        dll.insertathead('e');
        dll.insertathead('d');
        dll.insertathead('c');
        dll.insertathead('b');
        dll.insertathead('a');
        dll.display();
        System.out.println();
        char N='3';
        dll.rotateby(N);
        dll.display();
    }
}