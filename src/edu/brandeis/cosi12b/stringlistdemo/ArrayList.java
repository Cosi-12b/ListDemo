package edu.brandeis.cosi12b.stringlistdemo;

public class ArrayList<E> extends AbstractList<E> implements List<E> {
  private E[] list;
  private int size;
  private int capacity;

  public ArrayList() {
    this(20);
  }

  @SuppressWarnings("unchecked")
  public ArrayList(int initialCapacity) {
    list = (E[]) (new Object[initialCapacity]);
    size = 0;
    capacity = initialCapacity;
  }

  public int capacity() {
    return capacity;
  }

  public int size() {
    return size;
  }

  public void add(E val) {
    list[size] = val;
    size++;
  }

  public String toString() {
    StringBuffer s = new StringBuffer();
    s.append("[");
    for (int i = 0; i < size - 1; i++) {
      s.append(list[i]);
      s.append(", ");
    }
    s.append(list[size - 1]);
    s.append("]");
    return (s.toString());
  }

  public void set(int index, E value) {
    expandIfNecessary(index);
    for (int i = size; i > index; i--) {
      list[i] = list[i - 1];
    }
    list[index] = value;
    if (index > size)
      size = index + 1;
  }

  @SuppressWarnings("unchecked")
  private void expandIfNecessary(int index) {
    if (index < capacity)
      return;
    int newCapacity = capacity * 2 + index;
    E[] oldArray = list;
    list = (E[]) (new Object[newCapacity]);
    for (int i = 0; i < size; i++)
      list[i] = oldArray[i];
    capacity = newCapacity;
  }

  public E get(int index) {
    if (index < 0 || index >= size)
      throw new ArrayIndexOutOfBoundsException("i: " + index + " s: " + size);
    return list[index];
  }

  public void remove(int index) {
    for (int i = index; i < size; i++)
      list[i] = list[i + 1];
    size--;
  }

  public boolean isEmpty() {
    return size() == 0;
  }

  public int indexOf(String value) {
    for (int i = 0; i < size; i++) {
      if (list[i] == value)
        return i;
    }
    return -1;
  }

  public boolean contains(String value) {
    return (indexOf(value) != -1);
  }

  @Override
  public void add(int index, E value) {
    // TODO Auto-generated method stub
  }

  @Override
  public int indexOf(E value) {
    // TODO Auto-generated method stub
    return 0;
  }

}
