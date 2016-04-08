package edu.brandeis.cosi12b.listdemo;

import java.util.NoSuchElementException;

public class LinkedList<E extends Comparable<E>> extends AbstractList<E> implements List<E> {
  private ListNode<E> front;

  public LinkedList() {
    front = null;
  }

  // Adds the given value to the end of the list.
  public void add(E value) {
    if (front == null) {
      // adding to an empty list
      front = new ListNode<E>(value);
    } else {
      // adding to the end of an existing list
      ListNode<E> current = front;
      while (current.next != null) {
        current = current.next;
      }
      current.next = new ListNode<E>(value);
    }
  }

  // Returns value in list at given index
  // Precondition: 0 <= index < size()
  // Pretty inefficient, eh?
  public E get(int index) {
    ListNode<E> current = front;
    for (int i = 0; i < index; i++) {
      current = current.next;
    }
    return current.word;
  }

  // Inserts the given value at the given index.
  // Precondition: 0 <= index <= size()
  public void add(int index, E value) {
    if (index == 0) {
      // adding to an empty list
      front = new ListNode<E>(value, front);
    } else {
      // inserting into an existing list
      ListNode<E> current = front;
      for (int i = 0; i < index - 1; i++) {
        current = current.next;
      }
      current.next = new ListNode<E>(value, current.next);
    }
  }

  // Removes and returns the first value.
  // Throws a NoSuchElementException on empty list.
  public E remove() {
    if (front == null) {
      throw new NoSuchElementException();
    } else {
      E result = front.word;
      front = front.next;
      return result;
    }
  }

  // Removes value at given index from list.
  // Precondition: 0 <= index < size()
  public void remove(int index) {
    if (index == 0) {
      // special case: removing first element
      front = front.next;
    } else {
      // removing from elsewhere in the list
      ListNode<E> current = front;
      for (int i = 0; i < index - 1; i++) {
        current = current.next;
      }
      current.next = current.next.next;
    }
  }

  public String toString() {
    if (front == null) {
      return "[]";
    } else {
      String result = "[" + front.word;
      ListNode<E> current = front.next;
      while (current != null) {
        result += ", " + current.word;
        current = current.next;
      }
      result += "]";
      return result;
    }
  }

  public int size() {
    int count = 0;
    ListNode<E> current = front;
    while (current != null) {
      current = current.next;
      count++;
    }
    return count;
  }

  // Adds given value to list in sorted order.
  // Precondition: Existing elements are sorted

  public void addSorted(E value) {
    if (front == null || value.compareTo(front.word) <= 0) {
      // insert at front of list
      front = new ListNode<E>(value, front);
    } else {
      // insert in middle of list
      ListNode<E> current = front;
      while (current.next != null && current.next.word.compareTo(value) < 0) {
        current = current.next;
      }
      current.next = new ListNode<E>(value, current.next);
    }
  }

  public int length() {
    ListNode<E> current = front;
    int count = 0;
    while (current != null) {
      count++;
      current = current.next;
    }
    return count;
  }

  public boolean isEmpty() {
    return length() == 0;
  }

  @Override
  public int indexOf(E value) {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public void set(int index, E value) {
    // TODO Auto-generated method stub

  }

}
