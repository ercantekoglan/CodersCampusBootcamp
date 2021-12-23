package com.coderscampus.Assignment5;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	int size = 0;

	@Override
	public boolean add(T item) {

		if (items.length == size) {

			Object[] temp = new Object[size * 2];

			for (int i = 0; i < size; i++) {
				temp[i] = items[i];

			}
			items = temp;
		}

		items[size] = item;
		size++;

		return true;
	}

	@Override
	public int getSize() {

		return size;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) {
		return (T) items[index];
	}

}
