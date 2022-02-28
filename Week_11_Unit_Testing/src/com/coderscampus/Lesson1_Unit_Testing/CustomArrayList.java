package com.coderscampus.Lesson1_Unit_Testing;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	int size = 0;
	@Override
	public boolean add(T item) {
		if(items.length == size) {
		expandBackingObjectArray();
		}
		 items[size++] = item;
		//size++;
		return true;
	}

	private void expandBackingObjectArray() {
		// TODO Auto-generated method stub
		Object[] oldArray = items;
		items = new Object[size*2];
		for(int i =0; i<oldArray.length; i++) {
			items[i] = oldArray[i];
		}
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public T get(int index) {
		// TODO Auto-generated method stub
		return (T) items[index];
	}

}
