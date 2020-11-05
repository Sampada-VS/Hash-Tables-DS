package com.bridgelabz.datastructure;

public class HashMapNode<K,V> implements INode<K> {
	K key;
	V value;
	HashMapNode<K,V> next;

	public HashMapNode(K key, V value) {
		this.key=key;
		this.value=value;
		next=null;
	}
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key=key;
	}
	public INode<K> getNext() {
		return next;
	}
	public void setNext(INode<K> next) {
		this.next= (HashMapNode<K,V>) next;
	}
	public V getValue() {
		return this.value;
	}
	public void setValue(V value) {
		this.value=value;
	}
	public String toString() {
		StringBuilder hashMapNodeString=new StringBuilder();
		hashMapNodeString.append("Map Nodes{ "+"K = ").append(key)
				.append(" V = ").append(value).append(" } ");
		if(next != null)
			hashMapNodeString.append(" -> ").append(next);
		return hashMapNodeString.toString();
	}
}
