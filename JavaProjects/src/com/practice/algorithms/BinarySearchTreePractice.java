package com.practice.algorithms;

import java.util.Currency;

public class BinarySearchTreePractice {

	Node root = null;
		
	public void insert(int val){
		// Creating a new node of value "val"
		Node newNode = new Node(val);
		if(root == null)
		{
			root = newNode;
			return;
		}
		Node current = root;
		Node parentNode = null;
		while(true){
			parentNode = current;
			if(val < current.data)
			{	
				current = current.left;
				if(current == null)
				{	
					parentNode.left = newNode;
					return;
				}
			}
			else if(val > current.data){
				current= current.right;
				if(current == null){
					parentNode.right = newNode;
					return;
				}
			}
		}
	}
	
	public boolean find(int key)
	{
		
		Node current = root;
		while(current!=null){
			
			if(current.data == key)
				return true;
			else
			if( key < current.data)
				current = current.left;
			else 
				if(key > current.data)
					current = current.right;
		}
		return false;
	}
	
	
	public boolean delete(int val){
		
		Node current = root;
		Node parentNode = root;
		boolean isLeftChild = false;
		
		while(current.data!=val){
			
			if(val < current.data){
				parentNode = current;
				isLeftChild = true;
				current = current.left;
			}
			else if(val > current.data)
			{
				parentNode =current;
				isLeftChild = false;
				current = current.right;
			}
			
			if(current == null)
				return false;
		}
		
		//Case 1: A node to be deleted has no children
		
		if(current.left == null && current.right == null)
		{
			if(isLeftChild){
				parentNode.left = null;
				return true;
			}
			else{
				parentNode.right = null;
				return true;
			}
		}
		
		//Case 2: Any one of children is null
		else 
			if(current.left == null && current.right != null){
				if(isLeftChild){
					parentNode.left = current.right;
				}
				else
					parentNode.right = current.right;
			}
			else 
				if(current.left != null && current.right == null){
					if(isLeftChild){
						parentNode.left = current.left;
					}
					else
						parentNode.right = current.left;
				}
		
		//Case 3: Node to be deleted has 2 children.
				else 
					if(current.left != null && current.right != null){
						
						Node replaceWithNode = successor(current);
						if(current == root)
						{
							root = replaceWithNode;
						}
						else if(isLeftChild)
							parentNode.left = replaceWithNode;
						else 
							parentNode.right = replaceWithNode;
						
						//To attach delNode's left tree to new Node.
						replaceWithNode.left = current.left;
					}
		return true;
	}
	
	
	public Node successor(Node delNode){
		
		Node successor = null;
		Node parentSuccessor = null;
		Node current = delNode.right;
		
		while(current!=null)
		{
			parentSuccessor = successor;
			successor = current;
			current = current.left;
		}
		
		if(successor.right != null){
			
			parentSuccessor.left = successor.right;
			successor.right = delNode.right;
			
		}
		return successor;
		
	}
	
	
	public void display(Node root){
		if(root!=null){
			display(root.left);
			System.out.print(" " + root.data);
			display(root.right);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinarySearchTreePractice bs = new BinarySearchTreePractice();
		System.out.println("Entered");
		bs.insert(10);
		bs.insert(5);
		bs.insert(15);
		bs.insert(3); bs.insert(8);
		bs.insert(20);
		bs.insert(12);
		bs.display(bs.root);
		System.out.println("\nKey 20 presense is " + bs.find(20));
		bs.delete(12);
		System.out.println("New tree");
		bs.display(bs.root);
		
	}

	
	class Node{
		int data;
		Node left;
		Node right;
		
		public Node(int data){
		this.data = data;
		this.left = null;
		this.right = null;
		}
	}
	
	
}
