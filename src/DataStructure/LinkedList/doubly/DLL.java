package DataStructure.LinkedList.doubly;
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
public class DLL {
    node head;

    DLL(){
        head=null;
    }

    void insertathead(int val){
        node n=new node(val);
        if(head!=null){
            n.next=head;
            head.previous=n;
        }
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
        n.previous=temp;

    }
    void deleteathead(){
        if (head==null){
            return;
        }
        node todelete=head;
        head=head.next;

        if (head != null) {
            head.previous=null;
        }
        todelete=null;
    }
    void deletebyval(int val){
        if(head==null){
            return;
        }
        node temp=null;
        while (temp.data!=val){
            temp=temp.next;
        }
        if (temp==null){
            System.out.println("value not found");
            return;
        }
    }
}
class driver{
    static void main(String[] args) {

    }
}