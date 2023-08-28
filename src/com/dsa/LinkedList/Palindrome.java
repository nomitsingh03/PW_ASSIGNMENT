package LinkedList;

public class Palindrome {

    public static Node Reverse(Node temp){
        Node root=temp;
        Node prev=null;
        Node curr=root;
        Node forw=curr.next;
        while(forw!=null){
            curr.next=prev;
            prev=curr;
            curr=forw;
            forw=forw.next;
        }curr.next=prev; 
        root=curr;
        return root;
    }
      
    public static void main(String[] args){
        Node root = new Node(10,null);
        Node head = root;
        root=Que1.create(root,12);
        root=Que1.create(root,13);
        root=Que1.create(root,14);
        root=Que1.create(root,15);
        root=Que1.create(root,16);
        Que2.display(head);
        Node head2 = Reverse(head);
        Que2.display(head2);
        int c=1;
        while(head2!=null && head!=null) {
            if(head.data!=head2.data) c=0;
            head=head.next;
            head2=head2.next;
        }
        if(c==1){
            System.out.println("Linked List is palindrome");
        } else {
            System.out.println("LinkedList is not Palindrome");
        }

        Node root2 = new Node(10,null);
        Node head1 = root2;
        root2=Que1.create(root2,12);
        root2=Que1.create(root2,13);
        root2=Que1.create(root2,14);
        root2=Que1.create(root2,13);
        root2=Que1.create(root2,12);
        root2=Que1.create(root2,10);
        Que2.display(head1);
        Node head3 = Reverse(head1);
        Que2.display(head3);
        c=1;
        while(head3!=null && head1!=null){
            if(head1.data!=head3.data) c=0;
            head1=head1.next;
            head3=head3.next;
        }
        if(c==1){
            System.out.println("Linked List is palindrome");
        } else {
            System.out.println("LinkedList is not Palindrome");
        }

    }
}
