package com.practice.algorithms;

public class linkedlist {


	
	
	public Node head ;
	//public Node tail ;
	
	public linkedlist(){
		head = null;
		//tail = null;	
	}
	
	public void addNode(int nodeValue){
		
		if(head == null){
			head.value = nodeValue;
			head.next = null;
		}
		else
		{
			while(head.next != null){
				Node newNode = new Node();
				head.next = newNode;
				
			}
		}
		
	}
	
	
	
class Node
{
		
		int value;
		Node next;

		public Node(){
			this.next = null;
			this.value = 0;			
		}
		
		
		public Node(int val, Node n){
			this.next = n;
			this.value = val;
		}
		
		/**
		 * This method attaches next reference to a node 
		 * @param n is a new node
		 */
		public void setLink(Node n){
			this.next = n;
		}
		
		/**
		 * This method sets the value of a Node
		 * @param val is the value of a node
		 */
		public void setValue(int val){
			this.value = val;
		}
		
		/**
		 * This method returns the next reference node
		 * @return
		 */
		public Node getNode(){
			return this.next;
		}
		
		/**
		 * This method returns the value of current node
		 * @return
		 */
		public int getValue(){
			return this.value;
		}
		
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		linkedlist item1 = new linkedlist();
		
		
		
	}

}


