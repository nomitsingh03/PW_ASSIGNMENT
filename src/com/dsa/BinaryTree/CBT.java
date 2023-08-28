
// Q2. Given the root of a binary tree, check if it is a complete binary tree or not. A complete binary 
// tree is a binary tree in which every level, except possibly the last, is filled, and all nodes are as far 
// left as possible.


package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class CBT {
    
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int var){
            this.data=var;
            left=null;
            right=null;
        }
    }

    private static boolean isCBT(Node root){
        Queue<Node> q = new LinkedList<>();
        if(root==null) return true;
        q.add(root);
        while(!q.isEmpty() && q.peek()!=null){
            Node temp=q.poll();
            q.add(temp.left);
            q.add(temp.right);
        }
        while(!q.isEmpty()){
            if(q.peek()!=null) return  false;
            q.poll();
        }
        return true;
    }
    public static void main(String[] args){
        Node root = new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left = new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);

        System.out.println("Given tree is Complete Binary Tree : "+isCBT(root));

        Node head=new Node(1);
        head.left=new Node(2);
        head.right=new Node(3);
        head.left.left=new Node(4);
        head.right.left=new Node(5);
        head.right.right=new Node(6);

        System.out.println("Given tree is Complete Binary Tree: "+isCBT(head));

    }
}
