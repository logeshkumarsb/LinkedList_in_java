public class LinkedListNode<T> {
  T data;
  LinkedListNode<T> next;
  public LinkedListNode(T data){
	  this.data=data;
  }
  public LinkedListNode() {	  
  }
	LinkedListNode<T> root=null;
	  public  void insert(T data) {
          LinkedListNode<T> head=null;
          LinkedListNode<T> tail=null;
		  if(root==null) {
		   		root=new LinkedListNode<>(data);
		   		return;
		   	}
		   	else{
		   	   LinkedListNode<T> newNode=new LinkedListNode<>(data);
               newNode.next=root.next;
               root.next=newNode;
		   	}
	  }

	public void Print() {
		while(root!=null) {
			System.out.print("|"+root.data+"|"+"->");
			root=root.next;
		}
		System.out.print("null");
	}
   public int Size(LinkedListNode<T> root) {
	   int count=0;
	   while(root!=null) {
		   count++;
		   root=root.next;
	   }
	   return count;
   }
   public void delete(int pos) {
	   if(pos==0) {
		   root=root.next;
		   return;
	   }
	   if(pos<0||pos>Size(root)){
		   System.out.println("Invalid Position");
		   return;
	   }
	   LinkedListNode<T> temp=root;
       LinkedListNode<T> prev=null;
	   int count=0;
       prev=temp;
	   while(temp!=null&&count<pos-1) {
		   prev=prev.next;
           // temp=temp.next;
           count++;
	   }
	   prev.next=prev.next.next;
   }
   public static void main(String args[]) {
	   LinkedListNode<Integer> node=new LinkedListNode<>();
	   node.insert(5);
	   node.insert(6);
	   node.insert(4);
	   node.insert(4);
	   node.insert(3);
	   node.insert(3);
	   node.delete(9);
	   node.Print();
   }
}
