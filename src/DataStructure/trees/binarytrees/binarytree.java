package DataStructure.trees.binarytrees;


import java.util.LinkedList;
import java.util.Queue;

class node {
    int data;
    node left;
    node right;


    node(int data){
        this.data=data;
        this.left=null;
        this.right=null;

    }
    
}
public class binarytree{
    static node createnode(int val){
        return new node(val);

    }
    static void  DFS(node root){
        if (root==null){
            return;
        }
        System.out.print(root.data+" ");
        DFS(root.left);
        DFS(root.right);
    }
     static void BFS(node root){
        Queue<node> q=new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            node temp = q.poll();
            System.out.print(temp.data + " ");
            if (temp.left != null) {
                q.offer(temp.left);
            }
            if (temp.right != null) {
                q.offer(temp.right);
            }
        }
    }
        static int height(node root){
            if (root==null){
                return 0;

            }
            int leftheight=height(root.left);
            int rightheight=height(root.right);
            return Math.max(leftheight,rightheight)+1;

    }

    static void main(String[] args) {
        node root=createnode(1);
        root.left=createnode(2);
        root.right=createnode(3);
        root.left.left=createnode(4);
        root.left.right=createnode(5);
        root.right.left=createnode(6);
        root.right.right=createnode(7);
        root.left.right.left=createnode(8);
        root.right.left.left=createnode(15);
        root.right.left.right=createnode(9);
        System.out.println("predefs traversal");
        DFS(root);
        System.out.println();
        System.out.println("prebfs traversal");
        BFS(root);
        System.out.println();


    }
}