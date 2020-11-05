package com.bridgelabz.datastructure;

import java.util.ArrayList;

public class LinkedHashMaps<K,V> {
	private final int numOfBuckets;
	ArrayList<LinkedListHash<K>> bucketArray;
	
	public LinkedHashMaps(){
		this.numOfBuckets=10;
		this.bucketArray=new ArrayList<>(numOfBuckets);
		for(int i=0; i < numOfBuckets; i++)
			this.bucketArray.add(null);
	}
	private int getBucketIndex(K key) {
		int hashCode=Math.abs(key.hashCode());
		int index=hashCode % numOfBuckets;
		return index;
	}
	public V get(K key) {
		int index=this.getBucketIndex(key);
		LinkedListHash<K> linkedListHash=this.bucketArray.get(index);
		if(linkedListHash == null)
			return null;
		HashMapNode<K, V> hashMapNode=(HashMapNode<K,V>)linkedListHash.search(key);
		return (hashMapNode == null) ? null : hashMapNode.getValue();
	}
	public void add(K key,V value) {
		int index=this.getBucketIndex(key);
		LinkedListHash<K> linkedListHash=this.bucketArray.get(index);
		if(linkedListHash == null) {
			linkedListHash = new LinkedListHash<>();
			this.bucketArray.set(index, linkedListHash);
		}
		HashMapNode<K, V> hashMapNode=(HashMapNode<K,V>)linkedListHash.search(key);
		if (hashMapNode == null) {
			hashMapNode=new HashMapNode<>(key, value);
			linkedListHash.append(hashMapNode);
		}else {
			hashMapNode.setValue(value);
		}
	}
	@Override
	public String toString() {
		return "Linked HashMap List { "+bucketArray+" } ";
	}
}
