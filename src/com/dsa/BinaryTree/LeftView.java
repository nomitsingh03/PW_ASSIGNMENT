package BinaryTree;
import java.util.ArrayList;


// public class LeftView {
//     static class Node{
//         int data;
//         Node left,right;
//         Node(int data){
//             this.data=data;
//             left=null;
//             right=null;
//         }
//     }
//     public static void display(ArrayList<Integer> list){
//         for(int i: list) System.out.print(i+" ");
//         System.out.println();
//     }
//     public static void main(String[] args){
//         Node root = new Node(1);
//         root.left = new Node(2);
//         root.right=new Node(3);
//         root.left.left= new Node(4);
//         root.right.left=new Node(5);
//         root.right.right=new Node(6);
//         root.right.left.left=new Node(7);
//         root.right.left.right=new Node(8);
//         ArrayList<Integer> list=  leftView(root) ;
//         display(list);  // 1 2 4 5 7
//     }
//      static void help(Node root, ArrayList<Integer> list){
//        if(root==null) return ;
//        if(root.left!=null) list.add(root.left.data);
//        help(root.left, list);
//        help(root.right, list);
//     }
//     //Function to return list containing elements of left view of binary tree.
//     static ArrayList<Integer> leftView(Node root)
//     {
//       // Your code here
//      ArrayList<Integer> list = new ArrayList<>();
//      if(root==null) return list;
//      list.add(root.data);
//      help(root, list);
//      return list;
//     }
// }


// Method 2
public class LeftView {
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
        ArrayList<Integer> list=  leftView(root) ;
        display(list);  // 1 2 4 7
    }
     static void help(Node root, ArrayList<Integer> list,int i){
       if(root==null) return ;
       if(list.size()==i) list.add(root.data);
       help(root.left, list, i+1);
       help(root.right, list, i+1);
    }
    //Function to return list containing elements of left view of binary tree.
    static ArrayList<Integer> leftView(Node root)
    {
      // Your code here
     ArrayList<Integer> list = new ArrayList<>();
     if(root==null) return list;
     help(root, list, 0);
     return list;
    }
}