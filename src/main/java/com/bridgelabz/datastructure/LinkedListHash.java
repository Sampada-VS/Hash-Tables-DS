package com.bridgelabz.datastructure;

public class LinkedListHash <K> {
	INode<K> head;
	INode<K> tail;
	
	public LinkedListHash() {
		this.head=null;
		this.tail=null;
	}
	public void append (INode<K> newNode) {
		if (this.head==null)
			this.head=newNode;
		if(this.tail==null)
			this.tail=newNode;
		else {
			this.tail.setNext(newNode);
			this.tail=newNode;
		}
	}
	public INode<K> search(K key) { 
        INode<K> tempNode = head;
        while (tempNode != null && tempNode.getNext() != null) 
        { 
            if (tempNode.getKey().equals(key)) { 
                return tempNode;  
            }
            tempNode = tempNode.getNext(); 
        } 
        return null; 
    }
	public void printMyNodes() {
		System.out.println("All nodes :"+head);
	}
	@Override
	public String toString() {
		return "LinkedList Nodes { "+head+" } ";
	}
}
