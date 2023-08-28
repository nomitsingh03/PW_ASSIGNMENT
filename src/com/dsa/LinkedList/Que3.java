// Q3. Given the head of a sorted linked list, delete all duplicates such that each element
// appears only once. Return the linked list sorted as well.

package LinkedList;

public class Que3 {

    public static Node create(Node root, int data){
        Node ptr = new Node(data,null);
        root.next=ptr;
        return root.next;
    }
    public static Node dublicateRemover(Node root){
        Node temp=root;
        while(temp.next!=null){
            if(temp.data==temp.next.data){
                Node ptr =temp.next.next;
                temp.next=ptr;
            }
            else temp=temp.next;
        }
        return root;
    }
    public static void main(String[] args){
        Node head = new Node(1,null);
        Node root=head;
        Node temp=head;
        root=create(root,1);
        root=create(root,1);
        root=create(root,2);
        root=create(root,2);
        root=create(root,2);
        root=create(root,3);
        root=create(root,5);
        root=create(root,6);
        root=create(root,6);
        Que2.display(temp);
        // temp=head;
        head=dublicateRemover(head);
        Que2.display(head);
    }
    
}
