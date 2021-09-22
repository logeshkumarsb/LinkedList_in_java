public class DoubleLinkedList<T> {
 private LinkedListNode<T> Node;
 public void insert(T data) {
	 //first value
	 if(Node==null) {
		 Node=new LinkedListNode<>(data);
		 Node.prev=null;
		 return;
	 }
	 //next values;
	 LinkedListNode<T> newNode=new LinkedListNode<>(data);
	 Node.next=newNode;
	 newNode.prev=Node;
//	 newNode.next=null;
 }
public void insertFirst(T data){
    if(Node==null){
       	 Node=new LinkedListNode<>(data);
		 Node.prev=null;
		 return; 
    }
    LinkedListNode<T> newNode=new LinkedListNode<>(data);
    Node.prev=newNode;
    newNode.next=Node;
    Node=newNode;
}
public int size(){
    int count=0;
    LinkedListNode<T> temp=Node;
    while(Node!=null){
        count++;
        Node=Node.next;
    }
return count;
}
public void insertAt(T data,int pos){
    if(Node==null){
        Node=new LinkedListNode<T>(data);
        Node.prev=null;
    }
    if(pos<=0){
        System.out.println("invalid");
        return;
    }
    if(pos==1){
        LinkedListNode<T> newNode=new LinkedListNode<T>(data);
        Node.prev=newNode;
        newNode.next=Node;
        newNode.prev=null;
        Node=newNode;
    }
    else{
        LinkedListNode<T> temp=Node;
        int count=1;
        while(temp!=null&&pos>2){
          temp=temp.next;
          pos--;
        }
        if(temp!=null){
        LinkedListNode<T> newNode=new LinkedListNode<T>(data);
        newNode.next=temp.next;
        newNode.prev=temp;
        if(temp.next!=null){
        temp.next.prev=newNode;
        }
        temp.next=newNode;
        
        }
        else{
            return;
        }
    }
}
public LinkedListNode<T> del(LinkedListNode<T> temp){
if(temp==null||Node==null){
      return null;
  }
  if(Node==temp){
      Node=temp.next;
  }
  if(temp.next!=null){
      temp.next.prev=temp.prev;
  }
 if(temp.prev!=null){
     temp.next.prev=temp.next;
 }
 temp=null;
 return Node;
}
public LinkedListNode<T> delete(int pos){
  if(pos<=0||pos>size()){
      System.out.println("invalid position");
      return null;
  }
 if(pos==1){
     if(Node.next!=null){
         Node.next.prev=null;
     }
    Node=Node.next;
    return Node;
 }
LinkedListNode<T> temp=Node;
// int count=1;
while(temp!=null&&pos>1){
    pos--;
    temp=temp.next;
  }
  if(temp==null){
      return null;
  }
  if(temp.next!=null){
      temp.next.prev=temp.prev;
  }
 temp.prev.next=temp.next;
 return Node;
}
 public void print() {
     LinkedListNode<T> temp=Node;
	 if(temp==null) {
		 return;
	 }
	 while(temp!=null) {
         System.out.print(temp.data+"->");
		 temp=temp.next;
	 }
     System.out.print("Null");
 }
 public static void main(String[] args) {
	 DoubleLinkedList<Integer> list=new DoubleLinkedList<>();
	 list.insert(4);
	 list.insert(6);
    // list.print();
     list.insertAt(1,1);
     // list.print();
     list.insertFirst(3);
     list.insertFirst(10);
     list.insertAt(5,6);
     // list.delete(2);
	 list.print();
 }
}
class LinkedListNode<T>{
	T data;
	LinkedListNode<T> next;
	LinkedListNode<T> prev;
	LinkedListNode(T data){
		this.data=data;
	}
}