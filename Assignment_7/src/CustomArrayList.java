
public class CustomArrayList<T> implements CustomList<T> {

	Object[] myArray = new Object[10];
	int size = 0;

	@Override
	public boolean add(T item) {

		if (size == myArray.length) {
			Object[] temp = new Object[size * 2];

			for (int i = 0; i < size; i++) {

				temp[i] = myArray[i];

			}
			myArray = temp;

			// myArray = Arrays.copyOf(myArray, myArray.length*2);
		}

		myArray[size] = item;
		size++;
		return true;
	}

	@Override
	public boolean add(int index, T item) throws IndexOutOfBoundsException {

		if (index > size) {
			throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
		}

		for (int i = size - 1; i >= index; i--) {
			myArray[i + 1] = myArray[i];
		}
		myArray[index] = item;
		size++;
		return true;

	}

	@Override
	public int getSize() {
		return size;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) throws IndexOutOfBoundsException {

		if (index >= size)
			throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
		return (T) myArray[index];
	}

	@SuppressWarnings("unchecked")
	@Override
	public T remove(int index) throws IndexOutOfBoundsException {

		if (index >= size) {
			throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
		}

		Object removedElement = myArray[index];

		for (int i = index; i < size - 1; i++) {
			myArray[i] = myArray[i + 1];
		}
		size--;

		return (T) removedElement;
	}

}
