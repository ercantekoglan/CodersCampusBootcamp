package com.coderscampus.Lesson4_Generics;

public class MyPair<K,V> {
//	public class MyPair<K, V , T, A, B> {
//	private Integer id;
//	private String name;
	private K key;
	private V value;
	
	public MyPair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	
	
	
}
