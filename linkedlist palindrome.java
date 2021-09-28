class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}
class Solution
{
    static Node reverse(Node head){
        Node prev=null;
        Node curr=head;
        Node Next=null;
        while(curr!=null){
            Next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=Next;
        }
     curr=prev;
     return curr;
    }
    //Function to check whether the list is palindrome.
    static boolean isPalindrome(Node head) 
    {
//         Node temp=head;
//         Node Rhead=reverse(temp);
//         Node temp1=head;
//         Node temp2=Rhead;
//         while(head!=null&&Rhead!=null){
//             if(head.data!=Rhead.data){
//               return false;
//             }
//             head=head.next;
//             Rhead=Rhead.next;
            
        }
    return true;
    }    
  public static void main(String[] args){
       // Node head=new Node(5);
       // Node head2=new Node(2);
       // Node head3=new Node(4);
       // head.next=head2;
       // head2.next=head3;
       // head3.next=null;
       Node head=null;
       Scanner input=new Scanner(System.in);
       int val=input.nextInt();
       while(val!=-1){
           if(head==null){
               head=new Node(val);
           }
           Node newNode=new Node(val);
           head.next=newNode;
       // }
    // Node temp2=head;
    // Node  temp=reverse(temp2); 
    //   while(temp!=null){
    //       System.out.println(temp.data);
    //       temp=temp.next;
    //   }
      System.out.println(isPalindrome(head));      }
  }
}