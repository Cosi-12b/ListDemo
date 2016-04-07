package edu.brandeis.cosi12b.stringlistdemo;

public class StringArrayList implements StringList {
  private String[] list;
  private int size;
  private int capacity;

  public StringArrayList() {
    this(20);
  }

  public StringArrayList(int initialCapacity) {
    list = new String[initialCapacity];
    size = 0;
    capacity = initialCapacity;
  }

  public int capacity() {
    return capacity;
  }

  public int size() {
    return size;
  }

  public void add(String val) {
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

  public void set(int index, String value) {
    expandIfNecessary(index);
    for (int i = size; i > index; i--) {
      list[i] = list[i - 1];
    }
    list[index] = value;
    if (index > size)
      size = index + 1;
  }

  private void expandIfNecessary(int index) {
    if (index < capacity)
      return;
    int newCapacity = capacity * 2 + index;
    String[] oldArray = list;
    list = new String[newCapacity];
    for (int i = 0; i < size; i++)
      list[i] = oldArray[i];
    capacity = newCapacity;
  }

  public String get(int index) {
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
  public void add(int index, String value) {
    // TODO Auto-generated method stub
  }

}
