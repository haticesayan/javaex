package lab9;

import static java.lang.Math.max;
import java.util.*;
 class Node {
   int id, balance_factor;
   Node left,right;
   Node(int d){
   id=d;
  balance_factor=1;
   }}

class AVLtree{
Node root;
Node rightRotate(Node y){Node x = y.left; 
        Node T2 = x.right;
        x.right = y; 
        y.left = T2; 
        y.balance_factor = max(balance_factor (y.left), balance_factor (y.right)) + 1; 
        x.balance_factor  = max(balance_factor (x.left), balance_factor (x.right)) + 1;  
        return x; }

Node leftRotate(Node x){ Node y = x.right; 
        Node T2 = y.left; 
        y.left = x; 
        x.right = T2; 
        x.balance_factor = max(balance_factor(x.left), balance_factor(x.right)) + 1; 
        y.balance_factor = max(balance_factor(y.left), balance_factor(y.right)) + 1; 
  
        return y; 
    } 
int balance_factor(Node node){
if(node==null){return 0;}
else return node.balance_factor;

}
int getBalance(Node n){
if(n==null){return 0;}
else return balance_factor(n.left)-balance_factor(n.right);

}
Node insert(Node node, int id){if (node == null) 
            return (new Node(id)); 
        if (id< node.id) 
            node.left = insert(node.left, id); 
        else if (id > node.id) 
            node.right = insert(node.right, id); 
        else 
            return node; 
  
        node.balance_factor = 1 + max(balance_factor(node.left), 
         balance_factor(node.right)); 
        int balance = getBalance(node); 
  
        if (balance > 1 && id < node.left.id) 
            return rightRotate(node); 
  
        if (balance < -1 && id > node.right.id) 
            return leftRotate(node); 
  
        if (balance > 1 && id > node.left.id) { 
            node.left = leftRotate(node.left); 
            return rightRotate(node); 
        } 
        if (balance < -1 && id < node.right.id) { 
            node.right = rightRotate(node.right); 
            return leftRotate(node); 
        } 
        
        return node; }

void preOrder(Node node){
if(node!=null){
System.out.println(node.id+"");
preOrder(node.left);
preOrder(node.right);
}
}

    public static void main(String[] args) {
    AVLtree tree=new AVLtree();
    tree.root=tree.insert(tree.root,10);
    tree.root=tree.insert(tree.root,20);
    tree.root=tree.insert(tree.root,30);
    tree.root=tree.insert(tree.root,40);
    tree.root=tree.insert(tree.root,50);
    tree.root=tree.insert(tree.root,25);
    System.out.println("Preorder traversal"+"of constacted tree is:");
    tree.preOrder(tree.root);
    
    }
    
}
