package LinkedList;
// Q1. Given a linked list and a key ‘X‘ in, the task is to check if X is present in the linked list or not.

import java.util.Scanner;

class Node{
    int data;
    Node next;
    public Node(int data,Node next){
        this.data=data;
        this.next=null;
    }
}
public class Que1 {

    public static Node create(Node root, int data){
        Node ptr = new Node(data,null);
        root.next=ptr;
        return root.next;
    }
    public static void main(String args[]){
        Node root = new Node(10,null);
        Node head = root;
        root=create(root,12);
        root=create(root,13);
        root=create(root,14);
        root=create(root,15);
        root=create(root,16);
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter key to search ");
        int n = sc.nextInt();
        boolean f= true;
        while(head!=null){
            if(head.data==n)
            {
                System.out.println("Yes, key is found");
                f=false;
            }    head=head.next;
        }
        if(f) System.out.println("Key is not found in list");
    }
}
