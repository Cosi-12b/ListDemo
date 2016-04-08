package edu.brandeis.cosi12b.listdemo;

public abstract class AbstractList<E extends Comparable<E>> implements List<E> {
  public void add(E value) {
    add(size(), value);
  }
  
  public boolean contains(E value) {
    return indexOf(value) >= 0;
  }

  public boolean isEmpty() {
    return size() == 0;
  }
}
