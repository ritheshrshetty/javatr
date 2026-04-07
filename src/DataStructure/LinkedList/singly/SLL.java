package DataStructure.LinkedList.singly;

class node {
    int data;
    node next;

    node(int data){
        this.data=data;
        this.next=null;
    }
}
public class SLL{
    node head;
    SLL(){
        head=null;
    }
    void insertathead(int val){
        node n=new node(val);
        n.next=head;
        head=n;
    }
    void insertattail(int val){
        node n=new node(val);
        if (head==null){
            head=n;
            return;
        }
        node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=n;
    }
    void deleteathead(){
        if (head==null){
            System.out.println("there is of element");
        }
        node todelete=head;
        head =head.next;
        todelete=null;
    }
     void deletebyval(int val){
        if(head==null){
            return;
        }
        if (head.data==val){
            deleteathead();
            return;
        }
        node temp=head;
        while (temp.next.data!=val){
            temp=temp.next;
        }
        if (temp.next==null){
            System.out.println("value not found");
            return;

        }
        node todelete=temp.next;
        temp.next=temp.next.next;
        todelete=null;
    }
    void printSLL(){
        node temp=head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
class driver{
    static void main(String[] args) {
        SLL sll=new SLL();
        sll.insertattail(500);
        sll.printSLL();
        System.out.println();
        sll.insertathead(10);
        sll.insertathead(20);
        sll.insertathead(30);
        sll.insertathead(40);
        sll.insertathead(50);
        sll.printSLL();
        System.out.println();
        sll.deletebyval(70);
        sll.printSLL();
    }
}