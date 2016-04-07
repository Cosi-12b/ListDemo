package edu.brandeis.cosi12b.stringlistdemo;

//  represents an abstraction of a list of Strings

public interface StringList {
  public void add(String value);

  public void add(int index, String value);

  public String get(int index);

  public int indexOf(String value);

  public boolean isEmpty();

  public void remove(int index);

  public void set(int index, String value);

  public int size();
}
