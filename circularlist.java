package circularLinkedlist;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
public class circularList {
    private Node head;
    private Node tail;
    circularList(){
        head=null;
        tail=null;
    }
    private void insert2(int data){
        if(head==null){
            head=new Node(data);
            tail=head;
            tail.next=head;
        }
        else{
            Node temp=new Node(data);
            temp.next=head;
            tail.next=temp;
            tail=temp;
        }
    }
    private void insert(int data){
        if(head==null){
            head=new Node(data);
            tail=head;
        }
        else{
            Node temp=new Node(data);
            tail.next=temp;
            temp.next=head;
            tail=temp;
        }
    }
    private int len(){
        Node temp=head;
        int count=0;
        do{
          count++;
          temp=temp.next;
        }while(temp!=head);
        return count;
    }
    private void delete(int pos){
        if(pos<0||pos>=len()){
            return;
        }
        if(pos==0){
            Node temp=head;
            tail.next=head.next;
            head=head.next;
            temp=null;
        }
        else{
            int i=0;
            Node temp=head;
            while(i<pos-1){
                i++;
               temp=temp.next;
            }
            Node n=temp.next;
            temp.next=n.next;
            n=null;
        }
    }
    private void display(){
       Node temp=head;
       do{
            System.out.print(temp.data+"->");
            temp=temp.next;
        }while(temp!=head);
        System.out.println("Loops starts");
    }
    public static void main(String[] args) {
        circularList list=new circularList();
        for(int i=1;i<=5;i++){
            list.insert2(i);
        }
        list.display();
        list.delete(2);
        list.display();
    }
}
