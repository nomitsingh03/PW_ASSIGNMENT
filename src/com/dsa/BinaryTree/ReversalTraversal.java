package BinaryTree;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class ReversalTraversal {
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
    private static void displayROT(Node root){
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        list.add(root.data);
        while(!q.isEmpty()){
            ArrayList<Integer> ans= new ArrayList<>();
            int size=q.size();
            for(int i=0;i<size;i++){
                Node temp = q.poll();
                if(temp.left!=null){
                    q.add(temp.left);
                    ans.add(temp.left.data);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                    ans.add(temp.right.data);
                }
            }
            Collections.reverse(ans);
            list.addAll(ans);
        }
        Collections.reverse(list);
        for(Integer i: list)
        System.out.print(i+" ");
    }
    private static void display(Node root){
        Queue<Node> q = new LinkedList<>();
        ArrayList<Integer> list=new ArrayList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node temp =q.poll();
            list.add(temp.data);
            if(temp.left!=null)
            q.add(temp.left);
            if(temp.right!=null)
            q.add(temp.right);
        }
        for(Integer i: list) System.out.print(i+ " ");
    }

    

   
    public static void main(String[] args){
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.right.left=new Node(5);
        root.right.right=new Node(6);
        root.right.left.left=new Node(7);
        root.right.left.right=new Node(8);

        System.out.print("Reverse Order Traversal of given Tree : ");
         display(root);
         System.out.println();
        displayROT(root);
    }
}
