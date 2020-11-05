package com.bridgelabz.datastructure;

public class HashMaps<K,V> {
	LinkedListHash<K> linkedlisthash;
	
	public HashMaps() {
		this.linkedlisthash=new LinkedListHash<>();
	}
	public V get (K key) {
		HashMapNode<K, V> hashmapnode=(HashMapNode<K,V>) this.linkedlisthash.search(key);
		return (hashmapnode == null) ? null : hashmapnode.getValue();
	}
	public void add(K key, V value) {
		HashMapNode<K,V> hashmapnode=(HashMapNode<K,V>) this.linkedlisthash.search(key);
		if (hashmapnode == null) {
			hashmapnode=new HashMapNode<>(key,value);
			this.linkedlisthash.append(hashmapnode);
		}else {
			hashmapnode.setValue(value);
		}
	}
	@Override
	public String toString() {
		return "Hash Map Nodes { "+ linkedlisthash + " } " ;
	}
}