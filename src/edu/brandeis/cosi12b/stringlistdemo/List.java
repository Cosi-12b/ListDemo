package edu.brandeis.cosi12b.stringlistdemo;

//  represents an abstraction of a list of Strings

public interface List<E> {
  
  public void add(E value);

  public void add(int index, E value);

  public E get(int index);

  public int indexOf(E value);

  public boolean isEmpty();

  public void remove(int index);

  public void set(int index, E value);

  public int size();
}
