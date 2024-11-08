package com.placement.oops;

public class BinarysearchTree{
	  Node root;
	  class Node{
	    int data;
	    Node left;
	    Node right;
	    public Node(int val){
	      data=val;
	    }
	  }
	  public void insert(int val){
	  root=insert(root,val);
	}
	public Node insert(Node node,int val){
	  if(node==null){
	    Node x=new Node(val);
	    return x;
	  }
	  else if(val<node.data)
	    node.left=insert(node.left,val);
	  else if(val>node.data)
	    node.right=insert(node.right,val);
	  return node;
	}

	public static void main(String args[]){
		BinarysearchTree tree=new BinarysearchTree();
	  tree.insert(45);
	  tree.insert(30);
	  tree.insert(25);
	}
	  
	}