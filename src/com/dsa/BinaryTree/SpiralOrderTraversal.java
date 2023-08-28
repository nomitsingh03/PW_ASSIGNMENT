package BinaryTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;


public class SpiralOrderTraversal{

    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            left=null;
            right=null;
        }
    }
    public static void display(ArrayList<Integer> list){
        for(int i: list) System.out.print(i+" ");
        System.out.println();
    }
    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right=new Node(3);
        root.left.left= new Node(4);
        root.right.left=new Node(5);
        root.right.right=new Node(6);
        root.right.left.left=new Node(7);
        root.right.left.right=new Node(8);
        ArrayList<Integer> list=  findSpiral(root);
        ArrayList<Integer> list2= findSpiral2(root);
        display(list);
        display(list2);
    }

     public static ArrayList<Integer> findSpiral(Node root) 
    {
        // Your code here
        ArrayList<Integer> list = new ArrayList<>();
        list.add(root.data);
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        boolean flag=false;
        while(!q.isEmpty()){
            ArrayList<Integer> ans = new ArrayList<>();
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
            if(flag){
                Collections.reverse(ans);
            }
                list.addAll(ans);
                flag=!flag;
        }
        return list;
    }

    private static ArrayList<Integer> findSpiral2(Node root){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(root.data);
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        boolean flag=false;
        while(!q.isEmpty()){
            ArrayList<Integer> list1=new ArrayList<>();
            int size=q.size();
            for(int i=0;i<size;i++){
                Node temp = q.poll();
                if(temp.right!=null){
                    q.add(temp.right);
                    list1.add(temp.right.data);
                }
                if(temp.left!=null){
                    q.add(temp.left);
                    list1.add(temp.left.data);
                }
            }
            if(flag){
                Collections.reverse(list1);
            }
            list.addAll(list1);
            flag=!flag;
        }

        return list;
    }
}