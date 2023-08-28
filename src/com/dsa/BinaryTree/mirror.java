package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class mirror {
    static class Node{
        int data;
        Node left,right;
        Node(int val){
            this.data=val;
            left=null;
            right=null;
        }
    }

    private static void display(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        display(root.left);
        display(root.right);
    }

    private static void tree_Mirror(Node root){
        if(root==null) return;
        tree_Mirror(root.left);
        tree_Mirror(root.right);
            Node curr=root.left;
            root.left=root.right;
            root.right=curr;

    }
    public static void main(String[] args){
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        display(root);
        tree_Mirror(root);
        System.out.println("Mirror of above tree");
        display(root);
    }
}
