package edu.brandeis.cosi12b.stringlistdemo;

public class ListNode<E> {
  E word;
  ListNode<E> next;
  
  public ListNode() {
    this(null, null);
  }
  
  public ListNode(E word) {
    this(word, null);
  }
  
  public ListNode(E word, ListNode<E> next) {
    this.word = word;
    this.next = next;
  }
}