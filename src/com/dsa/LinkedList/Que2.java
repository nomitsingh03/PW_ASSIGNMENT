// Q2. Insert a node at the given position in a linked list. We are given a pointer to a node, and the
// new node is inserted after the given node.

package LinkedList;

import java.util.Scanner;

public class Que2 {
    public static Node create(Node root, int data){
        Node ptr = new Node(data,null);
        root.next=ptr;
        return root.next;
    }

    public static void insert(Node head){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter position after node to be insert");
        int p = sc.nextInt();
        System.out.println("enter data : ");
        int d = sc.nextInt();
        Node ptr = new Node(d,null);
        Node temp =head;
        while(p>1){
            temp = temp.next;
            p--;
        }
        ptr.next=temp.next;
        temp.next=ptr;
    }

    public static void display(Node root){
        Node temp=root;
        while(temp.next!=null){
            System.out.print(temp.data +"->");
            temp=temp.next;
        }
        System.out.print(temp.data);
        System.out.println();
    }
    public static void main(String args[]){
        Node root = new Node(10,null);
        Node head = root,temp=head;
        root=create(root,12);
        root=create(root,13);
        root=create(root,14);
        root=create(root,15);
        root=create(root,16);
        display(temp);
        insert(head);
        display(head);
    }    
}
